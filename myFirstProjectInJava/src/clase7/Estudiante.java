package clase7;

public class Estudiante {

	private String nombre;
	private String apellido;
	private String legajo;
	
	public Estudiante(String nom, String ape, String leg) {
		this.nombre = nom;
		this.apellido = ape;
		this.legajo = leg;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getLegajo() {
		return legajo;
	}

	public void setLegajo(String legajo) {
		this.legajo = legajo;
	}

	@Override
	public String toString() {
		return "Estudiante [nombre=" + nombre + ", apellido=" + apellido + ", legajo=" + legajo + "]";
	}
	
}
