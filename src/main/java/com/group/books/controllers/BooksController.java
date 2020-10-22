package com.group.books.controllers;

import com.group.books.entities.BooksVO;
import com.group.books.entities.PagingVO;
import com.group.books.entities.RentalVO;
import com.group.books.services.BooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class BooksController {

    @Autowired
    BooksService booksService;

    @RequestMapping(value = "/books", method = RequestMethod.GET)   //도서 목록
    public String books(Model model, BooksVO vo, @RequestParam(defaultValue="1") int curPage){
        //페이징 처리
        int listCnt = booksService.getBooksCount(vo);   //검색결과 데이터 갯수
        PagingVO paging = new PagingVO(listCnt, curPage);
        vo.setStartIndex(paging.getStartIndex());
        vo.setCntPerPage(paging.getPageSize());
        model.addAttribute("listCnt", listCnt);
        model.addAttribute("paging", paging);

        //데이터 조회
        List<BooksVO> booksList = booksService.getBooksList(vo);
        model.addAttribute("booksList", booksList);

        //검색 키워드 정보
        model.addAttribute("searchCondition",vo.getSearchCondition());
        model.addAttribute("searchKeyword",vo.getSearchKeyword());

        return "books";
    };

    @RequestMapping(value = "/booksDetail", method = RequestMethod.GET)   //도서 상세보기
    public String booksDetail(Model model, BooksVO vo, RentalVO rvo){
        BooksVO book = booksService.getOneBook(vo); //도서 정보
        BooksVO score = booksService.getScore(vo);  //도서 평점 평균
        List<BooksVO> reviews = booksService.getReviews(vo);    //도서 리뷰 목록
        RentalVO state = booksService.getState(vo); //대출 상태, 반납 예상일
        int rentalCnt = booksService.getRentalCnt(rvo); //회원이 대출 중인 도서 권수 카운트
        model.addAttribute("book", book);
        model.addAttribute("score", score);
        model.addAttribute("reviews", reviews);
        model.addAttribute("state", state);
        model.addAttribute("rentalCnt", rentalCnt);

        return "booksDetail";
    };

    @RequestMapping(value = "/bookRental")   //도서 대출신청
    public String bookRental(Model model, RentalVO rvo){
        booksService.insertRental(rvo);

        return "redirect:/booksDetail?book_id="+ rvo.getBook_id();
    };

}
