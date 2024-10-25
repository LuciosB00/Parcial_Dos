package Segundo_Parcial_Progra_II;

import java.util.ArrayList;
import java.util.Scanner;

public class Carrera {

	//Atributos
	private int codigo;
	private String titulo;
	private double cuotaSemanal;
	private ArrayList <Materia> materias;
	
	//Constructores
	public Carrera (int codigo, String titulo, double cuotaSemanal, ArrayList <Materia> materias) {
		this.codigo = codigo;
		this.titulo = titulo;
		this.cuotaSemanal = cuotaSemanal;
		this.materias = materias;
	}

	//Getters y Setters
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public double getCuotaSemanal() {
		return cuotaSemanal;
	}
	public void setCuotaSemanal(double cuotaSemanal) {
		this.cuotaSemanal = cuotaSemanal;
	}

	public ArrayList<Materia> getMaterias() {
		return materias;
	}
	
	//Metodos
	public double cambiarValorCuota () {
		double salario=0.00; String salarioAux;
		boolean flag=true;
		Scanner teclado = new Scanner(System.in);
		
		do {
			System.out.println("Ingrese el nuevo salario:");
			salarioAux = teclado.nextLine();
			
			try {
				salario = Double.parseDouble(salarioAux);
			} catch (NumberFormatException error) {
				System.out.println(error.getMessage());
				flag=false;
			}
			
			if(flag == false) {
				System.out.println("ERROR: ingrese un numero decimal.");
			}
		}while(flag == false);
		
		return salario;
	}
	
	public ArrayList <Alumno> verAlumnoInscripto () {
		ArrayList <Alumno> alumno=null;
		return alumno;
	}
}

