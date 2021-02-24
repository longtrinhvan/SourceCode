package com.example.demo.controller.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

	@GetMapping("/loginAdmin")
	public String login(Model model) {
		
		return "login/login";
	}
	
	@GetMapping("/loginAdmin1")
	public String login1(Model model) {
		
		return "login/login/login";
	}
	
}
