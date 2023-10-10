package clase5;

public class DescuentoPorcentaje extends Descuento{

	public float valorFinal(float valorInicial) {
		return valorInicial - (valorInicial * (this.getValorDesc()/100));
	}
	
}
