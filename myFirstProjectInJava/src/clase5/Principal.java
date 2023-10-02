package clase5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;

public class Principal {

	public static void main(String[] args) {
		
		String archivo = "C:\\Users\\tomim\\git\\clasesJava\\myFirstProjectInJava\\src\\clase5\\productos";
		Producto[] listaProductos = new Producto[10];
		LocalDate nacimiento = LocalDate.of(2003, 7, 9);
		Persona persona1 = new Persona("Tomas", "Morinigo", nacimiento);
		
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
					listaProductos[i-1] = productoNuevo;
					System.out.println(productoNuevo);
				}
			}
			
			System.out.println(persona1);
			System.out.println("La edad de "+ persona1.getNombre() + " es "+ persona1.edad() + " anios");
			Carrito carrito1 = new Carrito(listaProductos);
			System.out.println("El costo final del carrito es de: $" + carrito1.costoFinal());
		} catch (IOException e) {
			System.out.println("Algo salio mal!");
		}
		
	}
	
}
