package com.group.books.repos;

import com.group.books.entities.BooksVO;
import com.group.books.entities.CommentsVO;
import com.group.books.entities.CommunityVO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("communityDAO")
public interface CommunityDAO {

	List<CommunityVO> getCommunityList(CommunityVO vo);
	List<BooksVO> getBooksList(BooksVO vo);
	void deleteCommunity(CommunityVO vo);
	void updateCommunity(CommunityVO vo);
	List<BooksVO> getBooksLists(BooksVO vo);
	List<CommentsVO> getCommentList(CommunityVO vo);
	void deleteComment(CommentsVO vo);
	void insertComment(CommentsVO vo);
	void updateCommunityHit(CommunityVO vo);

	CommunityVO getOneCommunity(CommunityVO vo);
	
}
