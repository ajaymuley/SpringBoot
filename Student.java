package com;

import org.springframework.stereotype.Component;

@Component
public class Student {

	String name = "Ajay";
	int age = 27;

	public String studinfo() {

		return "Name of student is " + name + " and age is " + age;
	}

}
