package com.example.demo.models;

import java.util.List;

public class Receta {
	private String nombreReceta;
	private List<String> ingredientes;
	
	public Receta(String nombreReceta, List<String> ingredientes) {
		super();
		this.nombreReceta = nombreReceta;
		this.ingredientes = ingredientes;
	}

	public String getNombreReceta() {
		return nombreReceta;
	}

	public void setNombreReceta(String nombreReceta) {
		this.nombreReceta = nombreReceta;
	}

	public List<String> getIngredientes() {
		return ingredientes;
	}

	public void setIngredientes(List<String> ingredientes) {
		this.ingredientes = ingredientes;
	}

	@Override
	public String toString() {
		return "Receta [nombreReceta=" + nombreReceta + ", ingredientes=" + ingredientes + "]";
	}
	
	
}
