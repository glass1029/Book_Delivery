package com.group.books.services.Impl;

import com.group.books.entities.CommunityVO;
import com.group.books.repos.InsertCommunityDAO;
import com.group.books.services.InsertCommunityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("insertCommunityService")
public class InsertCommunityServicelmpl implements InsertCommunityService {

	@Autowired
	private InsertCommunityDAO insertCommunityDAO;
	
	@Override
	public void insertCommunity(CommunityVO communityVO) {
		insertCommunityDAO.insertCommunity(communityVO);
	}
	
	@Override
	public void getInsertCommunity(CommunityVO communityVO) {
		insertCommunityDAO.getInsertCommunity(communityVO);
	}
	
}
