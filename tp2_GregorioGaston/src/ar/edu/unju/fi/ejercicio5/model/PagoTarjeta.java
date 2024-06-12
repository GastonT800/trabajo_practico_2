package ar.edu.unju.fi.ejercicio5.model;

import java.time.LocalDate;

import ar.edu.unju.fi.ejercicio5.interfaces.Pago;

public class PagoTarjeta implements Pago {
	
	//Atributos
	private String numeroTarjeta;
	private LocalDate fechaPago;
	private double montoPagado;
	
	//Constructor por defecto
	public PagoTarjeta() {
		super();
	}
	
	
	//Constructor con 1 parametros
	public PagoTarjeta(String numeroTarjeta) {
		super();
		this.numeroTarjeta = numeroTarjeta;
	}



	//Constructor Parametrizado
	public PagoTarjeta(String numeroTarjeta, LocalDate fechaPago, double montoPagado) {
		super();
		this.numeroTarjeta = numeroTarjeta;
		this.fechaPago = fechaPago;
		this.montoPagado = montoPagado;
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



	public double getMontoPagado() {
		return montoPagado;
	}



	public void setMontoPago(double montoPagado) {
		this.montoPagado = montoPagado;
	}



	@Override
	public void realizarPago(double montoPagado) {
		
		double recargo, montoActualizado;
		
		recargo = montoPagado * 0.15;
		montoActualizado = montoPagado + recargo;
		
		this.montoPagado = montoActualizado;
	}

	@Override
	public void imprimirRecibo() {
		
		System.out.println("\n*** RECIBO PAGO TARJETA ***");
		System.out.println("Número de tarjeta: " + numeroTarjeta);
	    System.out.println("Fecha de pago: " + LocalDate.now()); 
	    System.out.println("Monto pagado: $" + montoPagado);

	}

}
