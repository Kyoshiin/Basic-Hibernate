package com.cts.repository;
 
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
 
import com.cts.model.Staff;
 
@Repository
public interface StaffRepository extends JpaRepository<Staff, Integer>{
 
}