package com.cts.main;
 
import java.util.List;
 
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
 
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
 
import com.cts.model.Login;
 
@SpringBootApplication
@ComponentScan(basePackages = { "com.cts" })
@EntityScan(basePackages = { "com.cts.model" })
@EnableJpaRepositories(basePackages = { "com.cts.repository" })
public class HibernateQueries6Application implements CommandLineRunner {
 
//    @Autowired
//    LoginRepository repo;
 
    public static void main(String[] args) {
        SpringApplication.run(HibernateQueries6Application.class, args);
    }
 
    @PersistenceContext
    private EntityManager entityManager;
 
// criteria Query Example
//    public void printAllLogins() {
//        String hql = "Select log.username FROM Login log";
//        Query query = entityManager.createQuery(hql);
//        List<String> results = query.getResultList();
//        for (String login : results) {
//            System.out.println(login);
//        }
//    }
    public List<Login> findByRole(String role) {
        Query query = entityManager.createNamedQuery("findByRoles");
        query.setParameter(1, role);
 
        List<Login> list = query.getResultList();
//        System.out.println(list.toString());
        return list;
    }
 
    @Override
    public void run(String... args) throws Exception {
//        printAllLogins();
        List<Login> list = findByRole("trainee");
        for (Login login : list) {
            System.out.println(login);
        }
    }
}