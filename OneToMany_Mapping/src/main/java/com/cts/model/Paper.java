package com.cts.model;

 

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;

 

@Entity
public class Paper {

 

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

 

    @Column(unique = true, length = 125)
    private String paper;

 

    @ManyToOne  
    @JoinTable(name = "semester_paper", 
        joinColumns = 
    @JoinColumn(name = "semester_id", referencedColumnName = "id", nullable = false), 
        inverseJoinColumns = 
    @JoinColumn(name = "paper_id", referencedColumnName = "id", nullable = false))
    private Semester semester;

 

    public Paper() {
        super();
        this.id = 0;
        this.paper = null;
        this.semester = null;
    }

 

    public Paper(String paper) {
        super();
        this.id = 0;
        this.paper = paper;
    }
    
    public Paper(String paper, Semester semester) {
        super();
        this.id = 0;
        this.paper = paper;
        this.semester = semester;
    }
    
    public Paper(int id, String paper, Semester semester) {
        super();
        this.id = id;
        this.paper = paper;
        this.semester = semester;
    }

 

    public int getId() {
        return id;
    }

 

    public void setId(int id) {
        this.id = id;
    }

 

    public String getPaper() {
        return paper;
    }

 

    public void setPaper(String paper) {
        this.paper = paper;
    }

 

    public Semester getSemester() {
        return semester;
    }

 

    public void setSemester(Semester semester) {
        this.semester = semester;
    }

 

    @Override
    public String toString() {
        return id + " - " + paper + "\n";
    }
}
 