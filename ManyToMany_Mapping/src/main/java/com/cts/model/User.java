package com.cts.model;
 
import java.util.Set;
 
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
 
@Entity
public class User   {
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int  id;
    @Column(unique = true, length = 20, nullable = false)
    private String username;
    private String password;
 
    @JoinTable(name = "user_role",         joinColumns = 
    @JoinColumn(name = "user_id", referencedColumnName = "id"), inverseJoinColumns = 
    @JoinColumn(name = "role_id", referencedColumnName = "id"))
    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Set<Role> roles;
 
    public User() {
 
    }
 
    public User(String username, String password, Set<Role> roles) {
        this.username = username;
        this.password = password;
        this.roles = roles;
    }
 
    public String getUsername() {
        return username;
    }
 
    public void setUsername(String username) {
        this.username = username;
    }
 
    public String getPassword() {
        return password;
    }
 
    public void setPassword(String password) {
        this.password = password;
    }
 
    public Set<Role> getRoles() {
        return roles;
    }
 
    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }
 
    @Override
    public String toString() {
        return "\nUser \nid : " + id + "\nUsername : " + username + "\nPassword : " + password + "\nRoles " + roles;
    }
 
}
