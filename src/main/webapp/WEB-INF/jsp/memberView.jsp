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
                <h1 class="h3 mb-2 text-gray-800">회원 상세 정보</h1>
                <p class="mb-4">회원 상세정보를 볼 수 있습니다. <br> 회원이 빌려간 도서목록까지 볼 수 있습니다.</p>

                <!-- DataTales Example -->
                <div class="card shadow mb-4">
                    <div class="card-header py-3">
                        <h6 class="m-0 font-weight-bold text-primary">회원 상세 정보</h6>
                    </div>
                    <div class="card-body">
                        <div class="table-responsive">
                            <table class="table table-bordered" id="dataTable" width="100%" cellspacing="0">
                                <tbody>
                                <tr>
                                    <th>아이디</th>
                                    <td>${ member.id}
                                        <input type="hidden" name="member_id" value="${ member.id}">
                                    </td>
                                </tr>
                                <tr>
                                    <th>이름</th>
                                    <td>${ member.name}</td>
                                </tr>
                                <tr>
                                    <th>주소</th>
                                    <td>${ member.address}</td>
                                </tr>
                                <tr>
                                    <th>이메일</th>
                                    <td>${ member.email}</td>
                                </tr>
                                <tr>
                                    <th>전화번호</th>
                                    <td>${ member.phone}</td>
                                </tr>
                                <tr>
                                    <th>대출 중 도서</th>
                                    <td>
                                        <ul>
                                            <c:if test="${ empty book_name}">
                                                <li>대출도서 없음 </li>
                                            </c:if>
                                            <c:if test="${ not empty book_name}">
                                                <c:forEach items="${ book_name}" var="book_name">
                                                    <li>${ book_name.book_name}</li>
                                                </c:forEach>
                                            </c:if>
                                        </ul>
                                    </td>
                                </tr>
                                </tbody>
                            </table>
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
<script src="/static/vendor/chart.js/Chart.min.js"></script>

<!-- Page level custom scripts -->
<script src="/static/js/demo/chart-area-demo.js"></script>
<script src="/static/js/demo/chart-pie-demo.js"></script>

<%--사이드바 설정--%>
<script src="static/js/sideBar.js" type="text/javascript"></script>


<script type="text/javascript">
    //로그인 세션 가져오기
    let loginId = sessionStorage.getItem("loginId");    //ID
    let memberId = sessionStorage.getItem("memberId");  //MEMBER_ID


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

            function insertBook(frm){
                var isInsert = confirm
                if(isInsert){
                    alert("도서등록 성공")
                    frm.action = "/bookInsert";
                    frm.submit();
                }
            }
        </script>
    </div>
</div>
</body>

</html>