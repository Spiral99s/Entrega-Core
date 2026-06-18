package com.example.demo.controladores;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControladorPeliculas {

	private static HashMap<String, String> listaPeliculas = new HashMap<String, String>();
	
	public ControladorPeliculas() {
		listaPeliculas.put("Winnie the Pooh", "Don Hall");	
		listaPeliculas.put("El zorro y el sabueso", "Ted Berman");
		listaPeliculas.put("Tarzán", "Kevin Lima");		
		listaPeliculas.put("Mulán", "Barry Cook");
		listaPeliculas.put("Oliver", "Kevin Lima");	
		listaPeliculas.put("Big Hero 6", "Don Hall");	
	}
	
	@GetMapping("/peliculas")
	public String obtenerTodasLasPeliculas() {
		String v = "";
		for(String pelicula: listaPeliculas.keySet()) {
			String director = listaPeliculas.get(pelicula);
			v = v + "Película: " + pelicula + ", dirigida por " + director + ".";
		}
		return v;
	}

	
	
	@GetMapping("/peliculas/{nombre}")
	public String obtenerPeliculaPorNombre(@PathVariable String nombre) {
		for(String key: listaPeliculas.keySet()) {
			if (key.equalsIgnoreCase(nombre)) {
				return "La pelicula " + key + ", dirigida por " + listaPeliculas.get(key) + ".";
			}
		}
			return "La película no se encuentra en nuestra lista.";
		}
	
	
	
	@GetMapping("/peliculas/director/{nombre}")
	public String obtenerPeliculasPorDirector(@PathVariable("nombre") String nombre) {
		ArrayList<String> peliculasEncontradas = new ArrayList<>();

		for(String pelicula: listaPeliculas.keySet()) {
			String director = listaPeliculas.get(pelicula);
		
			if(director.equalsIgnoreCase(nombre)) {
				peliculasEncontradas.add(pelicula);
			}
		}
		if (!peliculasEncontradas.isEmpty()) {
			return "El director " + nombre + " ha dirigido las siguientes películas: " + peliculasEncontradas;
		}else {
			return "No contamos con películas de ese director en nuestra lista.";
		}
	}
}
