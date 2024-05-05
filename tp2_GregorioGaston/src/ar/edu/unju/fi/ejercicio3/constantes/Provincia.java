package ar.edu.unju.fi.ejercicio3.constantes;

public enum Provincia {
	
	JUJUY(811611, 53244.2),
	SALTA(1441351, 155488),
	TUCUMAN(1731820, 22524),
	CATAMARCA(415438, 101486.1),
	LA_RIOJA(393531, 91493.7),
	SANTIAGO_DEL_ESTERO(1060906, 136351);

	//Atributos
	private int cantidadPoblacion;
	private double superficie;
	
	//Constructor
	private Provincia(int cantidadPoblacion, double superficie) {
		this.cantidadPoblacion = cantidadPoblacion;
		this.superficie = superficie;
	}

	//Getters and Setters
	public int getCantidadPoblacion() {
		return cantidadPoblacion;
	}

	public void setCantidadPoblacion(int cantidadPoblacion) {
		this.cantidadPoblacion = cantidadPoblacion;
	}

	public double getSuperficie() {
		return superficie;
	}

	public void setSuperficie(double superficie) {
		this.superficie = superficie;
	}
	
	//Metodo
	public double calcularDensidadPoblacional() {
		double densidadPoblacional;
		densidadPoblacional = this.cantidadPoblacion/this.superficie;
		return densidadPoblacional;
	}
	
}
