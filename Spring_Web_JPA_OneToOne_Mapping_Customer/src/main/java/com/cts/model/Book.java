package com.cts.model;
 
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
 
@Entity
public class Book {
    @Id
    private int id;
    private String title;
    private double price;
 
    @OneToOne 
    @MapsId
    private Publisher publisher;
 
    public Book() {
        this.id = 0;
        this.title = null;
        this.price = 0.0;
        this.publisher = null;
    }
 
    public Book(int id, String title, double price, Publisher publisher) {
        this.id = id;
        this.title = title;
        this.price = price;
        this.publisher = publisher;
    }
 
    public int getId() {
        return id;
    }
 
    public void setId(int id) {
        this.id = id;
    }
 
    public String getTitle() {
        return title;
    }
 
    public void setTitle(String title) {
        this.title = title;
    }
 
    public double getPrice() {
        return price;
    }
 
    public void setPrice(double price) {
        this.price = price;
    }
 
    public Publisher getPublisher() {
        return publisher;
    }
 
    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }
 
    @Override
    public String toString() {
    return "<h3> Book [" + this.id + " - " + title + " - " + price + "] </h3>" +         publisher;
    }
 
}