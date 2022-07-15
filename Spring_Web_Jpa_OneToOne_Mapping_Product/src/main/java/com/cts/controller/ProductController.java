package com.cts.controller;
 
import java.util.List;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
 
import com.cts.model.Product;
import com.cts.service.ProductService;
 
@Controller
public class ProductController {
 
    @Autowired
    private ProductService service;
 
    @ResponseBody
    @RequestMapping(value = "/listproduct", method = RequestMethod.GET)
    public String getAllCustomers() {
        List<Product> list = service.getAllProducts();
        return list.toString();
    }
}