package com.group.books.services.Impl;

import com.group.books.entities.BooksVO;
import com.group.books.entities.CommentsVO;
import com.group.books.entities.CommunityVO;
import com.group.books.repos.BookReviewDAO;
import com.group.books.services.BookReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("bookReview")
public class BookReviewServicelmpl implements BookReviewService{
	
	@Autowired
	private BookReviewDAO bookReviewDAO;
	//상세보기
	@Override
	public CommunityVO getbookReview(CommunityVO communityVO) {
		CommunityVO review = bookReviewDAO.getbookReview(communityVO);
		
		return review;
	}
	//게시물 삭제
	@Override
	public void deleteCommunity(CommunityVO communityVO) {
//		int delete = 
				
		bookReviewDAO.deleteCommunity(communityVO);
		
//		return delete;
	}
//	@Override
//	public CommunityVO updateReview(CommunityVO communityVO) {
//		CommunityVO update = bookReviewDAO.updateReview(communityVO);
//		
//		return update;
//	}
	//게시물 수정
	@Override
	public void updateCommunity(CommunityVO communityVO) {
		bookReviewDAO.updateCommunity(communityVO);
		
	}
	//조회수 증가
	@Override
	public void updateReviewHit(CommunityVO communityVO) {
		bookReviewDAO.updateReviewHit(communityVO);
		
	}

	@Override
	public void deleteComment(CommentsVO vo) {bookReviewDAO.deleteComment(vo);}

	@Override
	public void insertComment(CommentsVO vo)  {
		bookReviewDAO.insertComment(vo);
	}

}
