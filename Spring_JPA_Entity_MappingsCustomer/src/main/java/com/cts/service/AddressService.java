package com.cts.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.model.Address;
import com.cts.repository.AddressRepository;

@Service
public class AddressService {

    @Autowired
    private AddressRepository repo;
 
    public List<Address> getAllAddresses() {
        List<Address> list = repo.findAll();
        return list;
    }
}