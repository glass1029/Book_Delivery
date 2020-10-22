package com.group.books.services;

import com.group.books.entities.BooksVO;
import com.group.books.entities.RentalVO;

import java.util.List;

public interface AdminBooksService {
    List<BooksVO> getAdminBooksList(BooksVO vo);
    int getAdminBooksCount(RentalVO vo);
    List<RentalVO> getRentalList(RentalVO vo);
    int getRentalCount(RentalVO vo);
    void updateBooks(RentalVO rvo);
}
