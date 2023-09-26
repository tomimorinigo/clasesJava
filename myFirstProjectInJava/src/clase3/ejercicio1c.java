package clase3;

public class ejercicio1c {

	public static void main(String[] args) {
		
		int numeros[] = new int[] {5, 8, 2, 4, 7, 3};
		int x = 5;
		int acumulador = 0;
		
		for (int i = 0; i < numeros.length; i++) {
			if(numeros[i] > x) {
				acumulador = acumulador + numeros[i];
			}
		}
		
		System.out.println("El total sumado es: " + acumulador);
		
	}
	
}
