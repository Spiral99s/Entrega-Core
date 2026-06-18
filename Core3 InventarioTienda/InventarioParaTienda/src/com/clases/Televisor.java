package com.clases;

public class Televisor extends ProductoElectrodomestico{
	//ATRIBUTOS
	private int tamanoPantalla;
	private String resolucion;
	
	//METODO CONSTRUCTOR
	public Televisor(String nombre, int precio, int cantidadDisponible, int tamanoPantalla, String resolucion) {
		super(nombre, precio, cantidadDisponible);
		this.tamanoPantalla = tamanoPantalla;
		this.resolucion = resolucion;
	}
	
	//METODO: GETTERs y SETTERs
	public int getTamanoPantalla() {
		return tamanoPantalla;
	}

	public void setTamanoPantalla(int tamanoPantalla) {
		this.tamanoPantalla = tamanoPantalla;
	}

	public String getResolucion() {
		return resolucion;
	}

	public void setResolucion(String resolucion) {
		this.resolucion = resolucion;
	}
	
	//METODO
	public String despliegaInformacion(){
		return "Nombre del producto: " + getNombre() + ", Precio: $" + getPrecio() + ", Cantidad disponible: " + getCantidadDisponible() + ", Tamaño de pantalla: " + tamanoPantalla + " pulgadas, Resolucion: " + resolucion;
	}
	
	@Override
	public String toString() {
	    return "Nombre del producto: " + getNombre() + ", Precio: $" + getPrecio() + ", Cantidad disponible: " + getCantidadDisponible() + ", Tamaño de pantalla: " + tamanoPantalla + " pulgadas, Resolucion: " + resolucion;
	}
}
