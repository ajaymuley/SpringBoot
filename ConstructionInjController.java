package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Library;

@RestController
public class ConstructionInjController {

	Library lb;
	
//	@Autowired
	ConstructionInjController(Library l1){
		this.lb=l1;
		
	}
	
	@GetMapping("/getlibinfo")
	public String libinfo() {
		return lb.libinfo();
		
	}
	
}
