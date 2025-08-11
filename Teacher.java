package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Teacher {

	@Autowired
	Subject s;
	String tname="Ajay";
	
	public String gettinfo() {
		return  s.getsubinfo()+" Teacher is "+tname;
		
	}
}
