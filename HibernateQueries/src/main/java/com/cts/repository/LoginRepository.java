package com.cts.repository;
 
import java.util.List;
 
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
 
import com.cts.model.Login;
 
@Repository
public interface LoginRepository extends JpaRepository<Login, Integer> {
    List<Login> findByRole(String role);
    int countByRole(String role);
    List<Login> findByPasswordIsNull();
     Login  findByUsernameAndPassword(String username, String password);

}