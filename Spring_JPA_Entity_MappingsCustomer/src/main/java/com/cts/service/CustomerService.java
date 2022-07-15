package com.cts.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.model.Customer;
import com.cts.repository.CustomerRepository;

@Service
public class CustomerService {
 
    @Autowired
    private CustomerRepository repo;
 
    public List<Customer> getAllCustomers() {
        List<Customer> list = repo.findAll();
        return list;
    }

}