package com.cts.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cts.model.Author;
import com.cts.service.AuthorService;

@Controller
public class AuthorController {

    @Autowired
    private AuthorService service;

    @ResponseBody
    @RequestMapping(value = "/listAuthors", method = RequestMethod.GET)
    public String getAllAuthors() {
        List<Author> list = service.getAllAuthors();
        return list.toString();
    }
}
