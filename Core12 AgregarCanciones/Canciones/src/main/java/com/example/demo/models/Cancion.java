package com.example.demo.models;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;


@Entity
@Table(name = "canciones")
public class Cancion {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull(message = "Este campo es obligatorio.")
	@Size(min = 5, message = "Debe contener mínimo 5 caracteres.")
	private String titulo;
	
	@NotNull(message = "Este campo es obligatorio.")
	@Size(min = 3, message = "Debe contener mínimo 3 caracteres.")
	private String artista;
	
	@NotNull(message = "Este campo es obligatorio.")
	@Size(min = 3, message = "Debe contener mínimo 3 caracteres.")
	private String album;
	
	@NotNull(message = "Este campo es obligatorio.")
	@Size(min = 3, message = "Debe contener mínimo 3 caracteres.")
	private String genero;
	
	@NotBlank 
	@Size(min = 3, message = "Debe contener mínimo 3 caracteres.")
	private String idioma;
	

	@DateTimeFormat(pattern="dd-MM-yyy")
	private LocalDate fechaCreacion;
	

	@DateTimeFormat(pattern="dd-MM-yyy")
	private LocalDate fechaActualizacion;

	public Cancion() {
		super();
	}
	
	@PrePersist
	protected void onCreate() {
		this.fechaCreacion = LocalDate.now();
	    this.fechaActualizacion = this.fechaCreacion;
	}
	
	@PreUpdate
	protected void onUpdate() {
		this.fechaActualizacion = LocalDate.now();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getArtista() {
		return artista;
	}

	public void setArtista(String artista) {
		this.artista = artista;
	}

	public String getAlbum() {
		return album;
	}

	public void setAlbum(String album) {
		this.album = album;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getIdioma() {
		return idioma;
	}

	public void setIdioma(String idioma) {
		this.idioma = idioma;
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
		return "Cancion [id=" + id + ", titulo=" + titulo + ", artista=" + artista + ", album=" + album + ", genero="
				+ genero + ", idioma=" + idioma + ", fechaCreacion=" + fechaCreacion + ", fechaActualizacion="
				+ fechaActualizacion + "]";
	}
	
	
}
