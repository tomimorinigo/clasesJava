package clase3;

public class ejercicio2 {

	public static void main(String[] args) {
		
		String abecedario = "abcdefghijklmnñopqrstuvwxyz";
		String str = ("Hola que tal").toLowerCase();
		int desplazamiento = 2;
		String resultado = "";
		
		for (int i = 0; i < str.length(); i++) {
			int pos = abecedario.indexOf(str.charAt(i));
			pos = pos + desplazamiento;
			resultado = resultado + abecedario.charAt(pos);
		}
		
		System.out.println(resultado);
	}
	
}
