package com.group.books.services;


import com.group.books.entities.BooksVO;
import com.group.books.entities.MemberVO;

import java.util.List;

public interface MemberServices {
    List<MemberVO> getMemberList(MemberVO vo);
    MemberVO getOneMember(MemberVO vo);
    int getMemberCount(MemberVO vo);
    List<BooksVO> getBook_name(MemberVO vo);
}
