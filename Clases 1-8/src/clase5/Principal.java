package clase5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) throws CarritoEnCero, MontoNegativo {
		
		String archivo = "C:\\Users\\tomim\\git\\clasesJava\\myFirstProjectInJava\\src\\clase5\\productos";
		List<Producto> listaProductos = new ArrayList<Producto>();
		LocalDate nacimiento = LocalDate.of(2003, 7, 9);
		Persona persona1 = new Persona("Tomas", "Morinigo", nacimiento);
		DescuentoFijo desc1 = new DescuentoFijo();
		desc1.setValorDesc(4500000);
		
		
		try {
			int i = 0;
			for (String linea : Files.readAllLines(Paths.get(archivo))){
				String[] producto = linea.split(",");
				i++;
				if (producto.length == 3) {
					String nombre = producto[0];
					String codigo = producto[1];
					float precio = Float.parseFloat(producto[2]);

					Producto productoNuevo = new Producto(nombre, codigo, precio);
					
					listaProductos.add(productoNuevo);
					System.out.println(productoNuevo);
				}
			}
			
			System.out.println(persona1);
			System.out.println("La edad de "+ persona1.getNombre() + " es "+ persona1.edad() + " anios");
			Carrito carrito1 = new Carrito(listaProductos);
			
			try {
				carrito1.setDescuento(desc1);
				System.out.println("El costo final del carrito es de: $" + carrito1.costoFinal());
			
			} catch (CarritoEnCero e) {
				System.out.println("El carrito esta en cero, no se puede realizar descuento!");
				System.out.println("El costo final del carrito es de: $0");
			} catch (MontoNegativo e) {
				System.out.println("Con el descuento te queda un numero negativo!");
				System.out.println("El costo final del carrito es de: $0");
			}
			
		} catch (IOException e) {
			System.out.println("Algo salio mal!");
		}
		
	}
	
}
