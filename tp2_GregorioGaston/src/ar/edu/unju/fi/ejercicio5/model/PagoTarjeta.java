package ar.edu.unju.fi.ejercicio5.model;

import java.time.LocalDate;

import ar.edu.unju.fi.ejercicio5.interfaces.Pago;

public class PagoTarjeta implements Pago {
	
	//Atributos
	private String numeroTarjeta;
	private LocalDate fechaPago;
	private double montoPago;
	
	//Constructor Parametrizado
	public PagoTarjeta(String numeroTarjeta, LocalDate fechaPago, double montoPago) {
		super();
		this.numeroTarjeta = numeroTarjeta;
		this.fechaPago = fechaPago;
		this.montoPago = montoPago;
	}

	//Getters and Setters
	public String getNumeroTarjeta() {
		return numeroTarjeta;
	}



	public void setNumeroTarjeta(String numeroTarjeta) {
		this.numeroTarjeta = numeroTarjeta;
	}



	public LocalDate getFechaPago() {
		return fechaPago;
	}



	public void setFechaPago(LocalDate fechaPago) {
		this.fechaPago = fechaPago;
	}



	public double getMontoPago() {
		return montoPago;
	}



	public void setMontoPago(double montoPago) {
		this.montoPago = montoPago;
	}



	@Override
	public void realizarPago(double monto) {
		

	}

	@Override
	public void imprimirRecibo() {
		

	}

}
