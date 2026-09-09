package com.akps.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class SampleController {
	
	@GetMapping
    public String home() {
		
        return "Hello from Spring Boot CI/CD!";
    }

    @GetMapping("/hello")
    public String hello() {
    	
        return "Hello, CircleCI + Argo CD!";
    }

}
