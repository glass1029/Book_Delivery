package com.group.books.repos;

import com.group.books.entities.MemberVO;
import com.group.books.entities.RentalVO;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository("myPageDAO")
public interface MyPageDAO {
    //나의 대여정보 관리
    List<RentalVO> getMyRentalList(RentalVO vo);
    void returnUpdate(RentalVO vo);
    void extendUpdate(RentalVO vo);

    //비번 체크
    MemberVO pwLogin(MemberVO vo);

    //나의 정보 관리
    MemberVO getMyInfo(MemberVO vo); //조회
    void myInfoUpdate(MemberVO vo); // 정보 수정


}
