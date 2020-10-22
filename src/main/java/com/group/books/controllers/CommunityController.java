package com.group.books.controllers;

import com.group.books.entities.CommentsVO;
import com.group.books.entities.CommunityVO;
import com.group.books.services.CommunityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;


@Controller
public class CommunityController {

	@Autowired
	private CommunityService communityService;
	
	@RequestMapping(value = "/community", method = RequestMethod.GET)
	private String selectCommunityList(Model model, CommunityVO vo, HttpServletRequest request, HttpServletResponse response) {

		List<CommunityVO> communityList = communityService.getCommunityList(vo);
		model.addAttribute("communityList", communityList);
		
		System.out.println(communityList);
	    return "community";
	}


}
