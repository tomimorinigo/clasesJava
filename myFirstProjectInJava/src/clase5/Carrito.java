package clase5;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Carrito {

	//Attributes
	private List<Producto> listaProductos;
	private LocalDate fechaCompra;
	private Descuento descuento;

	//Constructor
	public Carrito(List<Producto> listaPro) {
		this.listaProductos = listaPro;
		this.fechaCompra = LocalDate.now();
	}
	
	//Getters y Setters
	public List<Producto> getListaProductos() {
		return listaProductos;
	}

	public void setListaProductos(List<Producto> listaProductos) {
		this.listaProductos = listaProductos;
	}
	
	public LocalDate getFechaCompra() {
		return fechaCompra;
	}
	
	public void setDescuento(Descuento desc) {
		this.descuento = desc;
	}
	
	//To String
	@Override
	public String toString() {
		return "Carrito [listaProductos=" + listaProductos + ", fechaCompra=" + fechaCompra + "]";
	}
	
	//Metodos
	public float costoFinal() throws CarritoEnCero, MontoNegativo{
		float total = 0;
	
		for (Producto producto : listaProductos) {
			total += producto.costoFinal();
		}
		
		System.out.println(listaProductos);
		
		if(total == 0) {
			throw new CarritoEnCero(total);
		}
		
		if(this.descuento != null) {
			total = descuento.valorFinal(total);
			if(total < 0) {
				throw new MontoNegativo(total);
			}
		}
		
		return total;
	}
}
