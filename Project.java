package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Project {

	String pname = "SBI Bank";

	Developer d;

	@Autowired
	public void setdev(Developer d1) {
		this.d = d1;

	}
	
	public String getdevinfo() {
		return "Project name is "+pname+ " developer is "+d.getd();
		
	}

}
