package com.cts.model;
 
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
 
@Entity
public class Role {
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @Column(length = 20, nullable = false)
    String role;
 
    public Role(Integer id, String role) {
        this.id = id;
        this.role = role;
    }
 
    public Role(String role) {
        super();
        this.role = role;
    }
 
    public Role() {
    }
 
    public String getRole() {
        return role;
    }
 
    public void setRole(String role) {
        this.role = role;
    }
 
    @Override
    public String toString() {
        return role;
    }
 
}