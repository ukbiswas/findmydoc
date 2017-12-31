package com.findmydoc.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DoctorController {
	
	@RequestMapping("/hello")
	public String hello() {
		return "Hello! How are you!";
	}
}
