package com.group.books.controllers;


import com.group.books.entities.BooksVO;
import com.group.books.entities.MemberVO;
import com.group.books.services.MemberServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class MembersController {

    @Autowired
    MemberServices memberServices;

    @RequestMapping(value = "/memberss", method = RequestMethod.GET)   //멤버목록
    public String member(Model model, MemberVO vo, @RequestParam(defaultValue="1") int curPage){

        //데이터 조회
        List<MemberVO> memberList = memberServices.getMemberList(vo);
        model.addAttribute("memberList", memberList);

        return "memberss";
    }
    @RequestMapping(value = "/memberView", method = RequestMethod.GET)
    public String MemberView(Model model, MemberVO vo, @RequestParam(defaultValue = "1")int curPage){
        MemberVO member = memberServices.getOneMember(vo);
        List<BooksVO> book_name = memberServices.getBook_name(vo);
        model.addAttribute("member", member);
        model.addAttribute("book_name", book_name);

        model.addAttribute("searchCondition",vo.getSearchCondition());
        model.addAttribute("searchKeyword",vo.getSearchKeyword());

        return "/memberView";
    }


}
