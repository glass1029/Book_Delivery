package com.group.books.repos;

import com.group.books.entities.CommentsVO;
import com.group.books.entities.CommunityVO;
import org.springframework.stereotype.Repository;

@Repository("bookReviewDAO")
public interface BookReviewDAO {
	
	CommunityVO getbookReview(CommunityVO communityVO);

	void deleteCommunity(CommunityVO communityVO);
	
	void updateCommunity(CommunityVO communityVO);

	void updateReviewHit(CommunityVO communityVO);
	void deleteComment(CommentsVO vo);
	void insertComment(CommentsVO vo);
}
