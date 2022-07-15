package com.cts.repository;

 

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

 

import com.cts.model.Semester;

 

@Repository
public interface SemesterRepository  extends JpaRepository<Semester, Integer>{

 

}