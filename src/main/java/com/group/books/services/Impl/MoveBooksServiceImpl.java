package com.group.books.services.Impl;

import com.group.books.entities.BooksVO;
import com.group.books.entities.RentalVO;
import com.group.books.repos.MoveBooksDAO;
import com.group.books.services.MoveBooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("deleteBooksService")
public class MoveBooksServiceImpl implements MoveBooksService {

    @Autowired
    private MoveBooksDAO moveBooksDAO;

    @Override
    public void deleteBook(BooksVO vo) {
        moveBooksDAO.deleteBook(vo);
    }


    @Override
    public void insertBook(BooksVO vo) {
        moveBooksDAO.insertBook(vo);
    }

    @Override
    public List<BooksVO> getBooksList(BooksVO vo) {
        List<BooksVO> booksList = moveBooksDAO.getBooksList(vo);
        return booksList;
    }

    @Override
    public BooksVO getOneBook(BooksVO vo) {
        BooksVO book = moveBooksDAO.getOneBook(vo);
        return book;
    }

    @Override
    public BooksVO getScore(BooksVO vo) {
        BooksVO score = moveBooksDAO.getScore(vo);
        return score;
    }

    @Override
    public List<BooksVO> getReviews(BooksVO vo) {
        List<BooksVO> reviews = moveBooksDAO.getReviews(vo);
        return reviews;
    }

    @Override
    public RentalVO getState(BooksVO vo) {
        RentalVO state = moveBooksDAO.getState(vo);
        return state;
    }

    @Override
    public void insertRental(RentalVO rvo) {
        moveBooksDAO.insertRental(rvo);
    }

}
