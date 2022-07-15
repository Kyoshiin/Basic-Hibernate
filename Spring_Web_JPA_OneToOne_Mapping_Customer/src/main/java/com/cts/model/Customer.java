package com.cts.model;
 
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToOne;
 
@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "customername")
    private String customerName;
 
    @Column(name = "mobilenumber")
    private String mobileNumber;
 
    @Column(name = "emailid")
    private String emailId;
 
    @OneToOne
    @JoinTable(name = "customer_address", joinColumns = {
        @JoinColumn(name = "customer_id", referencedColumnName = "id") }, inverseJoinColumns = {
        @JoinColumn(name = "address_id", referencedColumnName = "id") })
    private Address address;
 
    public Customer() {
        this.id = 0;
        this.customerName = null;
        this.mobileNumber = null;
        this.emailId = null;
        this.address = null;
    }
 
    public Customer(int id, String customerName, String mobileNumber, String emailId, Address address) {
        this.id = id;
        this.customerName = customerName;
        this.mobileNumber = mobileNumber;
        this.emailId = emailId;
        this.address = address;
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
 
    public String getMobileNumber() {
        return mobileNumber;
    }
 
    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }
 
    public String getEmailId() {
        return emailId;
    }
 
    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }
 
    public Address getAddress() {
        return address;
    }
 
    public void setAddress(Address address) {
        this.address = address;
    }
 
    @Override
    public String toString() {
        return "<br /><br />Customer [" + id + " - " + customerName + " - " + mobileNumber + " - " + emailId +" <br />"+ address +"]";
    }
 
}