package com.example.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class HelloSpringBootController {
	
	@GetMapping("/hello-springboot")
	public String helloSpringBoot() {
		return "Hello Spring Boot Rest API";
	}
}
