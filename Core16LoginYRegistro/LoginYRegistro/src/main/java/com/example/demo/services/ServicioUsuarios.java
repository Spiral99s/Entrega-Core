package com.example.demo.services;

import java.util.List;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import com.example.demo.models.Usuario;
import com.example.demo.models.UsuarioLogin;
import com.example.demo.repositories.RepositorioUsuarios;


@Service
public class ServicioUsuarios {
	
	@Autowired
	private RepositorioUsuarios repositorioUsuarios;
	
	public Usuario crear(Usuario usuario) {
		String hashPassword = BCrypt.hashpw(usuario.getPassword(), BCrypt.gensalt());
		usuario.setPassword(hashPassword);
		return this.repositorioUsuarios.save(usuario);
	}
	
	public List<Usuario> obtenerTodos(){
		return (List <Usuario>) this.repositorioUsuarios.findAll();
	}
	
	public Usuario obtenerPorId(Long id) {
		return this.repositorioUsuarios.findById(id).orElse(null);
	}
	
	public Usuario obtenerPorUsuario(String nombreUsuario) {
		return this.repositorioUsuarios.findByNombreUsuario(nombreUsuario).orElse(null);
	}
	
	public Usuario actualizar(Usuario usuario) {
		return this.repositorioUsuarios.save(usuario);
	}
	
	public void eliminar(Long id) {
		this.repositorioUsuarios.deleteById(id);
	}
	
	public BindingResult validarLogin(BindingResult validaciones, UsuarioLogin usuarioLogin) {
	    Usuario usuarioDB = this.obtenerPorUsuario(usuarioLogin.getNombreUsuario());
	    if(usuarioDB == null) {
	        validaciones.rejectValue("nombreUsuario", "usuarioInexistente", "Usuario no encontrado.");
	    } else {
	        if(!BCrypt.checkpw(usuarioLogin.getPassword(), usuarioDB.getPassword())) {
	            validaciones.rejectValue("password", "passwordIncorrecta", "Contraseña incorrecta.");
	        }
	    }
	    return validaciones;
	}

	public BindingResult validarRegistro(BindingResult validaciones, Usuario usuario) {
	    Usuario usuarioDB = this.obtenerPorUsuario(usuario.getNombreUsuario());
	    
	    if(usuarioDB == null) {
	        if(!usuario.getPassword().equals(usuario.getConfirmarPassword())) {
	            validaciones.rejectValue("confirmarPassword", "passwordNoCoincide", "Las contraseñas no coinciden.");
	        }
	    } else {
	        validaciones.rejectValue("nombreUsuario", "usuarioExistente", "El nombre de usuario ya está en uso.");
	    }
	    
	    return validaciones;
	}
}
