package com.cts.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.model.Book;
import com.cts.repository.BookRepository;

@Service
public class BookService {
 
    @Autowired
    private BookRepository repo;
 
    public List<Book> getAllBooks() {
        List<Book> list = repo.findAll();
        return list;
    }

}