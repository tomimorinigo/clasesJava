package clase3;

public class strings {

	public static void main(String[] args) {
		
		String nombre = "Tomas";
		String apellido = "Morinigo";
		
		System.out.println(apellido.charAt(3));
		
		int longitud = apellido.length();
		
		String nombreCompleto = nombre + " " + apellido;
		System.out.println(nombreCompleto);
	}
}
