package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Hospital;

@RestController
public class fieldInjectionController {

	@Autowired
	Hospital h;

	@GetMapping("gethospitalinfo")
	public String hospitalinfo() {
		return h.gethospitalinfo();

	}
}
