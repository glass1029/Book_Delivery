package com.group.books.services;

import com.group.books.entities.BooksVO;
import com.group.books.entities.CommentsVO;
import com.group.books.entities.CommunityVO;

public interface BookReviewService {
	
	CommunityVO getbookReview(CommunityVO communityVO);

	void deleteCommunity(CommunityVO communityVO);
	
	void updateCommunity(CommunityVO communityVO);
	
	void updateReviewHit(CommunityVO communityVO);

	void deleteComment(CommentsVO vo);

	void insertComment(CommentsVO vo);

}
