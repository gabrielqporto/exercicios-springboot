package br.com.cod3r.exerciciossb.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.cod3r.exerciciossb.models.entities.Calculadora;

@RestController
@RequestMapping("/calculadora")
public class CalculadoraController {
	
	@GetMapping("/somar/{n1}/{n2}")
	public int somar(@PathVariable int n1, @PathVariable int n2) {
		return n1+n2; 
	}
	
	@GetMapping("/subtrair")
	public int subtrair(@RequestParam(name = "n1") int n1, @RequestParam(name = "n2") int n2) {
		return n1 - n2;
	}
}
