package clase3;

import java.util.Arrays;

public class ejercicio1b {
	
	public static void main(String[] args) {
		
		int numeros[] = new int[] {4, 1, 3};
		char orden = 'a'; // a --> ascendente || d --> descendente
		
		int longitud = numeros.length - 1;
		
		if(orden == 'a') {
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
		
		System.out.println(Arrays.toString(numeros));
		
	}
}
