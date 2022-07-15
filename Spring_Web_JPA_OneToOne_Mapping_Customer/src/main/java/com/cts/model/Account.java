package com.cts.model;
 
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
 
@Entity
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String accountNumber;
    private String bankName;
 
    @OneToOne
    @JoinColumn(name = "id", nullable = false)
    private Employee employee;
 
    public Account() {
        this.id = 0;
        this.accountNumber = null;
        this.bankName = null;
        this.employee = null;
    }
 
    public Account(int id, String accountNumber, String bankName, Employee employee) {
        this.id = id;
        this.accountNumber = accountNumber;
        this.bankName = bankName;
        this.employee = employee;
    }
 
    public int getId() {
        return id;
    }
 
    public void setId(int id) {
        this.id = id;
    }
 
    public String getAccountNumber() {
        return accountNumber;
    }
 
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
 
    public String getBankName() {
        return bankName;
    }
 
    public void setBankName(String bankName) {
        this.bankName = bankName;
    }
 
    public Employee getEmployee() {
        return employee;
    }
 
    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
 
    @Override
    public String toString() {
        return "Account [" + id + " - " + bankName + " - " + accountNumber + "]";
    }
 
}