package com.cts.repository;
 
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
 
import com.cts.model.CreditCard;
 
@Repository
public interface CreditCardRepository extends JpaRepository<CreditCard, Integer>{
 
}

