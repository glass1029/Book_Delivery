package com.group.books.services.Impl;

import com.group.books.entities.CommentsVO;
import com.group.books.entities.CommunityVO;
import com.group.books.entities.SuggestVO;
import com.group.books.repos.MyWriteDAO;
import com.group.books.services.MyWriteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("myCommentsService")
class MyWriteServiceImpl implements MyWriteService {

    @Autowired
    private MyWriteDAO myWriteDAO;

    @Override
    public List<CommentsVO> getCommentsList(CommentsVO vo) {
        List<CommentsVO> commentsList = myWriteDAO.getCommentsList(vo);
        return commentsList;
    }
    @Override
    public List<CommunityVO> getCommunityList(CommunityVO vo) {
        List<CommunityVO> communityList = myWriteDAO.getCommunityList(vo);
        return communityList;
    }
    @Override
    public List<SuggestVO> getSuggestList(SuggestVO vo) {
        List<SuggestVO> suggestList = myWriteDAO.getSuggestList(vo);
        return suggestList;
    }
}
