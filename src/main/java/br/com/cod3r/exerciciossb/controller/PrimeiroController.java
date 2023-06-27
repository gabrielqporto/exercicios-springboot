package br.com.cod3r.exerciciossb.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrimeiroController {
	
//	@RequestMapping(method = RequestMethod.GET, path = "/ola")
	@GetMapping(path = {"/ola", "/saudacao"})
	public String ola() {
		return "Olá Sptring Boot";
	}

//	@PostMapping(path = "/saudacao")
//	public String saudacao() {
//		return "Olá Sptring Boot (POST)";
//	}
	
	
	
	
}