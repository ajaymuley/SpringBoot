package com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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

	@GetMapping("/display")
	public String display(@RequestParam String name, @RequestParam int age) {
		return "My name is " + name + " Age is " + age;
	}

	@GetMapping("/addition")
	public String add(@RequestParam int num1, @RequestParam int num2, @RequestParam int num3) {

		return "Addition of 3 numbers = " + (num1 + num2 + num3);
	}

	@GetMapping("/subtraction")
	public String sub(@RequestParam int num1, @RequestParam int num2, @RequestParam int num3) {

		return "Subtraction of 3 numbers = " + (num1 - num2 - num3);
	}

	@GetMapping("/swap")
	public String swap(@RequestParam int a, @RequestParam int b) {

		int temp = a;
		a = b;
		b = temp;
		return "After swap A is " + a + " and B is " + b;
	}

	@GetMapping("/circle")
	public String area(@RequestParam int r) {
		return "Area of Circle = " + 3.14 * r * r;

	}

	@RequestMapping("/mod")
	public String mod(@RequestParam int a, @RequestParam int b) {

		return "Result of Mod op : " + (a % b);
	}

	@RequestMapping("/emp")
	public String emp_detail(@RequestParam String name, @RequestParam String dept) {
		return "Employee name is " + name + " and Department is " + dept;
	}

	
	 
	
	
	
	
	
	
}
