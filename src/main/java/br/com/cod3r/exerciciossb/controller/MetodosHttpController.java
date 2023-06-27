package br.com.cod3r.exerciciossb.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MetodosHttpController {
	
	@GetMapping
	public String get() {
		return "Resquisição GET";
	}
	
	@PostMapping
	public String post() {
		return "Resquisição POST";
	}
	
	@PutMapping
	public String put() {
		return "Resquisição PUT";
	}
	
	@PatchMapping
	public String patch() {
		return "Resquisição PATCH";
	}
	
	@DeleteMapping
	public String delete() {
		return "Resquisição DELETE";
	}
}
