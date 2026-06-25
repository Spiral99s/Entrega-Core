package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.models.Artista;
import com.example.demo.models.Cancion;
import com.example.demo.services.ServicioArtistas;
import com.example.demo.services.ServicioCanciones;

import jakarta.validation.Valid;

@Controller
public class ControladorCanciones {
	
	@Autowired
	private ServicioCanciones servicioCanciones;
	
	@Autowired	
	private ServicioArtistas servicioArtistas;

	
	@GetMapping("/canciones")
	public String desplegarCanciones(Model modelo){
		List<Cancion> listaCanciones = this.servicioCanciones.obtenerTodasLasCanciones();
		modelo.addAttribute("canciones", listaCanciones);
		return "canciones.jsp";
	}
	
	@GetMapping("/canciones/detalle/{id}")
	public String desplegarDetalleCancion(@PathVariable("id") Long id, Model modelo) {
		Cancion cancion = this.servicioCanciones.obtenerCancionPorId(id);
		modelo.addAttribute("cancion", cancion);
		return "detalleCancion.jsp";
	}
	
	@GetMapping("/canciones/formulario/agregar")
	public String formularioAgregarCancion(@ModelAttribute("cancion") Cancion cancion, Model modelo) {
		List<Artista> listaArtistas = this.servicioArtistas.obtenerTodosLosArtistas();
		modelo.addAttribute("cancion", new Cancion());
		modelo.addAttribute("listaArtistas", listaArtistas);
		return "agregarCancion.jsp";
	}
	
	@PostMapping("/canciones/procesa/agregar")
	public String procesarAgregarCancion(@Valid @ModelAttribute("cancion") Cancion cancion, BindingResult validaciones, @RequestParam(value = "idArtista", required = false) Long idArtista, Model modelo) {
		if(validaciones.hasErrors()) {
			modelo.addAttribute("listaArtistas", this.servicioArtistas.obtenerTodosLosArtistas());
			return "agregarCancion.jsp";
		}
		Artista artista = this.servicioArtistas.obtenerArtistaPorId(idArtista);
		cancion.setArtista(artista);
		this.servicioCanciones.agregarCancion(cancion);
			return "redirect:/canciones";
	}
	
	@GetMapping("/canciones/formulario/editar/{id}")
	public String formularioEditarCancion(@PathVariable("id") Long id, @ModelAttribute("cancion") Cancion cancion, Model modelo) {
		modelo.addAttribute("cancion", this.servicioCanciones.obtenerCancionPorId(id));
		modelo.addAttribute("listaArtista", this.servicioArtistas.obtenerTodosLosArtistas());
		return "editarCancion.jsp";
	}
	
	@PutMapping("/canciones/procesa/editar/{id}")
	public String procesarEditarCancion(@Valid @ModelAttribute("cancion") Cancion cancion, BindingResult validaciones, @PathVariable("id") Long id, @RequestParam(value = "idArtista", required = false) Long idArtista, Model modelo) {
		if(validaciones.hasErrors()) {
			modelo.addAttribute("listaArtistas", this.servicioArtistas.obtenerTodosLosArtistas());
			return "editarCancion.jsp";
		}
		Artista artista = this.servicioArtistas.obtenerArtistaPorId(idArtista);
	    cancion.setArtista(artista);
	    
		this.servicioCanciones.actualizarCancion(cancion);
		return "redirect:/canciones";
	}
	
	@DeleteMapping("/canciones/eliminar/{id}")
	public String procesarEliminarCancion(@PathVariable("id") Long id) {
		this.servicioCanciones.eliminaCancion(id);
		return "redirect:/canciones";
	}
	
}
