package com.group.books.controllers;

import com.group.books.entities.Books;
import com.group.books.services.BookListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookListController {

    private final BookListService bookListService;


    @Autowired
    public BookListController(BookListService bookListService) {
        this.bookListService = bookListService;
    }


    // @route   GET api/book
    // @desc    Get all books
    // @access  Public
    @GetMapping(value = "/api/books")
    public ResponseEntity<List<Books>> getAllBooks() {
        try {
            return new ResponseEntity<>(bookListService.getAllBooks(), HttpStatus.OK);

        } catch (Exception err) {
            System.out.println(err.getMessage());
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}