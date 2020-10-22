//로그인 세션 가져오기
let loginId = sessionStorage.getItem("loginId");    //ID
let memberId = sessionStorage.getItem("memberId");  //MEMBER_ID

//마이페이지에서 대여한도서 조회시 로긴한 memberId 정보 확인
if (memberId !== null) {
    document.getElementById('myRental').innerHTML='<a class="collapse-item" href="/myRental?member_id='+memberId+'" id="myRental">내가 대여한 도서</a>';
}

//마이페이지 내정보수정하기 클릭시 로긴한 memberId 정보 확인
if (memberId !== null) {
    document.getElementById('myInfo').innerHTML='<a class="collapse-item" href="/checkGo?member_id='+memberId+'" id="myInfo">내 정보 수정</a>';
}

//마이페이지 내가쓴글(커뮤니티) 조회시 로그인한 memberId 정보확인
if (memberId !== null) {
    document.getElementById('myCommunity').innerHTML='<a class="collapse-item" href="/myCommunity?member_id='+memberId+'" id="myCommunity">내가 쓴 글 조회</a>';
}

//마이페이지 내가쓴글(건의사항) 조회시 로그인한 memberId 정보확인
if (memberId !== null) {
    document.getElementById('mySuggest').innerHTML='<a class="collapse-item" href="/mySuggest?member_id='+memberId+'" id="mySuggest">내가 쓴 건의</a>';
}



//미로그인 시 사이드바 수정
if (loginId === null){
    document.getElementById('loginOk').innerHTML='';
}

//로그인 성공 시 상단 안내 멘트, 사이드바 수정
if (loginId !== null){
    welcome();
    document.getElementById('loginNo').innerHTML='';
}

//관리자 로그인 성공 시 사이드바 수정
if (loginId !== 'admin'){
    document.getElementById('loginAdmin').innerHTML='';
}

//로그인 시 상단에 문구 표시
function welcome() {
    console.log(loginId);
    document.getElementById('ment').innerHTML = '<h5>' + loginId + ' 님 환영합니다!</h5>';
}

//로그아웃 버튼 클릭
function logout() {
    sessionStorage.clear();
    document.location.href="/main"
}



