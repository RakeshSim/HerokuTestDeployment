package com.example.easynotes.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HellowWorldController {

	@GetMapping("/hello")
	public String helloIndia() {
		
		return "Hellow India and World";
	}
}
