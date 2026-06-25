package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.models.Artista;
import com.example.demo.services.ServicioArtistas;

import jakarta.validation.Valid;

@Controller
public class ControladorArtistas {
	
	@Autowired
	private ServicioArtistas servicioArtistas;
	
	@GetMapping("/artistas")
	public String desplegarArtistas(Model modelo) {
		List<Artista> listaArtistas = this.servicioArtistas.obtenerTodosLosArtistas();
		modelo.addAttribute("artistas", listaArtistas);
		return "artistas.jsp";
	}
	
	@GetMapping("/artistas/detalle/{id}")
	public String desplegarDetalleArtista(@PathVariable("id") Long id, Model modelo) {
		Artista artista = this.servicioArtistas.obtenerArtistaPorId(id);
		modelo.addAttribute("artista", artista);
		return "detalleArtista.jsp";
	}
	
	@GetMapping("/artistas/formulario/agregar")
	public String formularioAgregarArtista(@ModelAttribute("artista") Artista artista, Model modelo) {
		modelo.addAttribute("artista", new Artista());
		return "agregarArtista.jsp";
	}
	
	@PostMapping("/artistas/procesa/agregar")
	public String procesarAgregarArtista(@Valid @ModelAttribute("artista") Artista artista, BindingResult validaciones) {
		if(validaciones.hasErrors()) {
			return "agregarArtista.jsp";
		}
		this.servicioArtistas.agregarArtista(artista);
		return "redirect:/artistas";
	}
	
	
}
