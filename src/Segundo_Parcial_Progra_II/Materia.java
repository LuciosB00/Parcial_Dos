package Segundo_Parcial_Progra_II;

import java.util.Scanner;

public class Materia {

	//Atributos
	private int codigo;
	private String nombre;
	private String contenido;
	
	//Constructores
	public Materia (int codigo, String nombre, String contenido) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.contenido = contenido;
	}

	//Getters y Setters
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getContenido() {
		return contenido;
	}
	public void setContenido(String contenido) {
		this.contenido = contenido;
	}
	
	//Metodos
	public String cambiarContenido () {
		String contenido;
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Ingrese el nuevo contenido:");
		contenido = teclado.nextLine();
		
		return contenido;
	}
}
