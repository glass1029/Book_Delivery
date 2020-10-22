package com.group.books.services;


import com.group.books.entities.BooksVO;
import com.group.books.entities.RentalVO;

import java.util.List;

public interface MoveBooksService {
    void deleteBook(BooksVO vo);
    List<BooksVO> getBooksList(BooksVO vo);
    void insertBook(BooksVO vo);
    BooksVO getOneBook(BooksVO vo);
    BooksVO getScore(BooksVO vo);
    List<BooksVO> getReviews(BooksVO vo);
    RentalVO getState(BooksVO vo);
    void insertRental(RentalVO rvo);
}
