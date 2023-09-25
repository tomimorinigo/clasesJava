package clases;

public class clase1 {
	
	public static void main(String[] args) {
		
		// -------->  Punto 1) a-
		/*
		
		int a = 2;
		int b = 15;
		
		int num = a;
		
		while (num >= a & num < b) {
			System.out.println(num);
			num++;
		}
		
		*/
		
		
		// -------->  Punto 1) b-
		/*
			
		int a = 2;
		int b = 15;
		
		int num = a;
		
		while (num >= a & num < b) {
			num++;

			if (num % 2 == 0) {
				System.out.println(num);
			}
			
		}

		 */
		
		
		// -------->  Punto 1) c-
		/*
		 
		 String parOImpar = "Impar";
		
		int a = 2;
		int b = 15;
		
		int num = a;
		
		while (num >= a & num < b) {
			num++;

			if (parOImpar == "Par") {
				if (num % 2 == 0) {
					System.out.println(num);
				}
			} else {
				if (num % 2 == 1) {
					System.out.println(num);
				}
			}

		 */
		
		
		// -------->  Punto 1) d-
		/*
		
		int a = 2;
		int b = 15;
		
		for (int num = b; num > a; num--) {
			if (num % 2 == 0) {
				System.out.println(num);
			}	
		}

		 */
		
		
		// -------->  Punto 2)
		
		
		float ingresos = 580000;
		int cantidadVehiculos = 2;
		int cantidadInmuebles = 1;
		boolean capacidadEco = false;
		
		if (ingresos >= 489083 | cantidadVehiculos >= 3 | cantidadInmuebles >= 3 
				| capacidadEco) {
			System.out.println("El sujeto pertenece al segmento de ingresos altos");
		} else {
			System.out.println("El sujeto NO pertence al segmento de ingresos altos");
		}
		
	}
	
}
