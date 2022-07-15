package com.cts.repository;

 

import java.util.Set;

 

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

 

import com.cts.model.Answer;

 

@Repository
public interface AnswerRepository extends JpaRepository<Answer, Integer> {
    Set<Answer> findByQuestionId(int id);
}
 