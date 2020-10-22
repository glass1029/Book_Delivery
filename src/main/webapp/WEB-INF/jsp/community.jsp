<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
    <style>
        #detail {
            text-decoration: none;
            color: #4e73df;
        }
        #detail:hover {
            background-color: #4e73df;
            color: white;
        }
        #btn {
            border: 2px solid #5a5c69;
            border-radius: 8px;
            background-color: #5a5c69;
            color: #f8f9fc;
            font-size: 0.9em;
            margin-right: 20px;
        }
        #btn:hover {
            border: 2px solid #4e73df;
            background-color: #4e73df;
            color: white;
        }
        #write { text-align: right; }
    </style>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>세상의 모든 도서관</title>

    <!-- Custom fonts for this template -->
    <link href="/static/vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">
    <link href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="/static/css/sb-admin-2.min.css" rel="stylesheet">

    <!-- Custom styles for this page -->
    <link href="/static/vendor/datatables/dataTables.bootstrap4.min.css" rel="stylesheet">

</head>

<body id="page-top">

<!-- Page Wrapper -->
<div id="wrapper">

    <!-- Sidebar -->
    <ul class="navbar-nav bg-gradient-primary sidebar sidebar-dark accordion" id="accordionSidebar">

        <!-- Sidebar - Brand -->
        <a class="sidebar-brand d-flex align-items-center justify-content-center" href="main">
            <div class="sidebar-brand-icon rotate-n-15">
                <i class="fas fa-laugh-wink"></i>
            </div>
            <div class="sidebar-brand-text mx-3">세모 도서관</div>
        </a>

        <!-- Divider -->
        <hr class="sidebar-divider">

        <!-- Heading -->
        <div class="sidebar-heading">
            카테고리
        </div>

        <!-- Nav Item - 공지사항 -->
        <li class="nav-item">
            <a class="nav-link" href="/notice">
                <i class="fas fa-fw fa-table"></i>
                <span>공지사항</span></a>
        </li>

        <!-- Nav Item - 도서 -->
        <li class="nav-item">
                    <a class="nav-link collapsed" href="#" data-toggle="collapse" data-target="#collapsePages" aria-expanded="true" aria-controls="collapsePages">
                        <i class="fas fa-fw fa-folder"></i>
                        <span>도서</span>
                    </a>
                    <div id="collapsePages" class="collapse" aria-labelledby="headingPages" data-parent="#accordionSidebar">
                        <div class="bg-white py-2 collapse-inner rounded">
                            <h6 class="collapse-header">도서 메뉴</h6>
                            <a class="collapse-item" href="/books">도서검색 및 대출신청</a>
                            <a class="collapse-item" href="/books/booksRecent">신간도서</a>
                        </div>
                    </div>
                </li>

        <!-- Nav Item - 커뮤니티 -->
        <li class="nav-item">
            <a class="nav-link" href="/community">
                <i class="fas fa-fw fa-table"></i>
                <span>커뮤니티</span></a>
        </li>

        <!-- Nav Item - 건의사항 -->
        <li class="nav-item">
            <a class="nav-link" href="/suggest">
                <i class="fas fa-fw fa-wrench"></i>
                <span>건의사항</span></a>
        </li>

        <!-- Divider -->
        <hr class="sidebar-divider">

        <!-- Heading -->
        <div class="sidebar-heading">
            회원
        </div>

        <!--로그인 안했을 때 보여지는 부분-->
        <div id="loginNo">
            <!-- Nav Item - 회원가입 -->
            <li class="nav-item">
                <a class="nav-link" href="/member/register">
                    <i class="fas fa-fw fa-cog"></i>
                    <span>회원가입</span></a>
            </li>

            <!-- Nav Item - 로그인 -->
            <li class="nav-item">
                <a class="nav-link" href="/auth/login">
                    <i class="fas fa-fw fa-cog"></i>
                    <span>로그인</span></a>
            </li>
        </div>
        <!--로그인 안했을 때 보여지는 부분-->

        <!--로그인 했을 때 보여지는 부분-->
        <div id="loginOk">
            <!-- Nav Item - 마이페이지 -->
            <li class="nav-item">
                <a class="nav-link collapsed" href="#" data-toggle="collapse" data-target="#collapseUtilities" aria-expanded="true" aria-controls="collapseUtilities">
                    <i class="fas fa-fw fa-cog"></i>
                    <span>마이페이지</span>
                </a>
                <div id="collapseUtilities" class="collapse" aria-labelledby="headingUtilities" data-parent="#accordionSidebar">
                    <div class="bg-white py-2 collapse-inner rounded">
                        <h6 class="collapse-header">마이페이지 메뉴</h6>
                        <a class="collapse-item" href="#" id="myInfo">내 정보 수정</a>
                        <a class="collapse-item" href="#" id="myRental">내가 대여한 도서</a>
                        <a class="collapse-item" href="#" id="myCommunity">나의 커뮤니티글</a>
                        <a class="collapse-item" href="#" id="mySuggest">나의 건의사항</a>
                    </div>
                </div>
            </li>

            <!-- Nav Item - 로그아웃 -->
            <li class="nav-item" id="logout">
                <a href="#" class="nav-link" onClick="logout()"><i class="fas fa-fw fa-cog"></i><span> 로그아웃</span></a>
            </li>
        </div>
        <!--로그인 했을 때 보여지는 부분-->

        <!--관리자 로그인 했을 때 보여지는 부분-->
        <div id="loginAdmin">
            <!-- Divider -->
            <hr class="sidebar-divider">

            <!-- Heading -->
            <div class="sidebar-heading">
                관리자
            </div>

            <!-- Nav Item - 관리자 -->
            <li class="nav-item" id="adminMenu">
                <a class="nav-link collapsed" href="#" data-toggle="collapse" data-target="#collapseTwo" aria-expanded="true" aria-controls="collapseTwo">
                    <i class="fas fa-fw fa-cog"></i>
                    <span>관리자</span>
                </a>
                <div id="collapseTwo" class="collapse" aria-labelledby="headingTwo" data-parent="#accordionSidebar">
                    <div class="bg-white py-2 collapse-inner rounded">
                        <h6 class="collapse-header">관리자 메뉴</h6>
                        <a class="collapse-item" href="/memberss">회원 조회</a>
                        <a class="collapse-item" href="/adminBooks">도서 현황 조회</a>
                        <a class="collapse-item" href="/insertBooks">도서 등록</a>
                        <a class="collapse-item" href="/deleteBooks">도서 삭제</a>
                        <a class="collapse-item" href="/readyBooks">도서 반납 처리</a>
                    </div>
                </div>
            </li>
        </div>
        <!--관리자 로그인 했을 때 보여지는 부분-->

        <!-- Divider -->
        <hr class="sidebar-divider d-none d-md-block">

        <!-- Sidebar Toggler (Sidebar) -->
        <div class="text-center d-none d-md-inline">
            <button class="rounded-circle border-0" id="sidebarToggle"></button>
        </div>

    </ul>
    <!-- End of Sidebar -->

    <!-- Content Wrapper -->
    <div id="content-wrapper" class="d-flex flex-column">

        <!-- Main Content -->
        <div id="content">

            <!-- Topbar -->
            <nav class="navbar navbar-expand navbar-light bg-white topbar mb-4 static-top shadow">

                <!-- Sidebar Toggle (Topbar) -->
                <form class="form-inline">
                    <button id="sidebarToggleTop" class="btn btn-link d-md-none rounded-circle mr-3">
                        <i class="fa fa-bars"></i>
                    </button>
                </form>

                <!-- Topbar Navbar -->
                <ul class="navbar-nav ml-auto">

                    <!-- Nav Item - User Information -->
                    <li class="nav-item dropdown no-arrow">
                        <div id="ment"><h5>로그인이 필요합니다.</h5></div>
                    </li>

                </ul>

            </nav>
            <!-- End of Topbar -->

            <!-- Begin Page Content -->
            <div class="container-fluid">

                <!-- Page Heading -->
                <h1 class="h3 mb-2 text-gray-800">커뮤니티</h1>
                <p class="mb-4">도서후기, 기억에 남는 구절을 말머리로 선택하여 글을 작성할 수 있습니다.</p>

                <!-- DataTales Example -->
                <div class="card shadow mb-4">
                    <div class="card-header py-3">
                        <h6 class="m-0 font-weight-bold text-primary">게시판</h6>
                    </div>
                    <div class="card-body">
                        <div class="table-responsive">
                            <form method="get" name="frm">
                            <table data-order='[[0, "desc"]]'  class="table table-bordered" id="dataTable" width="100%" cellspacing="0">
        <thead>
        <tr>
            <th width="8%">글 번호</th>
            <th width="13%">말머리</th>
            <th width="20%">도서 제목</th>
            <th width="30%">글 제목</th>
            <th width="10%">작성자</th>
            <th width="10%">작성일자</th>
            <th width="10%">조회수</th>
        </tr>
        </thead>
        <tbody>
        <c:if test="${ empty communityList}">
            <tr><td colspan="8">작성한글이 없습니다.</td></tr>
        </c:if>
        <c:if test="${ not empty communityList}">
            <c:forEach items="${ communityList}" var="community">
              <tr>
                    <td>
                   		${community.community_id}
					</td>
					
                    <td>
                    	${community.category}
					</td>
                    
                	<td>${community.book_name}</td>

                    <td>
                        <a href="/bookReview?community_id=${community.community_id}" id="detail">${community.title}</a>
                    </td>

                    <td>${community.id}</td>
                    
                    <td>${community.regdate}</td>
                    
                    <td>${community.hit}</td>
                                       
                                       
                        <%-- <c:if test="${ empty searchCondition && empty searchKeyword}">
                            <a href="/booksDetail?curPage=${ paging.curPage}&book_id=${book.book_id}">${book.book_name}</a>
                        </c:if>
                        <c:if test="${ not empty searchCondition && not empty searchKeyword}">
                            <a href="/booksDetail?searchCondition=${ searchCondition}&searchKeyword=${ searchKeyword}
                                &curPage=${ paging.curPage}&book_id=${book.book_id}">${book.book_name}</a>
                        </c:if> --%>
                </tr>
            </c:forEach>
        </c:if>
        </tbody>
        <tfoot>
        <tr>
            <td colspan="7">
            	<div id="write">

			        <input type="button" id="btn" value="글쓰기" onclick="button1_click(this.form)"> 
<!-- 			 		<A href = "insertCommunity" target = "insertCommunity" >글쓰기</A>
 -->
        		</div>
                <%-- <ol class="paging">
                    [이전으로] 사용여부
                    <c:choose>
                        <c:when test="${ paging.startPage == 1}">   첫번째 블록인 경우 hidden
                            <li class="disable">이전으로</li>
                        </c:when>
                        <c:otherwise>
                            <li>
                                <a href="/books?curPage=${ paging.startPage-1}">이전으로</a>
                            </li>
                        </c:otherwise>
                    </c:choose>

                    시작페이지~끝페이지
                    <c:forEach var="pageNo" begin="${ paging.startPage}" end="${ paging.endPage}">
                        <c:choose>
                            <c:when test="${ pageNo == paging.curPage}">
                                <li class="now">${ pageNo}</li>
                            </c:when>
                            <c:otherwise>
                                <li>
                                    <a href="/books?curPage=${pageNo}">${pageNo}</a>
                                </li>
                            </c:otherwise>
                        </c:choose>
                    </c:forEach>

                    [다음으로] 사용여부
                    <c:choose>
                        <c:when test="${ paging.endPage >= paging.pageCnt}">   마지막 블록인 경우 hidden
                            <li class="disable">다음으로</li>
                        </c:when>
                        <c:otherwise>
                            <li><a href="/books?curPage=${ paging.endPage+1}">다음으로</a> </li>
                        </c:otherwise>
                    </c:choose>
                </ol> --%>
            </td>
        </tr>
        </tfoot>
    </table>
                            </form>
                        </div>
                    </div>
                </div>

            </div>
            <!-- /.container-fluid -->

        </div>
        <!-- End of Main Content -->

        <!-- Footer -->
        <footer class="sticky-footer bg-white">
            <div class="container my-auto">
                <div class="copyright text-center my-auto">
                    <span>Copyright &copy; 세모 도서관
                    <br>서울특별시 강남구 강남로123 세모도서관</span>
                </div>
            </div>
        </footer>
        <!-- End of Footer -->

    </div>
    <!-- End of Content Wrapper -->

</div>
<!-- End of Page Wrapper -->

<!-- Scroll to Top Button-->
<a class="scroll-to-top rounded" href="#page-top">
    <i class="fas fa-angle-up"></i>
</a>

<!-- Logout Modal-->
<div class="modal fade" id="logoutModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title" id="exampleModalLabel">Ready to Leave?</h5>
                <button class="close" type="button" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">×</span>
                </button>
            </div>
            <div class="modal-body">Select "Logout" below if you are ready to end your current session.</div>
            <div class="modal-footer">
                <button class="btn btn-secondary" type="button" data-dismiss="modal">Cancel</button>
                <a class="btn btn-primary" href="login.html">Logout</a>
            </div>
        </div>
    </div>
</div>

<!-- Bootstrap core JavaScript-->
<script src="/static/vendor/jquery/jquery.min.js"></script>
<script src="/static/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

<!-- Core plugin JavaScript-->
<script src="/static/vendor/jquery-easing/jquery.easing.min.js"></script>

<!-- Custom scripts for all pages-->
<script src="/static/js/sb-admin-2.min.js"></script>

<!-- Page level plugins -->
<script src="/static/vendor/datatables/jquery.dataTables.min.js"></script>
<script src="/static/vendor/datatables/dataTables.bootstrap4.min.js"></script>

<!-- Page level custom scripts -->
<script src="/static/js/demo/datatables-demo.js"></script>

<script>
    //로그인 세션 가져오기
    let loginId = sessionStorage.getItem("loginId");    //ID
    let memberId = sessionStorage.getItem("memberId");  //MEMBER_ID

    if (loginId === null){
        alert("로그인이 필요합니다.")
        document.location.href="/auth/login"
    }

    //==========사이드바 기능==========
    //미로그인 시 사이드바 수정
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

</script>

<script>
function button1_click(frm){
	var isInsert1 = confirm
	if(isInsert1){
		frm.action = "/insertCommunity";
		frm.submit();
	}
}

function chk(book_id){
    if(loginId !== null){
        document.location.href="/communityDetail?community_id=${community.community_id}&member_id="+memberId;
    }
}

/* function button1_click(frm) {
    var xhr = new XMLHttpRequest();
    xhr.onreadystatechange = function() {
        if (xhr.readyState === xhr.DONE) {
           if (xhr.status === 200 || xhr.status === 201) {
              if(xhr.response.length > 0){
                 var communityList = document.getElementById("communityList");
                 
                 while(communityList.firstChild){
                    communityList.removeChild(communityList.firstChild)
                 }
              }
           }
        }
    }
} */
</script>

</body>

</html>