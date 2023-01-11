package com.brunocamps.coursedemo.Course.Demo.controllers;

import com.brunocamps.coursedemo.Course.Demo.repositories.BookRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BookController  {

    private final BookRepository bookRepository;

    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @RequestMapping("/books")
    public String getBooks(Model model){

        // when Spring gets a request to the URL
        // it's going to execute the getBooks method and it's going to have a model
        // object and our code is saying: for that model we're going to add the attribute
        // called books
        model.addAttribute("books", bookRepository.findAll());

        return "books/list";
    }
}
