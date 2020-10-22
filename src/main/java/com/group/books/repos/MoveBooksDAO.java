package com.group.books.repos;

import com.group.books.entities.BooksVO;
import com.group.books.entities.RentalVO;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository("deleteBooksDAO")
public interface MoveBooksDAO {
    List<BooksVO> getBooksList(BooksVO vo);
    void deleteBook(BooksVO vo);
    void insertBook(BooksVO vo);
    BooksVO getOneBook(BooksVO vo);
    BooksVO getScore(BooksVO vo);
    List<BooksVO> getReviews(BooksVO vo);
    RentalVO getState(BooksVO vo);
    void insertRental(RentalVO rvo);
}
