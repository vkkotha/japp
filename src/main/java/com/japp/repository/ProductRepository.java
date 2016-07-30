package com.japp.repository;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;

import com.japp.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	Collection<Product> findByName(String name);
}
