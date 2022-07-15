package com.cts.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cts.model.Address;
import com.cts.service.AddressService;

@Controller
public class AddressController {

    @Autowired
    private AddressService service;

    @ResponseBody
    @RequestMapping(value = "/listAddresses", method = RequestMethod.GET)
    public String getAllAddreses() {
        List<Address> list = service.getAllAddresses();
        return list.toString();
    }
}
