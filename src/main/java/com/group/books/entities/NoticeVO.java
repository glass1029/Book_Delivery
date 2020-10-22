package com.group.books.entities;

import org.apache.ibatis.type.Alias;

@Alias("noticeVO")
public class NoticeVO {

    private int notice_id;
    private String title;
    private int member_id;
    private String content;
    private String regdate;
    private int hit;

    public NoticeVO() {
    }

    public int getNotice_id() {
        return notice_id;
    }

    public void setNotice_id(int notice_id) {
        this.notice_id = notice_id;
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

    public int getHit() {
        return hit;
    }

    public void setHit(int hit) {
        this.hit = hit;
    }

    @Override
    public String toString() {
        return "NoticeVO{" +
                "notice_id=" + notice_id +
                ", title='" + title + '\'' +
                ", member_id=" + member_id +
                ", content='" + content + '\'' +
                ", regdate='" + regdate + '\'' +
                ", hit=" + hit +
                '}';
    }
}