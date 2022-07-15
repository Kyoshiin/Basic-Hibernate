package com.cts.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cts.model.Customer;
import com.cts.repository.CustomerRepository;
import com.cts.service.CustomerService;

@Controller
public class CustomerController {

    @Autowired
    private CustomerService service;
 
    @ResponseBody
    @RequestMapping(value = "/listCustomers",method = RequestMethod.GET)
    public String getAllCustomers() {
        List<Customer> list = service.getAllCustomers();
        return list.toString();
    }
}