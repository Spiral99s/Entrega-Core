package com.example.demo.models;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class UsuarioLogin {

	@NotBlank(message = "Por favor proporciona tu nombre")
	@Size(min = 3, max=15, message = "Debe contener entre 3 y 15 caracteres.")
	private String nombreUsuario;
	
	@NotBlank(message = "Por favor proporciona tu contraseña")
	@Size(min = 8, message = "El password necesita tener al menos 8 catacteres.")
	@Pattern(regexp = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{8,}$", message = "El password necesita incluir al menos una letra mayúscula, una letra minúscula y un número")
	private String password;

	public UsuarioLogin() {
		super();
	}

	public UsuarioLogin(String nombreUsuario,String password){
		super();
		this.nombreUsuario = nombreUsuario;
		this.password = password;
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "UsuarioLogin [nombreUsuario=" + nombreUsuario + ", password=" + password + "]";
	}
	
}
