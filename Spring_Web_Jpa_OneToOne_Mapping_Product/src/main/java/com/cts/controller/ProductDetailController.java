package com.cts.controller;
 
import java.util.List;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
 
import com.cts.model.ProductDetail;
import com.cts.service.ProductDetailService;
 
@Controller
public class ProductDetailController {
 
    @Autowired
    private ProductDetailService service;
 
    @ResponseBody
    @RequestMapping(value = "/listproductdetail", method = RequestMethod.GET)
    public String getAllCustomers() {
        List<ProductDetail> list = service.getAllCustomers(); 
        return list.toString();
    }
}