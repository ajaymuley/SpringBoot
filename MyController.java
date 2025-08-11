package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Teacher;

@RestController
public class MyController {

	@Autowired
	Teacher t;
	
	@GetMapping("/getallinfo")
public String g() {

		return t.gettinfo();
	}
}
