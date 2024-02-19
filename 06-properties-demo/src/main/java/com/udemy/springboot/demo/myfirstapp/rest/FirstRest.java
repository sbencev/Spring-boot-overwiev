package com.udemy.springboot.demo.myfirstapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstRest {

	@Value("${coach.name}")
	private String coachName;

	@Value("${team.name}")
	private String teamName;

	@GetMapping("/teaminfo")
	public String getTEamInfo() {

		return "Coach: " + coachName + ", Team Name: " + teamName;

	}

	@GetMapping("/")
	public String sayHello() {

		return "Hello World!";

	}

	@GetMapping("/workout")
	public String getDailyWorkout() {

		return "Run a hard 5k!";

	}

}
