package com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Take_User_Input_D2 {

	@GetMapping("/add/{a}/{b}")
	public String add(@PathVariable("a") int x, @PathVariable("b") int y) {

		return "Addition of x+y = " + (x + y);

	}

	@GetMapping("/sub/{a}/{b}")
	public String sub(@PathVariable("a") int x, @PathVariable("b") int y) {
		return "Substraction of x-y = " + (x - y);
	}

	@GetMapping("/mul/{a}/{b}")
	public String mul(@PathVariable("a") int x, @PathVariable("b") int y) {
		return "Multiplication of x*y = " + (x * y);
	}

	@GetMapping("/div/{a}/{b}")
	public String div(@PathVariable("a") int x, @PathVariable("b") int y) {
		return "Division of x/y = " + (x / y);
	}

	@GetMapping("/myinfo/{name}/{age}")
	public String myinfo(@PathVariable String name, @PathVariable int age) {
		return "My Name is " + name + " age is " + age;
	}

	@GetMapping("/si/{p}/{r}/{t}")
	public String si(@PathVariable double p, @PathVariable double r, @PathVariable double t) {
		return "Simple Interest Is = " + (p * r * t) / 100;
	}

}
