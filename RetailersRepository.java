package com.quinbay.retailer.repository;

import com.quinbay.retailer.model.Retailers;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface RetailersRepository extends JpaRepository<Retailers, Long>{

}
