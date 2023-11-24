package clase4;

import java.util.Scanner;

public class IngresoDatos {

	// Se trabaja con args
	/*public static void main(String[] args) {
		int resultado = 0;
		for (int i = 0; i < args.length; i++) {
			resultado = resultado + Integer.parseInt(args[i]);
		}
		System.out.println(resultado);
	}*/
	
	// Se trabaja con input desde consola
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese su nombre: ");
		String datoIngresado = scan.nextLine();
		saludar(datoIngresado);
	}
	
	public static void saludar(String nombre) {
		System.out.println("Hola " + nombre + "!");
	}
}
