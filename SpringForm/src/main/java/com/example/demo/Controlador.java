package com.example.demo;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
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
	public String getResult(@Valid Person person, BindingResult bindingResult,Model model) {
		if(bindingResult.hasErrors()) {
			
			return "form";
		}	
		model.addAttribute("Persona", person);
		return "result";	
	}
}
