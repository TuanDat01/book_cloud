package com.crni99.bookstore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

	@GetMapping("/nhap")
	public String showLoginPage() {

		return "login";
	}

	@GetMapping("/access-denied")
	public String showAccessDenied() {
		return "error";
	}

}