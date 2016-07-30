package com.japp.rest;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.japp.model.Product;
import com.japp.repository.ProductRepository;

@RestController
@RequestMapping("/api")
public class ProductRestController {
	@Autowired
	private ProductRepository productRepository;
	
	@RequestMapping("/products")
	public Collection<Product> products() {
		return this.productRepository.findAll();
	}
}
