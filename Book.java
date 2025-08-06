package com;

import org.springframework.stereotype.Component;

@Component
public class Book {

	String bname="Core Java";
	String author="xyz";
	Double price=536.00;
	
	public String binfi() {
		
		return "Book name is "+bname+" Author is "+author+" price is "+price; 
		
	}
	
	
}
