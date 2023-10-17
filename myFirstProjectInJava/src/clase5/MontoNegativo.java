package clase5;

public class MontoNegativo extends Exception{

	private final float costoTotal;
	
	public MontoNegativo(float total) {
		this.costoTotal = total;
	}
	
}
