package com.group.books.entities;

import org.apache.ibatis.type.Alias;

@Alias("answerVO")
public class AnswerVO {
    private int answer_id;
    private int suggest_id;
    private  int member_id;
    private String content;
    private String regdate;
    private String name;

    public AnswerVO() {
    }

    public int getAnswer_id() {
        return answer_id;
    }

    public void setAnswer_id(int answer_id) {
        this.answer_id = answer_id;
    }

    public int getSuggest_id() {
        return suggest_id;
    }

    public void setSuggest_id(int suggest_id) {
        this.suggest_id = suggest_id;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "AnswerVO{" +
                "answer_id=" + answer_id +
                ", suggest_id=" + suggest_id +
                ", member_id=" + member_id +
                ", content='" + content + '\'' +
                ", regdate='" + regdate + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
