package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@GetMapping("/home")
	public String message() {
		
		System.out.println("inside message()");
		
		return "Hi, how are you?";
	}

}
