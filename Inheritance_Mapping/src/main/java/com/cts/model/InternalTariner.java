package com.cts.model;
 
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
 
@Entity
@DiscriminatorValue("internal")
public class InternalTariner extends Trainers {
 
    private double salary;
 
    public InternalTariner() {
        super();
    }
 
    public InternalTariner(int id, String name) {
        super(id, name);
    }
 
    public InternalTariner(double salary) {
        super();
        this.salary = salary;
    }
 
    public InternalTariner(int id, String name, double salary) {
        super(id, name);
        this.salary = salary;
    }
 
    public double getSalary() {
        return salary;
    }
 
    public void setSalary(double salary) {
        this.salary = salary;
    }
 
    @Override
    public String toString() {
        return "Internal Tariner [" + super.getId() + " - " + super.getName() + " - " + salary + "]";
    }
}