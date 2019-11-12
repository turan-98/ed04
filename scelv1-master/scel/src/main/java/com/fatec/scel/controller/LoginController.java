package com.fatec.scel.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;


@Controller
public class LoginController {
	@GetMapping("/login")
	public String login() {
		return "login";
	}
}
