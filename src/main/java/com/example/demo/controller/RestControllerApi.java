package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping
public class RestControllerApi {
    
	@GetMapping("/test")
	public String getTest() {
		return "betHeath up..........";
	}
}