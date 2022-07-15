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
public class HibernateQueriesApplication implements CommandLineRunner {
 
    @Autowired
    LoginRepository repo;
 
    public static void main(String[] args) {
        SpringApplication.run(HibernateQueriesApplication.class, args);
    }
 
    @Override
    public void run(String... args) throws Exception {
        Login login1 = new Login(0, "admin", "admin", "admin");
        Login login2 = new Login(0, "kannan", "kannan", "trainer");
        Login login3 = new Login(0, "reena", "reena@123", "trainee");
        Login login4 = new Login(0, "kumar", null, "trainee");
        Login login5 = new Login(0, "meena", "meena", "trainer");
        Login login6 = new Login(0, "beena", "beena", "trainee");
        Login login7 = new Login(0, "priya", "sri@123", "trainer");
        Login login8 = new Login(0, "akash", "pass", "trainee");
        Login login9 = new Login(0, "seetha", "abc@1996", null);
        Login login10 = new Login(0, "dell", "dell@123", "admin");
 
        repo.save(login1);
        repo.save(login2);
        repo.save(login3);
        repo.save(login4);
        repo.save(login5);
        repo.save(login6);
        repo.save(login7);
        repo.save(login8);
        repo.save(login9);
        repo.save(login10);
 
        List<Login> list = repo.findAll();
        for (Login login : list) {
            System.out.println(login);
        }
 
        Login login = repo.findById(3).get();
        System.out.println("\n" + login);
    }
 
}