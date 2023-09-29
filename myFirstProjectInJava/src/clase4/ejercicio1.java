package clase4;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicio1 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Ingrese 'a' para ascendente o 'd' para descendente");
		String orden = scan.nextLine();
		
		if (args.length != 0) {
			int num1 = Integer.parseInt(args[0]);
			int num2 = Integer.parseInt(args[1]);
			int num3 = Integer.parseInt(args[2]);
			int numeros[] = new int[] {num1, num2, num3};
			int numeros1[] = ordenar(orden, numeros);
			System.out.println(Arrays.toString(numeros1));
		
		} else {
			System.out.println("No se detectaron numeros por parametros. Ingrese 3 numeros!");
			int num1 = scan.nextInt();
			int num2 = scan.nextInt();
			int num3 = scan.nextInt();
			int numeros[] = new int[] {num1, num2, num3};
			int numeros1[] = ordenar(orden, numeros);
			System.out.println(Arrays.toString(numeros1));
		}
	}
	
	public static int[] ordenar(String orden, int[] numeros) {
		
		int longitud = numeros.length - 1;
		
		if(orden.equals("a")) {
			for (int i = 0; i < longitud; i++) {
                for (int j = 0; j < longitud - i; j++) {
                    if (numeros[j] > numeros[j + 1]) {
                        int temporal = numeros[j];
                        numeros[j] = numeros[j + 1];
                        numeros[j + 1] = temporal;
                    }
                }
            }
		} else {
			for (int i = 0; i < longitud; i++) {
                for (int j = 0; j < longitud - i; j++) {
                    if (numeros[j] < numeros[j + 1]) {
                        int temporal = numeros[j];
                        numeros[j] = numeros[j + 1];
                        numeros[j + 1] = temporal;
                    }
                }
            }
		}
		
		return numeros;
	}
}
