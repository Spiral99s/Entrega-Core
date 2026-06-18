package com.example.demo.models;

public class Libro {
	private String nombreLibro;
	private String autor;
	
	
	public Libro(String nombreLibro, String autor) {
		super();
		this.nombreLibro = nombreLibro;
		this.autor = autor;
	}


	public String getNombreLibro() {
		return nombreLibro;
	}


	public void setNombreLibro(String nombreLibro) {
		this.nombreLibro = nombreLibro;
	}


	public String getAutor() {
		return autor;
	}


	public void setAutor(String autor) {
		this.autor = autor;
	}


	@Override
	public String toString() {
		return "Libro [nombreLibro=" + nombreLibro + ", autor=" + autor + "]";
	}
	
}
