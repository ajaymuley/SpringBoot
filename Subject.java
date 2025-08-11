package com;

import org.springframework.stereotype.Component;

@Component
public class Subject {

	String sname="Core java";
	public String getsubinfo() {
		
		return "Subject name is "+sname;
	}
	
}
