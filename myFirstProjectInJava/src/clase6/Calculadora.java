package clase6;

public class Calculadora {
	public static int sumar(int n, int m) {
		return n+m;
	}
	public static int restar(int n, int m) {
		return n-m;
	}
	public static int multiplicar(int n, int m) {
		return n*m;
	}
	public static int dividir(int n, int m) {
		if(m != 0) {
			return n/m;			
		} else {
			return 0;
		}
	}
}
