package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.models.Usuario;
import com.example.demo.models.UsuarioLogin;
import com.example.demo.services.ServicioUsuarios;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;

@Controller
public class ControladorUsuarios {

	@Autowired
	private ServicioUsuarios servicioUsuarios;
	
	
	@GetMapping("/")
	public String inicio(HttpSession sesion, Model modelo) {

		sesion.invalidate();
		modelo.addAttribute("usuario", new Usuario());
		modelo.addAttribute("usuarioLogin", new UsuarioLogin());
		return "index.jsp";
	}
	
	@GetMapping("/logout")
	public String logout(HttpSession sesion) {
		sesion.invalidate();
		return "redirect:/";
	}
	
	@PostMapping("/procesa/registro")
	public String procesaRegistro(@Valid @ModelAttribute("usuario") Usuario usuario, BindingResult validaciones, HttpSession sesion, Model modelo) {
		validaciones = this.servicioUsuarios.validarRegistro(validaciones, usuario);
		if(validaciones.hasErrors()) {
			modelo.addAttribute("usuarioLogin", new UsuarioLogin());
			return "index.jsp";
		}
		Usuario usuarioCreado = this.servicioUsuarios.crear(usuario);
		sesion.setAttribute("idUsuario", usuarioCreado.getId());
		return "inicio.jsp";
	}
	
	@PostMapping("/procesa/login")
	public String procesaLogin(@Valid @ModelAttribute("usuarioLogin") UsuarioLogin usuarioLogin, BindingResult validaciones, Model modelo , HttpSession sesion) {
		validaciones = this.servicioUsuarios.validarLogin(validaciones, usuarioLogin);
		if(validaciones.hasErrors()) {
			modelo.addAttribute("usuario", new Usuario());
			return "index.jsp";
		}
		Usuario usuarioDB = this.servicioUsuarios.obtenerPorUsuario(usuarioLogin.getNombreUsuario());
		sesion.setAttribute("idUsuario", usuarioDB.getId());
		return "inicio.jsp";
	}
}
