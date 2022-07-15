package com.cts.repository;

 

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

 

import com.cts.model.Paper;

 

@Repository
public interface PaperRepository extends JpaRepository<Paper, Integer>{

 

}