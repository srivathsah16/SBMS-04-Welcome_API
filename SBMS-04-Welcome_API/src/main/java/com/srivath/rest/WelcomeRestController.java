package com.srivath.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.srivath.feign.GreetFeignClient;

@RestController
public class WelcomeRestController {

	@Autowired
	private GreetFeignClient feignClient;

	@GetMapping("/welcome")
	public String welcome() {
		String msg = feignClient.invokeGreetMethod();
		return msg+" Welcome to Java Microservices";
	}
}
