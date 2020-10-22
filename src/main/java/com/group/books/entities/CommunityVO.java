package com.group.books.entities;

import org.apache.ibatis.type.Alias;

@Alias("CommunityVO")
public class CommunityVO {
    private int community_id;
    private String category;
    private String title;
    private int member_id;
    private double score;
    private String review;
    private String content;
    private String regdate;
    private int book_id;
    private String searchCondition; //검색
    private String searchKeyword;
    private int startIndex; //페이징처리
    private int cntPerPage;
    private String id;
    private String book_name;
    private int hit;
    private int memberId;

    public int getCommunity_id() {
        return community_id;
    }

    public void setCommunity_id(int community_id) {
        this.community_id = community_id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getMember_id() {
        return member_id;
    }

    public void setMember_id(int member_id) {
        this.member_id = member_id;
    }

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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getRegdate() {
        return regdate;
    }

    public void setRegdate(String regdate) {
        this.regdate = regdate;
    }

    public int getBook_id() {
        return book_id;
    }

    public void setBook_id(int book_id) {
        this.book_id = book_id;
    }

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

    @Override
    public String toString() {
        return "SuggestVO{" +
                "community_id" + community_id +'\'' +
                ", category" + category +'\'' +
                ", title" + title +'\'' +
                ", member_id" + member_id +'\'' +
                ", score" + score +'\'' +
                ", review" +  review +'\'' +
                ", content" + content +'\'' +
                ", regDate" + regdate +'\'' +
                ", book_id" + book_id +'\'' +
                ", searchCondition='" + searchCondition + '\'' +
                ", searchKeyword='" + searchKeyword + '\'' +
                ", startIndex=" + startIndex +
                ", cntPerPage=" + cntPerPage +
                '}';
    }

    public String getId() { return id;}
    public void setId(String id) { this.id = id;}

    public String getBook_name() {
        return book_name;
    }

    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }

    public int getHit() {
        return hit;
    }

    public void setHit(int hit) {
        this.hit = hit;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }
}
