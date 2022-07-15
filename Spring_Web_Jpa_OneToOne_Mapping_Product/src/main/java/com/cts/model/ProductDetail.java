package com.cts.model;
 
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
 
@Entity
public class ProductDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String dimension;
    private double weight;
    private String manufacturer;
    private String origin;
 
    @OneToOne(mappedBy = "productDetail")
    private Product product;
 
    public ProductDetail() {
        this.id = 0;
        this.dimension = null;
        this.weight = 0.0;
        this.manufacturer = null;
        this.origin = null;
        this.product = null;
    }
 
    public ProductDetail(int id, String dimension, double weight, String manufacturer, String origin, Product product) {
        this.id = id;
        this.dimension = dimension;
        this.weight = weight;
        this.manufacturer = manufacturer;
        this.origin = origin;
        this.product = product;
    }
 
    public int getId() {
        return id;
    }
 
    public void setId(int id) {
        this.id = id;
    }
 
    public String getDimension() {
        return dimension;
    }
 
    public void setDimension(String dimension) {
        this.dimension = dimension;
    }
 
    public double getWeight() {
        return weight;
    }
 
    public void setWeight(double weight) {
        this.weight = weight;
    }
 
    public String getManufacturer() {
        return manufacturer;
    }
 
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
 
    public String getOrigin() {
        return origin;
    }
 
    public void setOrigin(String origin) {
        this.origin = origin;
    }
 
    public Product getProduct() {
        return product;
    }
 
    public void setProduct(Product product) {
        this.product = product;
    }
 
    @Override
    public String toString() {
        return "ProductDetail [" + id + "-" + dimension + "-" + weight + "-" + manufacturer + "-" + origin + "]";
    }
 
}