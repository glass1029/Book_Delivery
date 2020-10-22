package com.group.books.entities;

import org.apache.ibatis.type.Alias;

@Alias("rentalVO")
public class RentalVO {
    private int rental_id;
    private int book_id;
    private String rental_date;
    private String return_deadline;
    private int is_extended;
    private String state;
    private int arrear;
    private int member_id;
    private String return_date;
    private String book_name;
    private String writer;
    private String publisher;
    private String name;
    private String rental_list;

    public int getRental_id() {
        return rental_id;
    }

    public void setRental_id(int rental_id) {
        this.rental_id = rental_id;
    }

    public int getBook_id() {
        return book_id;
    }

    public void setBook_id(int book_id) {
        this.book_id = book_id;
    }

    public String getRental_date() {
        return rental_date;
    }

    public void setRental_date(String rental_date) {
        this.rental_date = rental_date;
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

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getArrear() {
        return arrear;
    }

    public void setArrear(int arrear) {
        this.arrear = arrear;
    }

    public int getMember_id() {
        return member_id;
    }

    public void setMember_id(int member_id) {
        this.member_id = member_id;
    }

    public String getReturn_date() {
        return return_date;
    }

    public void setReturn_date(String return_date) {
        this.return_date = return_date;
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

    @Override
    public String toString() {
        return "RentalVO{" +
                "rental_id=" + rental_id +
                ", book_id=" + book_id +
                ", rental_date='" + rental_date + '\'' +
                ", return_deadline='" + return_deadline + '\'' +
                ", is_extended=" + is_extended +
                ", state='" + state + '\'' +
                ", arrear=" + arrear +
                ", member_id=" + member_id +
                ", return_date='" + return_date + '\'' +
                ", book_name='" + book_name + '\'' +
                ", writer='" + writer + '\'' +
                ", publisher='" + publisher + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRental_list() {
        return rental_list;
    }

    public void setRental_list(String rental_list) {
        this.rental_list = rental_list;
    }
}