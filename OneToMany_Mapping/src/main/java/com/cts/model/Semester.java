package com.cts.model;

 

import java.util.Set;

 

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

 

@Entity
public class Semester {

 

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

 

    @Column(unique = true, length = 150)
    private String semester;

 

    @OneToMany(mappedBy = "semester", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Set<Paper> papers;

 

    public Semester() {
        super();
        this.id = 0;
        this.semester = null;
        this.papers = null;
    }

 

    public Semester(String semester) {
        super();
        this.id = 0;
        this.semester = semester;
    }

 

    public Semester(int id, String semester, Set<Paper> papers) {
        super();
        this.id = id;
        this.semester = semester;
        this.papers = papers;
    }

 

    public int getId() {
        return id;
    }

 

    public void setId(int id) {
        this.id = id;
    }

 

    public String getSemester() {
        return semester;
    }

 

    public void setSemester(String semester) {
        this.semester = semester;
    }

 

    public Set<Paper> getPapers() {
        return papers;
    }

 

    public void setPapers(Set<Paper> papers) {
        this.papers = papers;
    }

 

    @Override
    public String toString() {
        return "\nSemester [" + id + " - " + semester + "]\n, papers " + papers;
    }

 

}