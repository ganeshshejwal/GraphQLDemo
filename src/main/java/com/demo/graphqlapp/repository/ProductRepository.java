package com.demo.graphqlapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.graphqlapp.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
    
    List<Product> findByCustomerId(int customerId);
}
