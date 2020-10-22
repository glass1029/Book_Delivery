package com.group.books.controllers;

import com.group.books.entities.BooksVO;
import com.group.books.entities.RentalVO;
import com.group.books.services.AdminBooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class AdminBooksController {

    @Autowired
    AdminBooksService adminBooksService;

    @RequestMapping(value = "/adminBooks", method = RequestMethod.GET)   //도서
    public String adminBooks(Model model, BooksVO vo){

        //데이터 조회
        List<BooksVO> adminBooksList = adminBooksService.getAdminBooksList(vo);
        model.addAttribute("adminBooksList", adminBooksList);

        return "adminBooks";
    }


    @RequestMapping(value = "/readyBooks", method = RequestMethod.GET)
    public String getRentalList(Model model, RentalVO vo)  {
        //데이터 조회
        List<RentalVO> rentalList = adminBooksService.getRentalList(vo);
        model.addAttribute("rentalList", rentalList);
        return "readyBooks";
    };

    @RequestMapping(value = "/backBooks", method = RequestMethod.GET)
    String backBooks(Model model, RentalVO rvo){

        String a[] = rvo.getRental_list().split(",");

        for (int i = 0; i < a.length; ++i){
            rvo.setRental_id(Integer.parseInt(a[i]));

            adminBooksService.updateBooks(rvo);
        }

        return "redirect:readyBooks";
    };

}
