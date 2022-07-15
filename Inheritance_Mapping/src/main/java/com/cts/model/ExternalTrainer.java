package com.cts.model;
 
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
 
@Entity
@DiscriminatorValue("external")
public class ExternalTrainer extends Trainers {
 
    private double pay_per_day;
    private int contract_duration;
 
    public ExternalTrainer() {
        super();
    }
 
    public ExternalTrainer(int id, String name) {
        super(id, name);
    }
 
    public ExternalTrainer(double pay_per_day, int contract_duration) {
        super();
        this.pay_per_day = pay_per_day;
        this.contract_duration = contract_duration;
    }
 
    public ExternalTrainer(int id, String name, double pay_per_day, int contract_duration) {
        super(id, name);
        this.pay_per_day = pay_per_day;
        this.contract_duration = contract_duration;
    }
 
    public double getPay_per_day() {
        return pay_per_day;
    }
 
    public void setPay_per_day(double pay_per_day) {
        this.pay_per_day = pay_per_day;
    }
 
    public int getContract_duration() {
        return contract_duration;
    }
 
    public void setContract_duration(int contract_duration) {
        this.contract_duration = contract_duration;
    }
 
    @Override
    public String toString() {
        return "ExternalTrainer [" + super.getId() + " - " + super.getName() + " - " + pay_per_day + " - " + contract_duration + "]";
    }
}