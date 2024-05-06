package ar.edu.unju.fi.ejercicio5.model;

import java.time.LocalDate;

import ar.edu.unju.fi.ejercicio5.interfaces.Pago;

public class PagoEfectivo implements Pago {

	//Atributos
	private double monto;
	private LocalDate fechaPago;
	
	//Constructor Parametrizado
	public PagoEfectivo(double monto, LocalDate fechaPago) {
		super();
		this.monto = monto;
		this.fechaPago = fechaPago;
	}

	//Getters and Setters
	public double getMonto() {
		return monto;
	}




	public void setMonto(double monto) {
		this.monto = monto;
	}




	public LocalDate getFechaPago() {
		return fechaPago;
	}




	public void setFechaPago(LocalDate fechaPago) {
		this.fechaPago = fechaPago;
	}




	@Override
	public void realizarPago(double monto) {
		// TODO Auto-generated method stub

	}

	@Override
	public void imprimirRecibo() {
		// TODO Auto-generated method stub

	}

}
