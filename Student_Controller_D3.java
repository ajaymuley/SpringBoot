package com.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.entity.Student_D3;

@RestController
public class Student_Controller_D3 {

	List<Student_D3> studlist = new ArrayList<>();

	Student_Controller_D3() {

		Student_D3 s1 = new Student_D3(1, "Aj", "Java");
		studlist.add(s1);

	}

	@PostMapping("/addstud")
	public String addStudent(@RequestBody Student_D3 s2) {
		studlist.add(s2);
		return "Details added succesfully";

	}

}
