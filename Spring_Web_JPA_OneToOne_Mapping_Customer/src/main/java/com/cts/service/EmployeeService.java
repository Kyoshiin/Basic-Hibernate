package com.cts.service;
 
import java.util.List;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
import com.cts.model.Employee;
import com.cts.repository.EmployeeRepository;
 
@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository repo;
 
    public List<Employee> getAllEmployees() {
        List<Employee> list = repo.findAll();
        System.out.println("Employee :"+list);
        return list;
    }
 
}