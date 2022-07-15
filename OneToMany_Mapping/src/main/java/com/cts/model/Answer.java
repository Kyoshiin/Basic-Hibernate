package com.cts.model;

 

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

 

@Entity
public class Answer {

 

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

 

    @Column(unique= true, length = 125)
    private String answer;

 

    @ManyToOne    
    @JoinColumn(name = "question_id", nullable = false)
    private Question question;

 

    public Answer() {
        this.id = 0;
        this.answer = null;
        this.question = null;
    }

 

    public Answer(String answer, Question question) {
        this.id = 0;
        this.answer = answer;
        this.question = question;
    }

 

    public Answer(int id, String answer, Question question) {
        super();
        this.id = id;
        this.answer = answer;
        this.question = question;
    }

 

    public int getId() {
        return id;
    }

 

    public void setId(int id) {
        this.id = id;
    }

 

    public String getAnswer() {
        return answer;
    }

 

    public void setAnswer(String answer) {
        this.answer = answer;
    }

 

    public Question getQuestion() {
        return question;
    }

 

    public void setQuestion(Question question) {
        this.question = question;
    }

 

    @Override
    public String toString() {
        return " \n " + id + " - " + answer;
    }
}