package clase4;

import java.nio.file.Paths;
import java.io.IOException;
import java.nio.file.Files;

public class Gestor {

	public static void main(String[] args) {
		
		String archivo = "C:\\Users\\tomim\\Desktop\\hola.txt";
		
		try {
			for (String linea : Files.readAllLines(Paths.get(archivo))){
				System.out.println(linea);
			}
		} catch (IOException e) {
			System.out.println("Salio mal!");
		}
		
		try {
			Files.writeString(Paths.get(archivo), "Hola que tal");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
