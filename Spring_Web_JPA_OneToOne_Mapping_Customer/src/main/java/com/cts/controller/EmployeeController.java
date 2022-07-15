package com.cts.controller;
 
import java.util.List;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
 
import com.cts.model.Employee;
import com.cts.service.EmployeeService;
 
@Controller
public class EmployeeController {
 
    @Autowired
    private EmployeeService service;
 
    @ResponseBody
    @RequestMapping(value = "/listemployees", method = RequestMethod.GET)
    public String getAllEmployees() {
        List<Employee> list = service.getAllEmployees();
        return list.toString();
    }
}