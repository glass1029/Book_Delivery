package com.group.books.entities;

import org.apache.ibatis.type.Alias;

@Alias("booksVO")
public class BooksVO {
    private int book_id;
    private String book_name;
    private String writer;
    private String publisher;
    private double score;
    private String review;
    private String state;
    private String name;
    private String rental_date;
    private String return_deadline;
    private int is_extended;
    private int arrear;
    private int rental_id;
    private int member_id;
    private String id;
    private int memberId;
    private String searchCondition; //검색
    private String searchKeyword;
    private int startIndex; //페이징처리
    private int cntPerPage;

    public BooksVO() {
    }

    public int getBook_id() {
        return book_id;
    }

    public void setBook_id(int book_id) {
        this.book_id = book_id;
    }

    public String getBook_name() {
        return book_name;
    }

    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    //커뮤니티 컬럼
    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    //렌탈 컬럼
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getRental_date() {
        return rental_date;
    }

    public void setRental_date(String rental_date) {
        this.rental_date = rental_date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getReturn_deadline() {
        return return_deadline;
    }

    public void setReturn_deadline(String return_deadline) {
        this.return_deadline = return_deadline;
    }

    public int getIs_extended() {
        return is_extended;
    }

    public void setIs_extended(int is_extended) {
        this.is_extended = is_extended;
    }

    public int getArrear() {
        return arrear;
    }

    public void setArrear(int arrear) {
        this.arrear = arrear;
    }

    public int getRental_id() {
        return rental_id;
    }

    public void setRental_id(int rental_id) {
        this.rental_id = rental_id;
    }

    public int getMember_id() {
        return member_id;
    }

    public void setMember_id(int member_id) {
        this.member_id = member_id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    //검색
    public String getSearchCondition() {
        return searchCondition;
    }

    public void setSearchCondition(String searchCondition) {
        this.searchCondition = searchCondition;
    }

    public String getSearchKeyword() {
        return searchKeyword;
    }

    public void setSearchKeyword(String searchKeyword) {
        this.searchKeyword = searchKeyword;
    }

    //페이징
    public int getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }

    public int getCntPerPage() {
        return cntPerPage;
    }

    public void setCntPerPage(int cntPerPage) {
        this.cntPerPage = cntPerPage;
    }
}
