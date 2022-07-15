package com.cts.model;
 
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
 
@Entity
@PrimaryKeyJoinColumn(name = "vechile_id")
public class Bike extends Vechile {
 
    private String fuelType;
 
    public Bike() {
        super();
    }
 
    public Bike(int id, String engineNumber, String chasisNumber) {
        super(id, engineNumber, chasisNumber);
        // TODO Auto-generated constructor stub
    }
 
    public Bike(String fuelType) {
        super();
        this.fuelType = fuelType;
    }
 
    public Bike(int id, String engineNumber, String chasisNumber, String fuelType) {
        super(id, engineNumber, chasisNumber);
        this.fuelType = fuelType;
    }
 
    public String getFuelType() {
        return fuelType;
    }
 
    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }
 
    @Override
    public String toString() {
        return "Bike " + super.toString() + "\nFuel Type : " + fuelType + "\n";
    }
 
}