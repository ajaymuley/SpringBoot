package com;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Library {

	String lname = "Abc library";

	Book b;

//	@Autowired
	Library(Book b1) {
		this.b = b1;

	}

	public String libinfo() {
	return "Library name is "+lname+" "+b.binfi(); 
	}
}
 