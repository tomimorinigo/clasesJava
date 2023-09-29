package clase4;

import java.nio.file.Paths;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Iterator;
import java.util.Scanner;

public class ejercicio3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese si quiere codificar (1) o decodificar (2):");
		int operacion = scan.nextInt();
		
		System.out.println("Ingrese el desplazamiento: ");
		int desplazamiento = scan.nextInt();
		
		System.out.println("Ingrese la ruta del archivo de entrada:");
		String entrada = scan.next();
		
		scan.nextLine();
		
		System.out.println("Ingrese la ruta del archivo de salida:");
		String salida = scan.nextLine();
		
		try {
			String resultadoTemporal = "";
			for (String linea : Files.readAllLines(Paths.get(entrada))) {
				resultadoTemporal = codeODeco(linea, desplazamiento, operacion);
				Files.writeString(Paths.get(salida), (resultadoTemporal + "\n"));
				
				System.out.println("Todo salio correctamente!");
			}

		} catch (IOException e) {
			System.out.println("Algo no ocurrio como se esperaba");
		}
		
	}
	
	public static String codeODeco(String str, int desp, int operacion) {
		String abecedario = "abcdefghijklmnñopqrstuvwxyz";
		String resultado = "";
		
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ') {
				continue;
			}
			
			int pos = abecedario.indexOf(str.charAt(i));
			if (operacion == 1) {
				pos = pos + desp; // Codificando
				if (pos > 26) {
					pos = pos - 26;
				}
			} else {
				pos = pos - desp; // Decodificando
				if (pos < 0) {
					pos = pos + 26;
				}
			}
			
			resultado = resultado + abecedario.charAt(pos);
		}
		
		return resultado;
	}

	
}
