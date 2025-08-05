package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class College {
	@Autowired

	Student s;
	String cname = "MIT";

	public String collegeInfo() {
		return s.studinfo() + "\n" + "Belongs to " + cname + " college";

	}

}
