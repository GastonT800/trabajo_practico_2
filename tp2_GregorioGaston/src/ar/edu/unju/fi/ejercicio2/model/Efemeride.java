package ar.edu.unju.fi.ejercicio2.model;

import ar.edu.unju.fi.ejercicio2.constantes.Mes;

public class Efemeride {
	
	//Atributos
	private int codigo;
	private Mes mes;
	private String dia;
	private String detalle;
	
	
	//Constructor por defecto
	public Efemeride() {
		super();
	}

	//Constructor parametrizado
	public Efemeride(int codigo, Mes mes, String dia, String detalle) {
		super();
		this.codigo = codigo;
		this.mes = mes;
		this.dia = dia;
		this.detalle = detalle;
	}
	
	
	//Getters and Setters
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public Mes getMes() {
		return mes;
	}

	public void setMes(Mes mes) {
		this.mes = mes;
	}

	public String getDia() {
		return dia;
	}

	public void setDia(String dia) {
		this.dia = dia;
	}

	public String getDetalle() {
		return detalle;
	}

	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}

	@Override
	public String toString() {
		return "Efemeride codigo=" + codigo + " - mes=" + mes + " - dia=" + dia + " - detalle=" + detalle;
	}
	
	
}
