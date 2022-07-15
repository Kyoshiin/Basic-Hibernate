package com.cts.main;
 
import java.util.List;
import java.util.Optional;
 
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
 
import com.cts.model.Login;
import com.cts.repository.LoginRepository;
 
@SpringBootTest
public class LoginRepositoryTest {
 
    @Autowired
    LoginRepository repo;
 
    @Test
    public void saveAllLogins() {
        Login login1 = new Login(1001, "admin", "admin", "admin");
        repo.save(login1);
        Login login2 = new Login(1002, "kannan", "kannan", "trainer");
        repo.save(login2);
        Login login3 = new Login(1003, "reena", "reena", "trainee");
        repo.save(login3);
        Login login4 = new Login(1004, "kumar", "kumar", "trainee");
        repo.save(login4);
        Login login5 = new Login(1005, "meena", "meena", "trainer");
        repo.save(login5);
    }
 
    @Test
    public void printALLLogins() {
        List<Login> list = repo.findAll();
        for (Login login : list) {
            System.out.println(login);
        }
    }
 
    @Test
    public void printLogin() {
        int id = 1040;
        Optional<Login> login = repo.findById(id);
        if (login.isPresent()) {
            System.out.println(login.get());
        } else {
//            throw the exception
            throw new NullPointerException("\nLogin Id : "+id+" Not exists.");
        }
    }
 
    @Test
    public void updateLogin() {
        Login login = new Login(2, "kannan", "kannan@123", "trainer");
        repo.saveAndFlush(login);
    }
 
    @Test
    public void deleteLogin() {
        int id = 5;
        repo.deleteById(id);
    }
 
}