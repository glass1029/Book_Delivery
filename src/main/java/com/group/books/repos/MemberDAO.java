package com.group.books.repos;


import com.group.books.entities.BooksVO;
import com.group.books.entities.MemberVO;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("memberDAO")
public interface MemberDAO {
    List<MemberVO> getMemberList(MemberVO vo);
    int getMemberCount(MemberVO vo);
    MemberVO getOneMember(MemberVO vo);
    List<BooksVO> getBook_name(MemberVO vo);
    int member_id(MemberVO mvo);
}
