package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Trainer;

@RestController
public class TrainerController {

	@Autowired
	Trainer t;

	@PostMapping("/trainer/info")
	public String infoo(@RequestParam String trainername, @RequestParam String subject) {
		return t.getTrainerInfo(trainername, subject);

	}

}
