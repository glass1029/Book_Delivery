package com.group.books.controllers;

import com.group.books.entities.BooksVO;
import com.group.books.entities.CommunityVO;
import com.group.books.services.InsertCommunityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class InsertCommunityController {

	@Autowired
	InsertCommunityService insertCommunityService;
	
	
	@RequestMapping(value = "/communityInsert", method = {RequestMethod.GET,RequestMethod.POST})
	public String CommunityInsert(Model model, CommunityVO CommunityVO, @RequestParam(defaultValue = "1")int curPage){
		insertCommunityService.insertCommunity(CommunityVO);
		return "redirect:community";
		
	}
	
}
