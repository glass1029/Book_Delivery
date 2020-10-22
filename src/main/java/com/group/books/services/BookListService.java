package com.group.books.services;

import com.group.books.entities.Books;
import com.group.books.repos.BookListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookListService {

    @Autowired
    private BookListRepository repo;

    public List<Books> getAllBooks() {
        return repo.findAll();
    }
}
