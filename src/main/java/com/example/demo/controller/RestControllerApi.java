package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping
public class RestControllerApi {
    
	 @GetMapping("/getpolicyinfo")
	 public String getPolicyNum() {
		 return "null";
	 }
}
