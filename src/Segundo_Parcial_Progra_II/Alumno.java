package Segundo_Parcial_Progra_II;

import java.util.ArrayList;

public class Alumno extends Persona{

	//Atributos
	private int legajo;
	private ArrayList <Carrera> carrera;
	
	//Constructores
	public Alumno(int dni, String nombre, String apellido, int legajo, ArrayList <Carrera> carrera) {
		super(dni, nombre, apellido);
		this.legajo = legajo;
		this.carrera = carrera;
	}

	//Getters y Setters
	public int getLagajo() {
		return legajo;
	}
	public void setLagajo(int lagajo) {
		this.legajo = lagajo;
	}

	public ArrayList<Carrera> getCarrera() {
		return carrera;
	}

	//Metodos
	public void verDatos() {
		
	}

	public void verCronogramaCarrera () {
		System.out.println(getCarrera());
	}
}
