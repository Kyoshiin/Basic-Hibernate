package com.cts.service;
 
import java.util.List;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
import com.cts.model.Account;
import com.cts.repository.AccountRepository;
 
@Service
public class AccountService {

    @Autowired
    private AccountRepository repo;
 
    public List<Account> getAllAccounts() {
        List<Account> list = repo.findAll();
        System.out.println("Account :"+list);
        return list;
    }
}
