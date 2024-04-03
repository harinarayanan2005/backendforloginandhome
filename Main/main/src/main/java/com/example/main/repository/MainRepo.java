package com.example.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.main.model.Main;

public interface MainRepo extends JpaRepository<Main,Integer> {

}