package com.example.demo.controllers;


import java.util.HashMap;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.models.Libro;



@Controller
public class ControladorLibros {

	private static HashMap<String, String> listaLibros = new HashMap<String, String>();
	
	public ControladorLibros() {
		listaLibros.put("Odisea", "Homero");
		listaLibros.put("Don Quijote de la Mancha", "Miguel de Cervantes"); 
		listaLibros.put("El Código Da Vinci", "Dan Brown");		
		listaLibros.put("Alicia en el país de las maravillas", "Lewis Carroll");
		listaLibros.put("El Hobbit", "J.R.R. Tolkien");	
		listaLibros.put("El alquimista", "Paulo Coelho");	
	}
	
	@GetMapping("/libros")
	public String obtenerTodosLosLibros(Model modelo) {
        modelo.addAttribute("listaLibros", listaLibros);
        return "libros";
	}
	
	@GetMapping("/libros/{nombre}")
    public String obtenerInformacionDeLibro(@PathVariable("nombre") String nombre, Model modelo) {
        if (!listaLibros.containsKey(nombre)) {
            modelo.addAttribute("mensajeError", "El libro no se encuentra en nuestra lista.");
        } else {
            modelo.addAttribute("libro", nombre);
            modelo.addAttribute("autor", listaLibros.get(nombre));
        }
        return "detalleLibro";
	}
	
	@GetMapping("/libros/formulario")
	public String formularioLibros() {
		return "formularioLibros";
	}
	
	@PostMapping("/procesa/libro")
	public String procesaLibro(@RequestParam String nombreLibro, @RequestParam String autor) {
		listaLibros.put(nombreLibro, autor);
		return "redirect:/libros";
	}
	

}
