package com.group.books.services;

import com.group.books.entities.CommentsVO;
import com.group.books.entities.CommunityVO;

import java.util.List;


public interface CommunityService {
    List<CommunityVO> getCommunityList(CommunityVO vo);
    void deleteCommunity(CommunityVO vo);

    void updateCommunity(CommunityVO vo);

    CommunityVO getOneCommunity(CommunityVO vo);

    void deleteComment(CommentsVO vo);

    void insertComment(CommentsVO vo);
    List<CommentsVO> getCommentList(CommunityVO vo);

    void updateCommunityHit(CommunityVO vo);
}
