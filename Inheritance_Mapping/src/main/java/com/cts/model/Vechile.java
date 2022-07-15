package com.cts.model;
 
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
 
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Vechile {
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String engineNumber;
    private String chasisNumber;
 
    public Vechile() {
        this.id = 0;
        this.engineNumber = null;
        this.chasisNumber = null;
    }
 
    public Vechile(int id, String engineNumber, String chasisNumber) {
        super();
        this.id = id;
        this.engineNumber = engineNumber;
        this.chasisNumber = chasisNumber;
    }
 
    public int getId() {
        return id;
    }
 
    public void setId(int id) {
        this.id = id;
    }
 
    public String getEngineNumber() {
        return engineNumber;
    }
 
    public void setEngineNumber(String engineNumber) {
        this.engineNumber = engineNumber;
    }
 
    public String getChasisNumber() {
        return chasisNumber;
    }
 
    public void setChasisNumber(String chasisNumber) {
        this.chasisNumber = chasisNumber;
    }
 
    @Override
    public String toString() {
        return "\nId : " + id + "\nEngine Number : " + engineNumber + "\nChasis Number : " + chasisNumber;
    }
 
}