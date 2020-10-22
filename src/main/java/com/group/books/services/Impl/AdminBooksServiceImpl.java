package com.group.books.services.Impl;

import com.group.books.entities.BooksVO;
import com.group.books.entities.RentalVO;
import com.group.books.repos.AdminBooksDAO;
import com.group.books.services.AdminBooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("adminBooksService")
public class AdminBooksServiceImpl implements AdminBooksService {

    @Autowired
    AdminBooksDAO adminBooksDAO;

    @Override
    public List<BooksVO> getAdminBooksList(BooksVO vo) {
        List<BooksVO> adminBooksList = adminBooksDAO.getAdminBooksList(vo);
        return adminBooksList;
    }

    @Override
    public int getAdminBooksCount(RentalVO vo) {
        int adminBooksCount = adminBooksDAO.getAdminBooksCount(vo);
        return adminBooksCount;
    }
    @Override
    public List<RentalVO> getRentalList(RentalVO vo) {
        List<RentalVO> rentalList = adminBooksDAO.getRentalList(vo);
        return rentalList;
    }

    @Override
    public int getRentalCount(RentalVO vo) {
        int totalCount = adminBooksDAO.getRentalCount(vo);
        return totalCount;
    }

    @Override
    public void updateBooks(RentalVO rvo) {
        adminBooksDAO.updateBooks(rvo);
    }
}
