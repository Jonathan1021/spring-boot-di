package com.example.springboot.di.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.springboot.di.app.services.IService;

@Controller
public class IndexController {
	
	@Autowired
	private IService myService;

	@GetMapping({ "", "/", "/index" })
	public String index(Model model) {
		model.addAttribute("title", myService.operation());
		return "index";
	}
}
