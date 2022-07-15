package com.cts.service;
 
import java.util.List;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
import com.cts.model.Product;
import com.cts.repository.ProductRepository;
 
@Service
public class ProductService {
 
    @Autowired
    private ProductRepository repo;
 
    public List<Product> getAllProducts() {
        List<Product> list = repo.findAll();
        return list;
    }
}