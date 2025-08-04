package com.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.entity.Product1;

@RestController
public class Product1Controller {
	

	List<Product1> prod = new ArrayList<>();

	Product1Controller() {

		Product1 p1 = new Product1(1, "Acer Laptop", "Electronics", 27599.00);
		prod.add(p1);

	}

	@GetMapping("/getdetail")
	public List<Product1> aj() {
		return prod;
	}
	
	
	@PutMapping("/updatep")
	public String up(@RequestParam int pid, @RequestBody Product1 newprod) {

		Product1 existingprod = new Product1();
		for (Product1 p1 : prod) {

			if (p1.getPid() == pid) {
				existingprod = p1;
			}
		}
		
		if (existingprod.getPid() == 0) {
			return "No existing record found";
		}
		
		if (newprod.getPname() == null && newprod.getPrice() == 0.0 && newprod.getCategory() == null) {

			return " No new record provided";
		}

		if (newprod.getPname() != null) {
			existingprod.setPname(newprod.getPname());
		}
		
		if (newprod.getCategory() != null) {
			existingprod.setCategory(newprod.getCategory());
		}
		
		if (newprod.getPrice() != 0.0) {
			existingprod.setPrice(newprod.getPrice());
		}
		
		return "Record added successfully";
	}
 
}
