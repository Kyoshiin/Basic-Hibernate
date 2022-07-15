package com.cts.repository;
 
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
 
import com.cts.model.Car;
 
@Repository
public interface CarRepository extends JpaRepository<Car, Integer>{
 
}
