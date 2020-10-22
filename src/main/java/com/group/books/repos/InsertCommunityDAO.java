package com.group.books.repos;

import com.group.books.entities.CommunityVO;
import org.springframework.stereotype.Repository;

@Repository("insertCommunityDAO")
public interface InsertCommunityDAO {
	void insertCommunity(CommunityVO communityVO);

	void getInsertCommunity(CommunityVO communityVO);

	
}
