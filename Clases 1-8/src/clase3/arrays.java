package clase3;
import java.util.Arrays;
import java.util.Random;
public class arrays {
	
	public static void main(String[] args) {
		
		Random random = new Random();
		
		int numeros[]= new int [random.nextInt(1, 10)];
        
        for (int i = 0; i < numeros.length; i++) {
        	numeros[i] = random.nextInt(100);
		}
        
        for (int numero: numeros) {
        	System.out.println(numero);
        }
        
        System.out.println(Arrays.toString(numeros));
        
	}
	
}
