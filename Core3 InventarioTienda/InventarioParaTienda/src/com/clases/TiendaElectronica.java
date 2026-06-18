package com.clases;
import java.util.ArrayList;

public class TiendaElectronica {
	//ATRIBUTOS
	private ArrayList<ProductoElectrodomestico> listaDeProductos;
	private int cantidadDisponible;
	
	//METODO CONSTRUCTOR
	public TiendaElectronica() {
		this.listaDeProductos = new ArrayList<>();
	}


	//METODO: GETTERs y SETTERs
	public ArrayList<ProductoElectrodomestico> getListaDeProductos() {
		return listaDeProductos;
	}

	public void setListaDeProductos(ArrayList<ProductoElectrodomestico> listaDeProductos) {
		this.listaDeProductos = listaDeProductos;
	}

	//METODOS

    public void agregarProducto(ProductoElectrodomestico nuevoProducto){
        if (nuevoProducto != null){
        	this.listaDeProductos.add(nuevoProducto);
        	this.cantidadDisponible++;
            System.out.println("Producto agregado con éxito a inventario.");
        }else{
            System.out.println("Ha ocurrido un problema.");
        }
    }
	
	
    public void venta(ProductoElectrodomestico producto){
    	if(this.listaDeProductos.contains(producto)) {
    		if(producto.getCantidadDisponible() > 0) {
    			producto.setCantidadDisponible(producto.getCantidadDisponible() - 1);
    			this.cantidadDisponible--;
    			System.out.println("Venta realizada con éxito de: " + producto.getNombre());
    		}else {
    			System.out.println("Error: El producto " + producto.getNombre() + " esta agotado.");
    		}
    	}
    }
    
    
    public void mostrarInventario(){
    	if (this.cantidadDisponible >= 0){
        for(int i = 0; i < listaDeProductos.size(); i++){
            System.out.println((i + 1) + ". " + listaDeProductos.get(i));}
        }else{
        	System.out.println("Producto sin stock");
        }
    }
    
    public void buscarProducto(String busqueda){
    	boolean encontrado = false;
    	for(int i = 0; i < listaDeProductos.size(); i++){
    		ProductoElectrodomestico producto = listaDeProductos.get(i);
    		
    		if(producto.getNombre() != null && producto.getNombre().toLowerCase().contains(busqueda.toLowerCase())) {
    			System.out.println("Producto " + producto.getNombre() + " encontrado en inventario. Cantidad disponible: " + producto.getCantidadDisponible());
    			encontrado = true;
    		}
    	}
    	if (!encontrado) {
    		System.out.println("Producto " + busqueda + " no registrado en tienda.");
    	}
    }
   }

