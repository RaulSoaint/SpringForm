package com.example.demo;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.pojo.Persona;

@Controller
public class Controlador {

	@RequestMapping("/")
	public String getIndex() {
		return "index";
		
	}
	@RequestMapping("/form")
	public String getForm(Persona persona) {
		return "form";
	}
	@RequestMapping(value = "/actionForm", method = RequestMethod.POST)
	public String getResult(@Valid Persona persona, BindingResult binding) {
		if(binding.hasErrors()) {
			return "form";
		}
		return "result";
	}
}
