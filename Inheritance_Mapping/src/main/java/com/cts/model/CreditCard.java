package com.cts.model;
 
import javax.persistence.Entity;
 
@Entity(name = "Creditcard")
public class CreditCard extends BankAccount {
    private double creditLimit;
 
    public CreditCard() {
        super();
    }
 
    public CreditCard(int id, String customerName, double balance) {
        super(id, customerName, balance);
    }
 
    public CreditCard(double creditLimit) {
        super();
        this.creditLimit = creditLimit;
    }
 
    public CreditCard(int id, String customerName, double balance, double creditLimit) {
        super(id, customerName, balance);
        this.creditLimit = creditLimit;
    }
 
    public double getCreditLimit() {
        return creditLimit;
    }
 
    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }
 
    @Override
    public String toString() {
        return "\nCreditCard [ \nId : " + super.getId() + "\nCustomer Name = " + super.getCustomerName() + "\nbalance = "
                + super.getBalance() + "\nCredit Limit = " + creditLimit + "]";
    }
 
}