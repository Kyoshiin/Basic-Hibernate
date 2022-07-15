package com.cts.model;
 
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
 
@Entity
@PrimaryKeyJoinColumn(name = "vechile_id")
public class Car extends Vechile {
 
    private String fuelType;
 
    public Car() {
        super();
    }
 
    public Car(int id, String engineNumber, String chasisNumber) {
        super(id, engineNumber, chasisNumber);
    }
 
    public Car(String fuelType) {
        super();
        this.fuelType = fuelType;
    }
 
    public Car(int id, String engineNumber, String chasisNumber, String fuelType) {
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
        return "Car  "+super.toString() +"\nFuel Type : " + fuelType + "\n";
    }
}