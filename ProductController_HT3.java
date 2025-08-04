package com.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.entity.Product;

@RestController
public class ProductController_HT3 {

	List<Product> prod = new ArrayList<>();

	ProductController_HT3() {

		Product p1 = new Product(1, "Laptop", 27000, "Electronics");
		prod.add(p1);

	}

	 
	
	@PostMapping("/addprod")
	public List<Product> addprod(@RequestBody Product p2) {
		prod.add(p2);
		return prod;
	}

	
	@GetMapping("/detail")
	public List<Product> find() {
		return prod;
	}

}
