package com.group.books.services;

import com.group.books.entities.NoticeVO;

import java.util.List;

public interface NoticeService {
    List<NoticeVO> getNoticeList(NoticeVO vo);

    NoticeVO getOneNotice(NoticeVO vo);

    void noticeInsert(NoticeVO vo);

    void noticeUpdate(NoticeVO vo);

    void noticeDelete(NoticeVO vo);

    void updateNoticeHit(NoticeVO vo);
}
