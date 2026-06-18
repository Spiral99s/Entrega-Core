package com.clases;

public class ComputadoraPortatil extends ProductoElectrodomestico{
	//ATRIBUTOS
	private String marca;
	private int memoriaRAM;
	private String numeroSerie;
	
	//METODO CONSTRUCTOR
	public ComputadoraPortatil(String nombre, int precio, int cantidadDisponible, String marca, int memoriaRAM, String numeroSerie){
		super(nombre, precio, cantidadDisponible);
		this.marca = marca;
		this.memoriaRAM = memoriaRAM;
		this.numeroSerie = numeroSerie;
	}
	
	//METODO: GETTERs y SETTERs
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getMemoriaRAM() {
		return memoriaRAM;
	}

	public void setMemoriaRAM(int memoriaRAM) {
		this.memoriaRAM = memoriaRAM;
	}

	public String getNumeroSerie() {
		return numeroSerie;
	}

	public void setNumeroSerie(String numeroSerie) {
		this.numeroSerie = numeroSerie;
	}
	
	//METODO
	public String despliegaInformacion(){
		return "Nombre del producto: " + getNombre() + ", Precio: $" + getPrecio() + ", Cantidad disponible: " + getCantidadDisponible() + ", Marca: " + marca + ", Memoria RAM: " + memoriaRAM + " GB, Numero de Serie: " + numeroSerie;
	}
	
	@Override
	public String toString() {
	    return "Nombre del producto: " + getNombre() + ", Precio: $" + getPrecio() + ", Cantidad disponible: " + getCantidadDisponible() + ", Marca: " + marca + ", Memoria RAM: " + memoriaRAM + " GB, Numero de Serie: " + numeroSerie;
	}
}
