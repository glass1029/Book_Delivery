package com.group.books.services.Impl;

import com.group.books.entities.NoticeVO;
import com.group.books.repos.NoticeDAO;
import com.group.books.services.NoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("noticeService")
public class NoticeServiceImpl implements NoticeService {

    @Autowired
    private NoticeDAO noticeDAO;

    @Override
    public List<NoticeVO> getNoticeList(NoticeVO vo) {
        List<NoticeVO> noticeList = noticeDAO.getNoticeList(vo);
        return noticeList;
    }

    @Override
    public NoticeVO getOneNotice(NoticeVO vo) {
        NoticeVO notice = noticeDAO.getOneNotice(vo);
        return notice;
    }

    @Override
    public void noticeInsert(NoticeVO vo) {
        noticeDAO.noticeInsert(vo);
    }

    @Override
    public void noticeUpdate(NoticeVO vo) {
        noticeDAO.noticeUpdate(vo);
    }

    @Override
    public void noticeDelete(NoticeVO vo) {
        noticeDAO.noticeDelete(vo);
    }

    @Override
    public void updateNoticeHit(NoticeVO vo) {
        noticeDAO.updateNoticeHit(vo);
    }

}
