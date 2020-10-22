package com.group.books.services;

import com.group.books.entities.BooksVO;
import com.group.books.entities.MemberVO;
import com.group.books.entities.RentalVO;

import java.util.List;

public interface BooksService {
    List<BooksVO> getBooksList(BooksVO vo);
    int getBooksCount(BooksVO vo);
    BooksVO getOneBook(BooksVO vo);
    BooksVO getScore(BooksVO vo);
    List<BooksVO> getReviews(BooksVO vo);
    RentalVO getState(BooksVO vo);
    void insertRental(RentalVO rvo);
    int getRentalCnt(RentalVO rvo);
}
