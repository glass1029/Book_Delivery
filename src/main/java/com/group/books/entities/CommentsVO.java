package com.group.books.entities;

import org.apache.ibatis.type.Alias;

@Alias("CommentsVO")
public class CommentsVO {
    private int comment_id;
    private int community_id;
    private int member_id;
    private String id;
    private String content;
    private String regdate;
    private String searchCondition; //검색
    private String searchKeyword;
    private int startIndex; //페이징처리
    private int cntPerPage;

    public int getComment_id() { return comment_id;}

    public void setComment_id(int comment_id) { this.comment_id = comment_id;}

    public int getCommunity_id() {
        return community_id;
    }

    public void setCommunity_id(int community_id) {
        this.community_id = community_id;
    }

    public int getMember_id() {
        return member_id;
    }

    public void setMember_id(int member_id) {
        this.member_id = member_id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getRegDate() {
        return regdate;
    }

    public void setRegDate(String regDate) {
        this.regdate = regDate;
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
                "community_id" + comment_id +'\'' +
                "community_id" + community_id +'\'' +
                ", member_id" + member_id +'\'' +
                ", content" + content +'\'' +
                ", regDate" + regdate +'\'' +
                ", searchCondition='" + searchCondition + '\'' +
                ", searchKeyword='" + searchKeyword + '\'' +
                ", startIndex=" + startIndex +
                ", cntPerPage=" + cntPerPage +
                '}';
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
