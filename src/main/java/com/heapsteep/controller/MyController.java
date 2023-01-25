package com.heapsteep.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	@GetMapping("/api5")
	public String api5() {
		return "Success from microservie-5";
	}
}
