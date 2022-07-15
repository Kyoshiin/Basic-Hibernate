package com.cts.main;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.cts.model.Employee;
import com.cts.repository.AccountRepository;
import com.cts.repository.EmployeeRepository;

@SpringBootApplication
@ComponentScan("com.cts")
@EntityScan(basePackages = { "com.cts.model" })
@EnableJpaRepositories(basePackages = "com.cts.repository")
public class SpringWebJpaOneToOneMappingAccountApplication implements CommandLineRunner {

    @Autowired
    EmployeeRepository repo;

    @Autowired
    AccountRepository pdrepo;

    public static void main(String[] args) {
        SpringApplication.run(SpringWebJpaOneToOneMappingAccountApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        List<Employee> list = repo.findAll();
        for (Employee employee : list) {
            System.out.println(employee);
        }

    }
}
