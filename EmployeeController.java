package com.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.entity.Employee;

@RestController
public class EmployeeController {

	List<Employee> emp = new ArrayList<>();

	EmployeeController() {
		Employee e1 = new Employee(1, "Aj", "Dev");
		emp.add(e1);

	}

//	@PostMapping("/addemp")
//	public String addEmployee(@RequestBody Employee e2) {
//		emp.add(e2);
//		return "Details added succesfully";
//
//	}

//	used to add and get details at a same time
//	
//	@PostMapping("/addemp")
//	public List<Employee_D3> addEmployee(@RequestBody Employee_D3 e2) {
//		emp.add(e2);
//		return emp;
//	}

	@GetMapping("/details")
	public List<Employee> find() {
		return emp;
	}

	@PostMapping("/addempdata")
	public String adddata(@RequestBody List<Employee> emp1) {

		emp.addAll(emp1);
		return "Details Added Succeessfully";
	}

// find by ID
	@GetMapping("/findempbyid")
	public Employee findbyid(@RequestParam int empid) {

		for (Employee e : emp) {

			if (e.getEmpid() == empid) {
				return e;
			}
		}

		return null;
	}

	@GetMapping("/findbyname")
	public Employee findbyname(@RequestParam String name) {
		for (Employee n : emp) {
			if (n.getEmpname().equalsIgnoreCase(name)) {
				return n;
			}
		}

		return null;
	}

	@GetMapping("/findbydept")
	public Employee findbydept(@RequestParam String dept) {
		for (Employee e : emp) {
			if (e.getDept().equalsIgnoreCase(dept)) {
				return e;
			}
		}
		return null;
	}

	@DeleteMapping("/del")
	public String del(@RequestParam int id) {
		for (Employee e : emp) {
			if (e.getEmpid() == id) {
				emp.remove(id);
				return "Deleted successfully";
			}
		}
		return "Not found";
	}

	
	
	
	
	
//	UPDATE RECORD USING PUTMAPPING

	@PutMapping("/update")
	public String update(@RequestParam int empid, @RequestBody Employee newemp) {
		Employee existingemp = new Employee();

		for (Employee e : emp) {

			if (e.getEmpid() == empid) {
				existingemp = e;
			}
		}

		if (existingemp.getEmpid() == 0) {
			return "No record found";
		}
		if (newemp.getEmpname() == null && newemp.getDept() == null) {
			return "no new record found for updation";
		}

		if (newemp.getEmpname() != null) {
			existingemp.setEmpname(newemp.getEmpname());
		}
		if (newemp.getDept() != null) {
			existingemp.setDept(newemp.getDept());
		}
		return "Data updated successfully";
	}

}
