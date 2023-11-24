package clase5;

public class Producto {

	//Atributos
	private String nombre;
	private String codigo;
	private float precio;
	
	//Constructor
	
	public Producto(String nom, String code, float price) {
		this.nombre = nom;
		this.codigo = code;
		this.precio = price;
	}
	
	//Getters y Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}
	//To String
	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", codigo=" + codigo + ", precio=" + precio + "]";
	}
	
	//Metodos
	public float costoFinal() {
		return this.precio;
	}
}
