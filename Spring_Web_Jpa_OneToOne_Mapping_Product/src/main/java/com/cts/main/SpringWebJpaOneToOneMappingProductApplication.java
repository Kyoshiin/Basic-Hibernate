package com.cts.main;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.cts.model.Product;
import com.cts.repository.ProductDetailRepository;
import com.cts.repository.ProductRepository;

@SpringBootApplication
@ComponentScan("com.cts")
@EntityScan(basePackages = { "com.cts.model" })
@EnableJpaRepositories(basePackages = "com.cts.repository")
public class SpringWebJpaOneToOneMappingProductApplication implements CommandLineRunner {

    @Autowired
    ProductRepository repo;
 
    @Autowired
    ProductDetailRepository pdrepo;

    public static void main(String[] args) {
        SpringApplication.run(SpringWebJpaOneToOneMappingProductApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
         List<Product> list = repo.findAll();
         for (Product product : list) {
             System.out.println(product);
        }
    }
}