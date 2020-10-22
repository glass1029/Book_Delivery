package com.group.books.repos;

import com.group.books.entities.CommentsVO;
import com.group.books.entities.CommunityVO;
import com.group.books.entities.SuggestVO;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("myWriteDAO")
public interface MyWriteDAO {
    List<CommentsVO> getCommentsList(CommentsVO vo);
    List<CommunityVO> getCommunityList(CommunityVO vo);
    List<SuggestVO> getSuggestList(SuggestVO vo);
}
