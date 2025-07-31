package com.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.entity.Employee_D3;

@RestController
public class EmployeeController_D3 {

	List<Employee_D3> emp = new ArrayList<>();

	EmployeeController_D3(){
		Employee_D3 e1 = new Employee_D3(1, "Aj", "Dev");
		emp.add(e1);
		
	}
	
//	@PostMapping("/addemp")
//	public String addEmployee(@RequestBody Employee e2) {
//		emp.add(e2);
//		return "Details added succesfully";
//
//	}
	
	
//	used to add and get details at a same time
	
	@PostMapping("/addemp")
	public List<Employee_D3> addEmployee(@RequestBody Employee_D3 e2) {
		emp.add(e2);
		return emp;
	}
	
	@GetMapping("/details")
	public List<Employee_D3> find(){
		return emp;
	}
}
