package com.group.books.entities;

import javax.persistence.*;

@Entity
@Table(name="books")
public class Books {

    @Id
    @SequenceGenerator(name="my_entity_seq_gen", sequenceName="GLOBAL_SEQUENCE", initialValue=0, allocationSize = 1)
    @GeneratedValue(strategy= GenerationType.AUTO, generator="my_entity_seq_gen")
    @Column(name="book_id")
    private int bookId;

    @Column(name="book_name")
    private String bookName;

    @Column(name="writer")
    private String writer;

    @Column(name="publisher")
    private String publisher;

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
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
}