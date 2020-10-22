package com.group.books.services;


import com.group.books.entities.CommentsVO;
import com.group.books.entities.CommunityVO;
import com.group.books.entities.SuggestVO;

import java.util.List;

public interface MyWriteService {

    List<CommentsVO> getCommentsList(CommentsVO vo);
    List<CommunityVO> getCommunityList(CommunityVO vo);
    List<SuggestVO> getSuggestList(SuggestVO vo);
}
