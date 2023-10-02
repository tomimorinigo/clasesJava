package clase5;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Iterator;

public class Carrito {

	//Atributos
	Producto[] listaProductos;
	LocalDate fechaCompra;

	//Constructor
	public Carrito(Producto[] listaPro) {
		this.listaProductos = listaPro;
		this.fechaCompra = LocalDate.now();
	}
	
	//Getters y Setters
	public Producto[] getListaProductos() {
		return listaProductos;
	}

	public void setListaProductos(Producto[] listaProductos) {
		this.listaProductos = listaProductos;
	}
	
	public LocalDate getFechaCompra() {
		return fechaCompra;
	}
	
	//To String
	@Override
	public String toString() {
		return "Carrito [listaProductos=" + Arrays.toString(listaProductos) + ", fechaCompra=" + fechaCompra + "]";
	}
	
	//Metodos
	public float costoFinal() {
		float total = 0;
		
		for (int i = 0; i < listaProductos.length; i++) {
			total += listaProductos[i].costoFinal();
		}
		
		return total;
	}
}
