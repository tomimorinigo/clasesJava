package clase5;

public class DescuentoPorcentajeConTope extends Descuento{

	private float tope;
	
	public DescuentoPorcentajeConTope(float top) {
		this.tope = top;
	}
	
	public float valorFinal(float valorInicial) {
		float desc = valorInicial * (this.getValorDesc()/100);
		if(desc >= this.tope) {
			return valorInicial - this.tope;
		} else {
			return valorInicial - desc;
		}
		
	}

		
}
