package com.group.books.controllers;

import com.group.books.entities.*;
import com.group.books.services.BookReviewService;
import com.group.books.services.BooksService;
import com.group.books.services.CommunityService;
import com.group.books.services.MemberServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
public class BookReviewController {

	@Autowired
	public BookReviewService bookReviewService;
	BooksService booksService;
	MemberServices memberServices;

	@RequestMapping(value = "/bookReview", method = RequestMethod.GET )
	public String bookReview (Model model, CommunityVO communityVO, HttpServletRequest request, HttpServletResponse response) {
		
		//조회수 증가
		bookReviewService.updateReviewHit(communityVO);
		
		CommunityVO review = bookReviewService.getbookReview(communityVO);
		model.addAttribute("review", review);
		
		return "/bookReview";
	}
	//게시물 삭제
	@RequestMapping(value = "/deleteCommunity")
	public String deleteCommunity (Model model, CommunityVO communityVO) {

		bookReviewService.deleteCommunity(communityVO);

		return "redirect:community";
	}
	//게시물 수정페이지
	@RequestMapping(value="/modifyCommunity", method = {RequestMethod.GET,RequestMethod.POST} )
	public String modifyCommunity (Model model, CommunityVO communityVO) {

		CommunityVO modify = bookReviewService.getbookReview(communityVO);
		model.addAttribute("modify", modify);

		return "updateCommunity";
	}
	//게시물 수정
	@RequestMapping(value = "/updateCommunity", method = {RequestMethod.GET,RequestMethod.POST})
	public String updateCommunity(Model model, CommunityVO communityVO) {

		bookReviewService.updateCommunity(communityVO);

		return "redirect:community";

	}
	//글작성(책검색)
	@RequestMapping(value = "/bookSearch", method = {RequestMethod.GET,RequestMethod.POST})
	public String bookSearch(Model model, BooksVO vo) {

		return "insertCommunity";
	}

	@RequestMapping(value="/bookSearchPage", method = {RequestMethod.GET,RequestMethod.POST} )
	public String bookSearchPage (Model model, BooksVO vo) {
		List<BooksVO> booksList = booksService.getBooksList(vo);
		model.addAttribute("booksList", booksList);
		return "bookSearchPage";
	}

	@RequestMapping(value = "/insertCommunity", method = {RequestMethod.GET,RequestMethod.POST})
	public String insertCommunity(Model model, BooksVO BooksVO, @RequestParam(defaultValue = "1")int curPage) {
		BooksVO book = booksService.getOneBook(BooksVO);
		model.addAttribute("book", book);
		return "insertCommunity";
	}

	
}
