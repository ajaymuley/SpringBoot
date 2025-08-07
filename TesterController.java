package com.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.entity.Tester;

@RestController
public class TesterController {

	List<Tester> tlist = new ArrayList<>();

	TesterController() {
		Tester t1 = new Tester(101, "Ajay", "Java Developer");
		tlist.add(t1);

	}
// Post Mapping >> Add data through Postman
	@PostMapping("/tester/add")
	public String addTest(@RequestBody List<Tester> tester) {
		tlist.addAll(tester);
		return "Record added Successfully";
	}
// Get Mapping >> Get all data from list
	@GetMapping("/gettester")
	public List<Tester> t() {

		return tlist;
	}
// Delete Controller >> To delete data by using id
	@DeleteMapping("/deltester/{id}")
	public String deltester(@PathVariable("id") int id) {
		for (Tester t : tlist) {
			if (t.getId() == id) {
				tlist.remove(id);
				return "Record deleted successfully";
			}

		}
		return "No record found";
	}
// Put Mapping >> To update existing data 
	@PutMapping("/updatetester")
	public String updatetester(@RequestParam int id, @RequestBody Tester newtester) {

		Tester extest = new Tester();
		for (Tester t : tlist) {
			if (t.getId() == id) {
				extest = t;
			}
		}

		if (extest.getId() == 0) {
			return "No record found";
		}
		if (newtester.getName() == null && newtester.getDesignation() == null) {
			return "no new record found for updation";
		}

		if (newtester.getName() != null) {
			extest.setName(newtester.getName());
		}
		if (newtester.getDesignation() != null) {
			extest.setDesignation(newtester.getDesignation());
		}
		return "Record updated successfully";
	}

//	Find By Id
	@GetMapping("/tfindbyid")
	public Tester findbytid(@RequestParam int id) {
		for (Tester t : tlist) {
			if (t.getId() == id) {
				return t;
			}
		}
		return null;
	}

//	Find By Name
	@GetMapping("/tfindbyname")
	public Tester findbytname(@RequestParam String name) {

		for (Tester t : tlist) {
			if (t.getName().equalsIgnoreCase(name)) {
				return t;
			}
		}
		return null;
	}

//	Find By Designation
	@GetMapping("/tfindbydes")
	public Tester findbytdes(@RequestParam String des) {
		for (Tester t : tlist) {
			if (t.getDesignation().equalsIgnoreCase(des)) {
				return t;
			}
		}
		return null;
	}
}
