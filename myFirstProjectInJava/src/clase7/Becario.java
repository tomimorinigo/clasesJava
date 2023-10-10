package clase7;

public class Becario extends Estudiante {

	private String tipoDeBeca;
	private double honorario;
	
	public Becario(String nom, String ape, String leg, String tipoBeca, double hon) {
		super(nom, ape, leg);
		this.tipoDeBeca = tipoBeca;
		this.honorario = hon;
	}


	public String getTipoDeBeca() {
		return tipoDeBeca;
	}

	public void setTipoDeBeca(String tipoDeBeca) {
		this.tipoDeBeca = tipoDeBeca;
	}

	public double getHonorario() {
		return honorario;
	}

	public void setHonorario(double honorario) {
		this.honorario = honorario;
	}
	
	@Override
	public String toString() {
		return super.toString() + " --> Becario [tipoDeBeca=" + tipoDeBeca + ", honorario=" + honorario + "]";
	}
	
}
