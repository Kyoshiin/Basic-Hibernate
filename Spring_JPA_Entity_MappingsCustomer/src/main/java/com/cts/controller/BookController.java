package com.cts.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cts.model.Book;
import com.cts.service.BookService;

@Controller
public class BookController {

    @Autowired
    private BookService service;

    @ResponseBody
    @RequestMapping(value = "/listBooks", method = RequestMethod.GET)
    public String getAllBooks() {
        List<Book> list = service.getAllBooks();
        return list.toString();
    }

}