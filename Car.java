package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {

	@Autowired
	Engine e;

	public String run() {

//		System.out.println(e.start());
		return e.start()+"\n"+" I am driving";

	}
}
