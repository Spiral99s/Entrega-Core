package com.clases;

public class ProductoElectrodomestico {
	//ATRIBUTOS
	private String nombre;
	private int precio;
	private int cantidadDisponible;
	
	//METODO CONSTRUCTOR
	public ProductoElectrodomestico(String nombre, int precio, int cantidadDisponible){
		this.nombre = nombre;
		this.precio = precio;
		this.cantidadDisponible = cantidadDisponible;
	}
	
	public ProductoElectrodomestico(String nombre, int precio){
		this.nombre = nombre;
		this.precio = precio;
		this.cantidadDisponible = 0;
	}
	
	//METODOS: GETTERs y SETTERs

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public int getCantidadDisponible() {
		return cantidadDisponible;
	}

	public void setCantidadDisponible(int cantidadDisponible) {
		this.cantidadDisponible = cantidadDisponible;
	}
	
	//METODOS
	public String despliegaInformacion(){
		return "Nombre del producto: " + nombre + ", Precio: $" + precio + ", Cantidad disponible: " + cantidadDisponible;
	}
	
	@Override
	public String toString() {
	    return "Nombre del producto: " + nombre + ", Precio: $" + precio + ", Cantidad disponible: " + cantidadDisponible;
	}
	
}
