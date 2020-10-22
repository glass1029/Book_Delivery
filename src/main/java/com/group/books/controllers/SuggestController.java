package com.group.books.controllers;

import com.group.books.entities.AnswerVO;
import com.group.books.entities.Member;
import com.group.books.entities.PagingVO;
import com.group.books.entities.SuggestVO;
import com.group.books.services.SuggestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class SuggestController {

    @Autowired
    SuggestService suggestService;

    @RequestMapping(value = "/suggest", method = RequestMethod.GET) //건의사항 게시글 조회
    public String getSuggestList(Model model, SuggestVO vo, @RequestParam(defaultValue="1") int curPage){
        //페이징 처리
        int listCnt = suggestService.getSuggestCount(vo);   //검색결과 데이터 갯수
        PagingVO paging = new PagingVO(listCnt, curPage);
        vo.setStartIndex(paging.getStartIndex());
        vo.setCntPerPage(paging.getPageSize());
        model.addAttribute("listCnt", listCnt);
        model.addAttribute("paging", paging);

        //데이터 조회
        List<SuggestVO> suggestList = suggestService.getSuggestList(vo);
        model.addAttribute("suggestList", suggestList);

        //검색 키워드 정보
        model.addAttribute("searchCondition",vo.getSearchCondition());
        model.addAttribute("searchKeyword",vo.getSearchKeyword());

        return "suggest";
    }

    @RequestMapping(value = "/suggestDetail", method = RequestMethod.GET)   //건의사항 게시글 상세보기
    public String getSuggestOne(Model model, SuggestVO vo){
        //데이터 조회
        SuggestVO suggest = suggestService.getSuggestOne(vo);
        model.addAttribute("suggest", suggest);
        suggestService.updateSuggestHit(vo);    //조회수 1증가

        //댓글 조회
        List<AnswerVO> answers = suggestService.getAnswerList(vo);
        model.addAttribute("answers", answers);

        return "suggestDetail";
    }

    @RequestMapping(value = "/answerInsert", method=RequestMethod.POST) //댓글 입력
    public String insertAnswer(AnswerVO vo){
        suggestService.insertAnswer(vo);

        return "redirect:/suggestDetail?suggest_id="+vo.getSuggest_id();
    }

    @RequestMapping(value = "/answerDelete", method = RequestMethod.GET)    //댓글 삭제
    public String deleteAnswer(AnswerVO vo){
        suggestService.deleteAnswer(vo);

        return "redirect:/suggestDetail?suggest_id="+vo.getSuggest_id();
    }

    @RequestMapping("/suggestWrite")    //건의사항 글쓰기 페이지 이동
    public String writeSuggest(){
        return "suggestWrite";
    }

    @RequestMapping("/suggestInsert")   //건의사항 글 입력
    public String insertSuggest(Model model, SuggestVO vo){
        suggestService.insertSuggest(vo);
        return "redirect:/suggest";
    }

    @RequestMapping(value = "/suggestModify", method = RequestMethod.GET)   //건의사항 수정 페이지 이동
    public String modifySuggest(Model model, SuggestVO vo){
        SuggestVO suggest = suggestService.getSuggestOne(vo);
        model.addAttribute("suggest", suggest);
        return "suggestModify";
    }

    @RequestMapping("/suggestUpdate")   //건의사항 글 수정
    public String updateSuggest(SuggestVO vo){
        suggestService.updateSuggest(vo);
        return "redirect:/suggestDetail?suggest_id="+vo.getSuggest_id();
    }

    @RequestMapping("/suggestDelete")    //건의사항 글 삭제
    public String deleteSuggest(SuggestVO vo){
        suggestService.deleteSuggest(vo);
        return "redirect:/suggest";
    }
}
