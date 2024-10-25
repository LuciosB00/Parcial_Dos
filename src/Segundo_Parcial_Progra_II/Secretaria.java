package Segundo_Parcial_Progra_II;

public class Secretaria extends Persona{
	
	//Atributos
	private double salario;
	
	//Constructores
	public Secretaria(int dni, String nombre, String apellido, double salario) {
		super(dni, nombre, apellido);
		this.salario = salario;
	}

	//Getters y Setters
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}

	//Metodos
	public void verDatos() {
		
	}
	
	public void inscribirAlumno () {
		
	}
	
	public void cobrarCuota () {
		
	}
}
