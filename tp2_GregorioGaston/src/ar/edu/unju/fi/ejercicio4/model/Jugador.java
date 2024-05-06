package ar.edu.unju.fi.ejercicio4.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import ar.edu.unju.fi.ejercicio4.constantes.Posicion;

public class Jugador {
	
	//Atributos
	private String nombre;
	private String apellido;
	private LocalDate fechaNacimiento;
	private String nacionalidad;
	private double estatura;
	private double peso;
	private Posicion posicion;
	
	//Constructor por defecto
	public Jugador() {
		super();
	}
	
	//Constructor Parametrizado
	public Jugador(String nombre, String apellido, LocalDate fechaNacimiento, String nacionalidad, double estatura,
			double peso, Posicion posicion) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaNacimiento = fechaNacimiento;
		this.nacionalidad = nacionalidad;
		this.estatura = estatura;
		this.peso = peso;
		this.posicion = posicion;
	}

	//Getters and Setters
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

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public double getEstatura() {
		return estatura;
	}

	public void setEstatura(double estatura) {
		this.estatura = estatura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public Posicion getPosicion() {
		return posicion;
	}

	public void setPosicion(Posicion posicion) {
		this.posicion = posicion;
	}
	
	
	
	@Override
	public String toString() {
		return "Jugador nombre= " + nombre + " - apellido= " + apellido + " - fechaNacimiento= " + fechaNacimiento.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))
				+ "- edad = " + calcularEdad() + " años - nacionalidad= " + nacionalidad + " - estatura= " + estatura + "cm - peso= " + peso + "kg - posicion= "
				+ posicion;
	}

	//Metodo
	public int calcularEdad() {
		int edad=0;
		
		LocalDate fechaActual = LocalDate.now();
		if(fechaActual.isAfter(fechaNacimiento)) {
			edad = fechaActual.getYear()-fechaNacimiento.getYear();
		}
		return edad;
	}
	
}
