package com.group.books.services;

import com.group.books.entities.MemberVO;
import com.group.books.entities.RentalVO;

import java.util.List;
import java.util.Map;

public interface MyPageService {
    List<RentalVO> getMyRentalList(RentalVO vo);

    void returnUpdate(RentalVO vo);

    void extendUpdate(RentalVO vo);

    //--------------------------

    MemberVO getMyInfo(MemberVO vo);
    void myInfoUpdate(MemberVO vo);

    MemberVO pwLogin(MemberVO vo);
}
