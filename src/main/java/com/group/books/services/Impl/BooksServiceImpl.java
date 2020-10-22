package com.group.books.services.Impl;

import com.group.books.entities.BooksVO;
import com.group.books.entities.MemberVO;
import com.group.books.entities.RentalVO;
import com.group.books.repos.BooksDAO;
import com.group.books.services.BooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("booksService")
public class BooksServiceImpl implements BooksService {
    @Autowired
    private BooksDAO booksDAO;
    @Override
    public List<BooksVO> getBooksList(BooksVO vo) {
        List<BooksVO> booksList = booksDAO.getBooksList(vo);
        return booksList;
    }
    @Override
    public int getBooksCount(BooksVO vo) {
        int totalCount = booksDAO.getBooksCount(vo);
        return totalCount;
    }

    @Override
    public BooksVO getOneBook(BooksVO vo) {
        BooksVO book = booksDAO.getOneBook(vo);
        return book;
    }

    @Override
    public BooksVO getScore(BooksVO vo) {
        BooksVO score = booksDAO.getScore(vo);
        return score;
    }

    @Override
    public List<BooksVO> getReviews(BooksVO vo) {
        List<BooksVO> reviews = booksDAO.getReviews(vo);
        return reviews;
    }

    @Override
    public RentalVO getState(BooksVO vo) {
        RentalVO state = booksDAO.getState(vo);
        return state;
    }

    @Override
    public int getRentalCnt(RentalVO rvo) {
        int rentalCnt = booksDAO.getRentalCnt(rvo);
        return rentalCnt;
    }

    @Override
    public void insertRental(RentalVO rvo) {
        booksDAO.insertRental(rvo);
    }

}
