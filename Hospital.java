package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Hospital {

	String hname = "Bharti Hospital";
	String location="Pune";
	
	@Autowired
	Doctor d;
	public String gethospitalinfo() {
		
		return"Hospital name is "+hname+" Located in "+location+ "\n"+" Available Doctors are "+d.getdrinfo(); 
		
	}
	
}
