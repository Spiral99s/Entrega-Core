package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.models.Cancion;
import com.example.demo.services.ServicioCanciones;

@Controller
public class ControladorCanciones {
	
	@Autowired
	private ServicioCanciones servicioCanciones;

	
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
}
