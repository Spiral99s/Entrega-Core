package com;

import com.clases.ProductoElectrodomestico;
import com.clases.TiendaElectronica;
import com.clases.ComputadoraPortatil;
import com.clases.Televisor;

public class Aplicacion {

	public static void main(String[] args) {
		
		TiendaElectronica tiendaElectronica = new TiendaElectronica();
		
		//AGREGAR PRODUCTOS
		com.clases.Televisor televisor1 = new com.clases.Televisor("Samsung Smart TV 32\" Crystal UHD 4K DU8000 (2024)", 329990, 4, 32, "4K UHD");
		com.clases.Televisor televisor2 = new com.clases.Televisor("LG Smart TV 55\" QNED 4K 55QNED82ASG (2025)", 419990, 0, 55, "4K Ultra HD (3840 × 2160)");
		com.clases.Televisor televisor3 = new com.clases.Televisor("Sony Smart TV 43\" Bravia 2 II 4K HDR (K-55S20M2)", 679990, 5, 43, "4K UHD");
		
		com.clases.ComputadoraPortatil computadoraPortatil1 = new com.clases.ComputadoraPortatil("Asus Vivobook 15 X1502", 679990, 8, "Asus", 16, "90NB10T1-M012Y0");
		com.clases.ComputadoraPortatil computadoraPortatil2 = new com.clases.ComputadoraPortatil("HP 15-FD0048LA", 499990, 7, "HP", 8, "2000404977173"); 
		com.clases.ComputadoraPortatil computadoraPortatil3 = new com.clases.ComputadoraPortatil("Lenovo Ideapad Slim 3 Gen 8", 519990, 4, "Lenovo", 8, "82XQ0069CL");
		
		tiendaElectronica.agregarProducto(televisor1);
		tiendaElectronica.agregarProducto(televisor2);
		tiendaElectronica.agregarProducto(televisor3);
		
		tiendaElectronica.agregarProducto(computadoraPortatil1);
		tiendaElectronica.agregarProducto(computadoraPortatil2);
		tiendaElectronica.agregarProducto(computadoraPortatil3);
		//REALIZAR VENTAS y VERIFICAR CANTIDAD DISPONIBLE
		
		tiendaElectronica.venta(televisor2);
		
		tiendaElectronica.buscarProducto("LG Smart");
	
		tiendaElectronica.venta(computadoraPortatil3);
		
		tiendaElectronica.buscarProducto("Ideapad");
		
		tiendaElectronica.buscarProducto("Macbook Air");
		
		
		//MOTRAR INVENTARIO
		tiendaElectronica.mostrarInventario();
		
		
	}

}
