package com.cts.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    private double price;

    @OneToMany
    @JoinTable(name = "book_author", joinColumns = {
        @JoinColumn(name = "book_id", referencedColumnName = "id") }, inverseJoinColumns = {
        @JoinColumn(name = "author_id", referencedColumnName = "id") })
    Set<Author> authors;

    public Book() {
        this.id = 0;
        this.title = null;
        this.price = 0.0;
        this.authors = null;
    }

    public Book(int id, String title, double price, Set<Author> authors) {
        this.id = id;
        this.title = title;
        this.price = price;
        this.authors = authors;
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

    public Set<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(Set<Author> authors) {
        this.authors = authors;
    }

    @Override
    public String toString() {
        return "<h3>Book [id=" + id + ", title=" + title + ", price=" + price + "]</h3> <h4> authors <br>[" + authors + "]</h4>";
    }

}
