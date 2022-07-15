package com.cts.controller;
 
import java.util.List;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
 
import com.cts.model.Account;
import com.cts.service.AccountService;
 
@Controller
public class AccountController {
 
    @Autowired
    private AccountService service;
 
    @ResponseBody
    @RequestMapping(value = "/listaccounts", method = RequestMethod.GET)
    public String getAllAccounts() {
        List<Account> list = service.getAllAccounts();
        return list.toString();
    }
}