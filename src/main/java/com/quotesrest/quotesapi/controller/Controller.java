package com.quotesrest.quotesapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@GetMapping("/")
	public String test() {
		return "Test invoke successfull!";
	}
}
