package com.example.SpringbootCRUD_JPA.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.SpringbootCRUD_JPA.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

	Product findByName(String name);


	
	
}
