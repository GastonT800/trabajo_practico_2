package ar.edu.unju.fi.ejercicio3.main;

import ar.edu.unju.fi.ejercicio3.constantes.Provincia;

public class Main {

	public static void main(String[] args) {
		
		Provincia[] provincias = Provincia.values();
	
		for(Provincia provincia: provincias) {
			
			System.out.println("\nProvincia - " + provincia);
			System.out.println("Cantidad Poblacional: " +  provincia.getCantidadPoblacion() + " habitantes");
			System.out.println("Superficie: " +  provincia.getSuperficie() + " km2");
			System.out.println("Densidad Poblacional: " + provincia.calcularDensidadPoblacional() + " hab/km2");
			
		}

		
	}

}
