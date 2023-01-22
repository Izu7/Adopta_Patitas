package com.adoptaPatitas.proyecto.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

	@GetMapping("/hola")
	public String index() {
		return "index.jsp";
	}
}
