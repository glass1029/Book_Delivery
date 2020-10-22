package com.group.books.repos;

import com.group.books.entities.NoticeVO;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("noticeDAO")
public interface NoticeDAO {
    List<NoticeVO> getNoticeList(NoticeVO vo);
    NoticeVO getOneNotice(NoticeVO vo);
    void noticeInsert(NoticeVO vo);
    void noticeUpdate(NoticeVO vo);
    void noticeDelete(NoticeVO vo);
    void updateNoticeHit(NoticeVO vo);
}
