package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Car;

@RestController
public class CarController {

	@Autowired
	Car c;
	
	@GetMapping("/start")
	public String start()
	{
		return  c.run();
	}
	
	
}
