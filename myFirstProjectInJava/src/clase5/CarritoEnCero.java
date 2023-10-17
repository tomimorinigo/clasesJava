package clase5;

public class CarritoEnCero extends Exception {

	private final float costoTotal;
	
	public CarritoEnCero(float total) {
		this.costoTotal = total;
	}
}
