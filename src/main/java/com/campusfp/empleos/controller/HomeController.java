package com.campusfp.empleos.controller;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HomeController {

	@GetMapping("/")
	public String inicio() {
		//Renderizar la plantilla llamada index.html
		return("index");
	}
	
	
	
	
	
	
	@GetMapping("/listado")
	public String listado(Model model) {
		
		List<String> lista = new LinkedList<String>();
		
		lista.add("Ingerniero Informático");
		lista.add("Desarrollador Back-End");
		lista.add("Desarrollador Front-End");
		lista.add("Maquetador Web");
		
		model.addAttribute("listado", lista);
		
		return("listado");
	}
	
	
	
	
	@GetMapping("/detalle")
	public String detalle(Model model) {
		
		model.addAttribute("mensaje", "Hola esto es un mensaje dinámico");
		model.addAttribute("fecha", new Date());
		
		String nombre = "Programador Front";
		Date fPublicacion = new Date();
		double salario = 1800.00;
		boolean vigente = true;
		
		model.addAttribute("nombreoferta", nombre);
		model.addAttribute("fechapublicaion", fPublicacion);
		model.addAttribute("salarioofertado", salario);
		model.addAttribute("estavigente", vigente);
		
		return("detalle");
	}
	
}
