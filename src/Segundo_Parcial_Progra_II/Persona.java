package Segundo_Parcial_Progra_II;

public abstract class Persona {

	//Atributos
	private int dni;
	private String nombre;
	private String apellido;
	
	//Constructores
	public Persona (int dni, String nombre, String apellido) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
	}
	
	//Getters y Setters
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
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

	//Metodos
	public abstract void verDatos();
}
