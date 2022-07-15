package com.cts.main;
 
import java.util.List;
 
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
 
import org.hibernate.SessionFactory;
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
public class HibernateQueriesNamedQueriesApplication implements CommandLineRunner {
 
    @Autowired
    LoginRepository repo;
 
    public static void main(String[] args) {
        SpringApplication.run(HibernateQueriesNamedQueriesApplication.class, args);
    }
 

//    public List<Login> findByRoles(String role) {
//        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
//        CriteriaQuery<Login> query = cb.createQuery(Login.class);
//        List<Login> list = entityManager.createQuery(query).getResultList();
//        return list;
//    }

    @PersistenceContext
    private EntityManager entityManager;

    public List<Login> findByRole(String role) {
        Query query = entityManager.createNamedQuery("findByRoles");
        query.setParameter(1, role);
        List<Login> list =   query.getResultList();
//        System.out.println(list.toString());
        return list;
    }
 
    @Override
    public void run(String... args) throws Exception {
        List<Login> list = findByRole("admin");
        for (Login login : list) {
            System.out.println(login);
        }
    }
}