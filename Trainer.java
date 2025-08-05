package com;

import org.springframework.stereotype.Component;

@Component
public class Trainer {

	public String getTrainerInfo(String trainername, String subject) {

		return "Trainer name is " + trainername + " and she is teaching " + subject;

	}

}
