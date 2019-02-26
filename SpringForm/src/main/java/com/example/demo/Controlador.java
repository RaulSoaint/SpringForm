package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.example.pojo.Person;

@Controller
public class Controlador implements WebMvcConfigurer{

	@GetMapping("/")
	public String getIndex() {
		return "index";
		
	}
	
	@GetMapping("/form")
	public String getForm(Person person) {
		return "form";
	}
	
	@PostMapping("/form")
	public String getResult() {
			return "result";	
	}
}
