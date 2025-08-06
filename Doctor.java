package com;

import org.springframework.stereotype.Component;

@Component
public class Doctor {

	String dname="Dr.Ajay";
	String speciality="MD Medicine";
	public String getdrinfo() {
		return dname+" specialist in "+speciality;
		
	}
	
	
}
 