package com.group.books.repos;

import com.group.books.entities.BooksVO;
import com.group.books.entities.RentalVO;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("adminBooksDAO")
public interface AdminBooksDAO {
    List<BooksVO> getAdminBooksList(BooksVO vo);
    int getAdminBooksCount(RentalVO vo);
    List<RentalVO> getRentalList(RentalVO vo);
    int getRentalCount(RentalVO vo);
    void updateBooks(RentalVO rvo);
}
