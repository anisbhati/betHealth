package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.repository.Customer;
import com.sun.tools.javac.util.List;

@RequestMapping
public class RestControllerApi {

	@Autowired
	Customer crepo;

	@GetMapping("/test")
	public String getTest() {
		return "betHeath up..........";
	}

	@GetMapping("/allcustomer")
    public java.util.List<com.example.demo.entity.Customer>  getAllCostemer(){	
	    //   java.util.List<com.example.demo.entity.Customer> l=crepo.findAll();
	return null;
}
}