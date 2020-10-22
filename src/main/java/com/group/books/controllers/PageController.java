package com.group.books.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PageController {

    @RequestMapping(value="/", method = RequestMethod.GET)
    public String index() { return "thymeleaf/main"; }

    @RequestMapping(value = "/main", method = RequestMethod.GET)
    String main(){
        return "thymeleaf/main";
    }

    @RequestMapping(value="/member/register")
    public String register() {
        return "thymeleaf/member/register";
    }

    @RequestMapping(value="/member/findId")
    public String findId() {
        return "thymeleaf/member/findId";
    }

    @RequestMapping(value="/member/resetPassword")
    public String resetPassword() {
        return "thymeleaf/member/resetPassword";
    }

    @RequestMapping(value="/auth/login")
    public String login() {
        return "thymeleaf/auth/login";
    }

    @RequestMapping(value="/books/booksRecent")
    public String booksRecent() {
        return "thymeleaf/books/booksRecent";
    }


}
