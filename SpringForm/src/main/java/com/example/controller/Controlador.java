package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.pojo.Person;

@Controller
public class Controlador {

	@RequestMapping(value = "/form")
	public String getForm(@ModelAttribute Person person ) {
		return"form";
	}
}
