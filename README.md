# 공공도서관 도서 배달 서비스 프로젝트
20.09.14~20.10.08 도서관의 도서를 배달해주는 프로젝트를 진행하였습니다.

## 구성
1. /src/main/java/com/group/books/
  - Configs : 보안 및 기타 설정
  - Controllers : 컨트롤러
  - Entities : DTO(VO)
  - Repos : DAO
  - Services : 서비스

2. /src/main/resources/mybatis/
  - mapper : Mybatis mapper.xml

3. /src/main/webapp/WEB-INF/
  - jsp : 뷰

## 담당한 파트 : 도서 검색 및 대출 신청, 건의사항 게시판
  - Controllers : BooksController.java / SuggestController.java
  - Entities : AnswerVO.java / BooksVO.java / pagingVO.java / RentalVO.java / SuggestVO.java
  - Repos : BooksDAO.java / SuggestDAO,java
  - Services : BooksService.java / SuggestService.java / BooksServiceImpl.java / SuggestServiceImpl.java
  - mapper : booksMapper.xml / suggestMapper.xml
  - jsp : books.jsp / booksDetail.jsp / suggest.jsp / suggestDetail.jsp / suggestModify.jsp / suggestWrite.jsp
