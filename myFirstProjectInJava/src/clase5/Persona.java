package clase5;

import java.time.LocalDate;
import java.time.Period;

public class Persona {

	//Atributos
	private String nombre;
	private String apellido;
	private LocalDate fechaDeNacimiento;
	
	//Constructor
	
	public Persona(String nom, String ape, LocalDate fecha) {
		this.nombre = nom;
		this.apellido = ape;
		this.fechaDeNacimiento = fecha;
	}
	
	//Getters y Setters
	public String getNombre() {
		return this.nombre;
	}
	
	public void setNombre(String nom) {
		this.nombre = nom;
	}
	
	public String getApellido() {
		return this.apellido;
	}
	
	public void setApellido(String ape) {
		this.apellido = ape;
	}
	
	public LocalDate getFechaDeNacimiento() {
		return this.fechaDeNacimiento;
	}
	
	//To String
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", fechaDeNacimiento=" + fechaDeNacimiento
				+ "]";
	}
	
	//Metodos extras
	public int edad() {
		Period periodo = Period.between(this.fechaDeNacimiento, LocalDate.now());
	    int edad = periodo.getYears();
	    return edad;
	}
	
}
