package com.group.books.controllers;

import com.group.books.entities.CommentsVO;
import com.group.books.entities.CommunityVO;
import com.group.books.entities.SuggestVO;
import com.group.books.services.MyWriteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class MyWriteController {

    @Autowired
    MyWriteService myWriteService;

    @RequestMapping(value = "/myComments", method = {RequestMethod.GET, RequestMethod.POST})
    public String getCommentList(Model model, CommentsVO vo){
        List<CommentsVO> commentsList = myWriteService.getCommentsList(vo);
        model.addAttribute("commentsList", commentsList);
        return "myComments";
    }


    @RequestMapping(value = "/myCommunity", method = {RequestMethod.GET, RequestMethod.POST}) //건의사항 게시글 조회
    public String getCommunityList(Model model, CommunityVO vo){

        //데이터 조회
        List<CommunityVO> communityList = myWriteService.getCommunityList(vo);
        model.addAttribute("communityList", communityList);
        return "myCommunity";
    }


    @RequestMapping(value = "/mySuggest", method = {RequestMethod.GET, RequestMethod.POST}) //건의사항 게시글 조회
    public String getSuggestList(Model model, SuggestVO vo){
        //페이징 처리

        //데이터 조회
        List<SuggestVO> suggestList = myWriteService.getSuggestList(vo);
        model.addAttribute("suggestList", suggestList);
        return "mySuggest";
    }
}
