package com.cts.main;
 
import java.util.List;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
 
import com.cts.model.Login;
import com.cts.repository.LoginRepository;
 
@SpringBootApplication
@ComponentScan(basePackages = { "com.cts" })
@EntityScan(basePackages = { "com.cts.model" })
@EnableJpaRepositories(basePackages = { "com.cts.repository" })
public class HibernateQueries2Application implements CommandLineRunner {
 
    @Autowired
    LoginRepository repo;
 
    public static void main(String[] args) {
        SpringApplication.run(HibernateQueries2Application.class, args);
    }
 
    @Override
    public void run(String... args) throws Exception {
 
//        List<Login> list = repo.findAll();
//        for (Login login : list) {
//            System.out.println(login);
//        }
//
//        Login login = repo.findById(3).get();
//        System.out.println("\n" + login);

        List<Login> list = repo.findByUsernameEndingWith("a");
        for (Login login : list) {
            System.out.println(login);
        }
    }
 
}