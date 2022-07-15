package com.cts.model;
 
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
 
@MappedSuperclass
public class BankAccount {
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String customerName;
    private double balance;
 
    public BankAccount() {
        this.id = 0;
        this.customerName = null;
        this.balance = 0.0;
    }
 
    public BankAccount(int id, String customerName, double balance) {
        super();
        this.id = id;
        this.customerName = customerName;
        this.balance = balance;
    }
 
    public int getId() {
        return id;
    }
 
    public void setId(int id) {
        this.id = id;
    }
 
    public String getCustomerName() {
        return customerName;
    }
 
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
 
    public double getBalance() {
        return balance;
    }
 
    public void setBalance(double balance) {
        this.balance = balance;
    }
 
    @Override
    public String toString() {
        return "Bank Account [" + id + " - " + customerName + " - " + balance + "]";
    }
 
}