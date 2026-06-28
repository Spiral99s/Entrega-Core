package com.example.demo.models;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import jakarta.persistence.Transient;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

@Entity
@Table(name="usuarios")
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message = "Por favor proporciona tu nombre")
	@Size(min = 3, max=15, message = "Debe contener entre 3 y 15 caracteres.")
	private String nombreUsuario;
	
	@NotBlank(message = "Por favor proporciona tu contraseña")
	@Size(min = 8, message = "El password necesita tener al menos 8 catacteres.")
	@Pattern(regexp = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{8,}$", message = "El password necesita incluir al menos una letra mayúscula, una letra minúscula y un número")
	private String password;
	
	@Transient
	private String confirmarPassword;
	
	@NotBlank(message = "Por favor proporciona tu correo")
	@Email(message = "Por favor ingresa un correo válido.")
	private String correo;
	
	@NotBlank(message = "Por favor proporciona tu nombre")
	@Size(min = 3, message = "Debe contener al menos 3 caracteres.")
	@Pattern(regexp = "^[^0-9]+$", message = "El nombre no puede contener números")
	private String nombre;
	
	@NotBlank(message = "Por favor proporciona tu apellido")
	@Size(min = 3, message = "Debe contener al menos 3 caracteres.")
	@Pattern(regexp = "^[^0-9]+$", message = "El apellido no puede contener números")
	private String apellido;
	
	@Past(message = "Tu fecha de nacimiento necesita ser una fecha en el pasado.")
	@DateTimeFormat(pattern="dd-MM-yyyy")
	private LocalDate fechaDeNacimiento;
	
	@Column(updatable = false)
	@DateTimeFormat(pattern="dd-MM-yyyy")
	private LocalDate fechaCreacion;
	
	@DateTimeFormat(pattern="dd-MM-yyyy")
	private LocalDate fechaActualizacion;

	public Usuario() {
		super();
	}



	public Usuario(Long id,
			String nombreUsuario,
			String password,
			String confirmarPassword,
			String correo,
			String nombre,
			String apellido,
			LocalDate fechaDeNacimiento,
			LocalDate fechaCreacion, LocalDate fechaActualizacion) {
		super();
		this.id = id;
		this.nombreUsuario = nombreUsuario;
		this.password = password;
		this.confirmarPassword = confirmarPassword;
		this.correo = correo;
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaDeNacimiento = fechaDeNacimiento;
		this.fechaCreacion = fechaCreacion;
		this.fechaActualizacion = fechaActualizacion;
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public String getConfirmarPassword() {
		return confirmarPassword;
	}

	public void setConfirmarPassword(String confirmarPassword) {
		this.confirmarPassword = confirmarPassword;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public LocalDate getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}

	public void setFechaDeNacimiento(LocalDate fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}

	public LocalDate getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(LocalDate fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public LocalDate getFechaActualizacion() {
		return fechaActualizacion;
	}

	public void setFechaActualizacion(LocalDate fechaActualizacion) {
		this.fechaActualizacion = fechaActualizacion;
	}

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nombreUsuario=" + nombreUsuario + ", password=" + password
				+ ", confirmarPassword=" + confirmarPassword + ", correo=" + correo + ", nombre=" + nombre
				+ ", apellido=" + apellido + ", fechaDeNacimiento=" + fechaDeNacimiento + ", fechaCreacion="
				+ fechaCreacion + ", fechaActualizacion=" + fechaActualizacion + "]";
	}
	
}
