package clase5;

public abstract class Descuento {

	private float valor;
	
	public float getValorDesc() {
		return valor;
	}
	
	public void setValorDesc(float valor) {
		this.valor = valor;
	}
	
	public void setValorDesc(int valor) {
		this.valor = valor;
	}
	
	public abstract float valorFinal(float valorInicial);
	
}
