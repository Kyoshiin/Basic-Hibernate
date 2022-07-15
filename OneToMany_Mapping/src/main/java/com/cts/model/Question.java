package com.cts.model;

 

import java.util.LinkedHashSet;
import java.util.Set;

 

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

 

@Entity
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

 

    @Column(unique = true, length = 150)
    private String question;

 

    @OneToMany(mappedBy = "question" )  
    private Set<Answer> answers;

 

    public Question() {
        this.id = 0;
        this.question = null;
        answers = new LinkedHashSet<>();
    }

 

    public Question(String question) {
        this.id = 0;
        this.question = question;
    }
    
    public Question(int id, String question) {
        this.id = id;
        this.question = question;
    }

 

    public int getId() {
        return id;
    }

 

    public void setId(int id) {
        this.id = id;
    }

 

    public String getQuestion() {
        return question;
    }

 

    public void setQuestion(String question) {
        this.question = question;
    }

 

    public Set<Answer> getAnswers() {
        return answers;
    }

 

    public void setAnswers(Set<Answer> answers) {
        this.answers = answers;
    }

 

    @Override
    public String toString() {
        return "\n" + id + ".) " + question + " \n" + answers;
    }
}