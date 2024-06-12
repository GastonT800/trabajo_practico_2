package ar.edu.unju.fi.ejercicio6.main;

import ar.edu.unju.fi.ejercicio6.interfaces.funcionales.Converter;
import ar.edu.unju.fi.ejercicio6.model.FelinoDomestico;
import ar.edu.unju.fi.ejercicio6.model.FelinoSalvaje;

public class Main {

	public static void main(String[] args) {

		// Conversión de un Felino Doméstico a un Felino Salvaje
        System.out.println("De Felino Doméstico a  Felino Salvaje");
        FelinoDomestico gato = new FelinoDomestico("Garfield", (byte) 45, 12f);
        Converter<FelinoDomestico, FelinoSalvaje> converter = x -> new FelinoSalvaje(x.getNombre(), x.getEdad(), x.getPeso());
        FelinoSalvaje felino1 = converter.convert(gato);
        converter.mostrarObjeto(felino1);
        System.out.println("");
        // Conversión 2 ahora de Felino Salvaje a un Felino Doméstico
        FelinoSalvaje gato2 = new FelinoSalvaje("Tanner", (byte) 20, 186f);
        boolean isNotNull = Converter.isNotNull(gato2);
        
        if (isNotNull) {
        	
            Converter<FelinoSalvaje, FelinoDomestico> converter2 = y -> new FelinoDomestico(y.getNombre(), y.getEdad(), y.getPeso());
            FelinoDomestico felino2 = converter2.convert(gato2);
            System.out.println("De Felino Salvaje a Felino Doméstico");
            converter2.mostrarObjeto(felino2);
            
        } else {
            System.out.println("OBJETO NULO");
        }
	}

}
