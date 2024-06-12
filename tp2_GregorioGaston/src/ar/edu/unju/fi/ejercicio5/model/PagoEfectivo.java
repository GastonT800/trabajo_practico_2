package ar.edu.unju.fi.ejercicio5.model;

import java.time.LocalDate;

import ar.edu.unju.fi.ejercicio5.interfaces.Pago;

public class PagoEfectivo implements Pago {

	//Atributos
	private double montoPagado;
	private LocalDate fechaPago;
	
	
	//Constructor por defecto
	public PagoEfectivo() {
		super();
	}

	//Constructor Parametrizado
	public PagoEfectivo(double montoPagado, LocalDate fechaPago) {
		super();
		this.montoPagado = montoPagado;
		this.fechaPago = fechaPago;
	}

	//Getters and Setters
	public double getMontoPagado() {
		return montoPagado;
	}




	public void setMontoPagado(double montoPagado) {
		this.montoPagado = montoPagado;
	}




	public LocalDate getFechaPago() {
		return fechaPago;
	}




	public void setFechaPago(LocalDate fechaPago) {
		this.fechaPago = fechaPago;
	}




	@Override
	public void realizarPago(double montoPagado) {

		double montoActualizado, descuento;
		
		descuento = montoPagado * 0.10;
		montoActualizado = montoPagado - descuento;
		
		setMontoPagado(montoActualizado);

	}

	@Override
	public void imprimirRecibo() {
		
		System.out.println("*** RECIBO PAGO EFECTIVO ***");
		System.out.println("Fecha de pago: " + LocalDate.now()); 
	    System.out.println("Monto pagado: " + montoPagado);


	}

}
