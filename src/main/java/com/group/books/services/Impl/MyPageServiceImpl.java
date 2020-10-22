package com.group.books.services.Impl;

import com.group.books.entities.MemberVO;
import com.group.books.entities.RentalVO;
import com.group.books.repos.MyPageDAO;
import com.group.books.services.MyPageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service("myPageService")
public class MyPageServiceImpl implements MyPageService {

    @Autowired
    private MyPageDAO myPageDAO;

    @Override
    public List<RentalVO> getMyRentalList(RentalVO vo) {
        List<RentalVO> myRentalList = myPageDAO.getMyRentalList(vo);
        return myRentalList;
    }

    @Override
    public void returnUpdate(RentalVO vo) {
        myPageDAO.returnUpdate(vo);
    }

    @Override
    public void extendUpdate(RentalVO vo) {
        myPageDAO.extendUpdate(vo);
    }

    @Override
    public MemberVO getMyInfo(MemberVO vo) {
        MemberVO member = myPageDAO.getMyInfo(vo);
        return member;
    }

    @Override
    public void myInfoUpdate(MemberVO vo) {
        myPageDAO.myInfoUpdate(vo);
    }

    @Override
    public MemberVO pwLogin(MemberVO vo) {
        return myPageDAO.pwLogin(vo);
    }
}
