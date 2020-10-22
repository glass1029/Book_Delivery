package com.group.books.controllers;

import com.group.books.entities.NoticeVO;
import com.group.books.services.NoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class NoticeController {

    @Autowired
    NoticeService noticeService;

    @RequestMapping(value = "/notice", method = RequestMethod.GET)   //공지사항
    public String notice(Model model, NoticeVO vo){
        //데이터 조회
        List<NoticeVO> noticeList = noticeService.getNoticeList(vo);
        model.addAttribute("noticeList", noticeList);

        return "notice";
    };

    @RequestMapping(value= "/noticeDetail", method = RequestMethod.GET)
    public String noticeDetail(Model model, NoticeVO vo){
        //선택한 공지의 아이디값 가져오기
        int notice_id = vo.getNotice_id();
        vo.setNotice_id(notice_id);
        noticeService.updateNoticeHit(vo); //조회수 증가

        NoticeVO notice = noticeService.getOneNotice(vo); //조회 : 공지사항 상세정보
        model.addAttribute("notice", notice);

        return "noticeDetail";
    }

    @RequestMapping("/noticeWrite")    //공지사항 작성페이지로~
    public String noticeWrite(){
        return "noticeWrite";
    }

    @RequestMapping("/noticeInsert")   //공지글 입력
    public String noticeInsert(NoticeVO vo){
        noticeService.noticeInsert(vo);
        return "redirect:/notice";
    }

    @RequestMapping(value = "/noticeModify", method = RequestMethod.GET)   //공지글 수정할페이지로 이동
    public String noticeModify(Model model, NoticeVO vo){
        NoticeVO notice = noticeService.getOneNotice(vo);
        model.addAttribute("notice", notice);
        return "noticeUpdate";
    }

    @RequestMapping("/noticeUpdate")   //공지글 수정 처리
    public String noticeUpdate(NoticeVO vo){
        noticeService.noticeUpdate(vo);
        return "redirect:/notice";
    }

    @RequestMapping("/noticeDelete")   //공지글 삭제
    public String noticeDelete(NoticeVO vo){
        noticeService.noticeDelete(vo);
        return "redirect:/notice";
    }

}
