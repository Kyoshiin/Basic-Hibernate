package com.cts.repository;
 
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
 
import com.cts.model.Bike;
 
@Repository
public interface BikeRepository extends JpaRepository<Bike, Integer> {
 
}