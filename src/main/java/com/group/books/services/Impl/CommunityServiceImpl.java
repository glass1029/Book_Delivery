package com.group.books.services.Impl;

import com.group.books.entities.CommentsVO;
import com.group.books.entities.CommunityVO;
import com.group.books.repos.CommunityDAO;
import com.group.books.services.CommunityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service("communityService")
public class CommunityServiceImpl implements CommunityService{
	
	@Autowired
	private CommunityDAO communityDAO;

	@Override
	public List<CommunityVO> getCommunityList(CommunityVO vo) {
		List<CommunityVO> communityList = communityDAO.getCommunityList(vo);
		return communityList;
	}

	@Override
	public List<CommentsVO> getCommentList(CommunityVO vo) {
		List<CommentsVO> commentList = communityDAO.getCommentList(vo);
		return commentList;
	}

	@Override
	public void deleteComment(CommentsVO vo) {
		communityDAO.deleteComment(vo);
	}

	@Override
	public void insertComment(CommentsVO vo) {
		communityDAO.insertComment(vo);
	}



	@Override
	public void deleteCommunity(CommunityVO vo) {
//		int delete =

		communityDAO.deleteCommunity(vo);

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
	public void updateCommunity(CommunityVO vo) {
		communityDAO.updateCommunity(vo);

	}
	//조회수 증가
	@Override
	public void updateCommunityHit(CommunityVO vo) {
		communityDAO.updateCommunityHit(vo);

	}

	@Override
	public CommunityVO getOneCommunity(CommunityVO vo) {
		CommunityVO community = communityDAO.getOneCommunity(vo);
		return community;
	}


}
