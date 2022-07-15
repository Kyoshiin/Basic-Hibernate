package com.cts.main;
 
import java.util.HashSet;
import java.util.List;
import java.util.Set;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
 
import com.cts.model.Role;
import com.cts.model.User;
import com.cts.repository.UserRepository;
 
@SpringBootApplication
@ComponentScan("com.cts")
@EntityScan(basePackages = { "com.cts.model" })
@EnableJpaRepositories(basePackages = "com.cts.repository")
public class ManyToManyMappingApplication implements CommandLineRunner {
 
    @Autowired
    UserRepository  repo;
 
    public static void main(String[] args) {
        SpringApplication.run(ManyToManyMappingApplication.class, args);
    }
 
    @Override
    public void run(String... args) throws Exception {
        Set<Role> roles = null;
        Role role = new Role();
        User user = new User();
        user.setUsername("Meena Kumari");
        user.setPassword("admin");
        roles = new HashSet<>();
        roles.add(role);
        role.setRole("admin");
        user.setRoles(roles);
        repo.save(user);
 
        user = new User();
        roles = new HashSet<>();
        user.setUsername("kannan");
        user.setPassword("kannan@123");
        Role role1 = new Role();
        role1.setRole("Trainer");
        Role role2 = new Role();
        role2.setRole("Facilitator");
        roles.add(role1);
        roles.add(role2);
        user.setRoles(roles);
        repo.save(user);
 
        List<User> userList = repo.findAll();
        for (User users : userList) {
            System.out.println(users);
        }

    }
 
}