package com.group.books.controllers;


import com.group.books.entities.BooksVO;
import com.group.books.services.MoveBooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;


@Controller
public class MoveBooksController {

    @Autowired
    MoveBooksService moveBooksService;

    @RequestMapping(value = "/bookDelete")
    public String bookDelete(Model model, BooksVO vo){
        moveBooksService.deleteBook(vo);
        return "redirect:books";
    }
    @RequestMapping(value = "/deleteBooks", method = RequestMethod.GET)
    public String books(Model model, BooksVO vo){
        List<BooksVO> booksList = moveBooksService.getBooksList(vo);
        model.addAttribute("booksList", booksList);
        return "deleteBooks";
    }

    @RequestMapping(value = "/insertBooks", method = RequestMethod.GET)
    public String insertBooks(Model model, BooksVO vo, @RequestParam(defaultValue = "1")int curPage){
        return "insertBooks";
    }

    @RequestMapping(value = "/bookInsert")
    public String bookInsert(Model model, BooksVO vo){
        moveBooksService.insertBook(vo);

        return "redirect:books";
    }
}