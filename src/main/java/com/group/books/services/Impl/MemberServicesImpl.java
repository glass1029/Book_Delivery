package com.group.books.services.Impl;

import com.group.books.entities.BooksVO;
import com.group.books.entities.MemberVO;
import com.group.books.repos.MemberDAO;
import com.group.books.services.MemberServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("memberServices")
public class MemberServicesImpl implements MemberServices {

    @Autowired
    private MemberDAO memberDAO;

    @Override
    public List<MemberVO> getMemberList(MemberVO vo){
        List<MemberVO> memberList = memberDAO.getMemberList(vo);
        return memberList;
    }
    @Override
    public int getMemberCount(MemberVO vo){
        int totalCount = memberDAO.getMemberCount(vo);
        return totalCount;
    }

    @Override
    public List<BooksVO> getBook_name(MemberVO vo) {
        List<BooksVO> getBook_name = memberDAO.getBook_name(vo);
        return getBook_name;
    }


    @Override
    public MemberVO getOneMember(MemberVO vo){
        MemberVO member = memberDAO.getOneMember(vo);
        return member;
    }
}
