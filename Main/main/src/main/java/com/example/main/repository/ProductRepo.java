package com.example.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.main.model.Product;

public interface ProductRepo extends JpaRepository<Product,String> {

    
}