package com.bahaa.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication

public class HelloWorldApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(HelloWorldApplication.class, args);
	}
	@RestController
	@RequestMapping("/hello")
	public class HomeController {
	        @RequestMapping("")
	        public String hello() {
	                return "Hello World!";
	        }
	        @RequestMapping("/world")
	        public String world() {
	                return "Class level annotations are cool too!";
	        }
	}
	



}
