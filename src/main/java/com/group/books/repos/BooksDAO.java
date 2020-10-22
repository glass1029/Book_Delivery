package com.group.books.repos;

import com.group.books.entities.BooksVO;
import com.group.books.entities.MemberVO;
import com.group.books.entities.RentalVO;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("booksDAO")
public interface BooksDAO {
    List<BooksVO> getBooksList(BooksVO vo);
    int getBooksCount(BooksVO vo);
    BooksVO getOneBook(BooksVO vo);
    BooksVO getScore(BooksVO vo);
    List<BooksVO> getReviews(BooksVO vo);
    RentalVO getState(BooksVO vo);
    void insertRental(RentalVO rvo);
    int getRentalCnt(RentalVO rvo);
}
