package com.cts.model;
 
import javax.persistence.Entity;
 
@Entity(name = "Debitcard")
public class DebitCard extends BankAccount {
 
    private double debitLimit;
 
    public DebitCard() {
        super();
    }
 
    public DebitCard(int id, String customerName, double balance) {
        super(id, customerName, balance);
    }
 
    public DebitCard(double debitLimit) {
        super();
        this.debitLimit = debitLimit;
    }
 
    public DebitCard(int id, String customerName, double balance, double debitLimit) {
        super(id, customerName, balance);
        this.debitLimit = debitLimit;
    }
 
    public double getDebitLimit() {
        return debitLimit;
    }
 
    public void setDebitLimit(double debitLimit) {
        this.debitLimit = debitLimit;
    }
 
    @Override
    public String toString() {
        return "\nDebitCard [\nId : " + super.getId() + "\nCustomer Name =  " + super.getCustomerName() + "\nbalance = " + super.getBalance() + "\nDebit Limit = "
                + debitLimit + "]";
    }
}