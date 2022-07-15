package com.cts.service;
 
import java.util.List;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
import com.cts.model.ProductDetail;
import com.cts.repository.ProductDetailRepository;
 
@Service
public class ProductDetailService {
 
    @Autowired
    private ProductDetailRepository repo;
 
    public List<ProductDetail> getAllCustomers() {
        List<ProductDetail> list = repo.findAll();
        return list;
    }
}