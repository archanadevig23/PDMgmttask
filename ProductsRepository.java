package com.quinbay.product.repository;

import com.quinbay.product.model.Products;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public interface ProductsRepository extends JpaRepository<Products, Long> {
//    List<Products> findAllProducts();
}
