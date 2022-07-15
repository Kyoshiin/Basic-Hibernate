package com.cts.main;
 
import java.util.List;
 
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
 
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
public class HibernateQueries5Application implements CommandLineRunner {
 
//    @Autowired
//    LoginRepository repo;
 
    public static void main(String[] args) {
        SpringApplication.run(HibernateQueries5Application.class, args);
    }
 

    @PersistenceContext
    private EntityManager entityManager;

// criteria Query Example
    public void printAllLogins() {
        String hql = "Select log.username FROM Login log"; 
        Query query = entityManager.createQuery(hql); 
        List<String> results =   query.getResultList(); 
        for (String login : results) {
            System.out.println(login);
        }
    }

    @Override
    public void run(String... args) throws Exception {
        printAllLogins();
    }
}