package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Project;

@RestController
public class SetterInjController {

	Project p;
	@Autowired
	public void setp(Project p1) {
		
		this.p=p1;
	}
	
	
	@GetMapping("/getdev")
	public String getdev() {
		
		return p.getdevinfo();
	}
}
