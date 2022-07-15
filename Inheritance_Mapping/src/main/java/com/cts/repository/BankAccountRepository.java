package com.cts.repository;
 
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
 
import com.cts.model.BankAccount;
 
@Repository
public interface BankAccountRepository extends JpaRepository<BankAccount, Integer>{
 
}
