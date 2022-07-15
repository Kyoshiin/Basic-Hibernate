package com.cts.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.model.Author;
import com.cts.repository.AuthorRepository;

@Service
public class AuthorService {

    @Autowired
    private AuthorRepository repo;
 
    public List<Author> getAllAuthors() {
        List<Author> list = repo.findAll();
        return list;
    }
}
