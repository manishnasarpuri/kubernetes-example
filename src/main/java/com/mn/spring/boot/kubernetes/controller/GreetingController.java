package com.mn.spring.boot.kubernetes.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/kubernetes/")
public class GreetingController {
	
	@GetMapping(value = "message")
	@ResponseBody
	public String publishMessage() {
		return "Welcome to my kubernetes";
	}
	
}
