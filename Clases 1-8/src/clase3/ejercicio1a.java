package clase3;

public class ejercicio1a {

	public static void main(String[] args) {
		
		String str = "Hola como estas?";
		char letra = 'e';
		int contador = 0;
		
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == letra) {
				contador = contador + 1;
			} 
		}
		
		System.out.println("Cantidad de veces encontrada la letra '" + 
		letra + "': " + contador);
		
	}
}
