package clase4;

import java.nio.file.Paths;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Scanner;

public class ejercicio2 {

	public static void main(String[] args) {
		
		String archivo = "C:\\Users\\tomim\\Desktop\\hola.txt";
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese la operacion a realizar (1: Suma | 2: Multiplicacion):");
		int operacion = scan.nextInt();
	
		try {
			int resultado = 0;
			if(operacion == 1) {
				for (String linea : Files.readAllLines(Paths.get(archivo))){
					resultado = resultado + Integer.parseInt(linea);
				}
				System.out.println("El resultado de la suma es: "+ resultado);
			} else {
				resultado = 1;
				for (String linea : Files.readAllLines(Paths.get(archivo))){
					resultado = resultado * Integer.parseInt(linea);
				}
				System.out.println("El resultado del producto es: "+ resultado);
			}
		} catch (IOException e) {
			System.out.println("No se encontro el archivo!");
		}
		
	}
	
	
}
