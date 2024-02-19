package com.udemy.springboot.demo.myfirstapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstRest {

	@GetMapping("/")
	public String sayHello() {

		return "Hello World!";

	}
	
	@GetMapping("/workout")
	public String getDailyWorkout() {
		
		return "Run a hard 5k!";
		
	}

}
