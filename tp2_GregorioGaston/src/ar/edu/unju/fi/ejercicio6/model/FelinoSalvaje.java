package ar.edu.unju.fi.ejercicio6.model;

public class FelinoSalvaje {

	//definimos los atributos para la clase
		private String nombre;
		private byte edad;
		private float peso;
		
		//Constructor por defecto
		public FelinoSalvaje() {
			super();
		}

		//Constructor Parametrizado
		public FelinoSalvaje(String nombre, byte edad, float peso) {
			super();
			this.nombre = nombre;
			this.edad = edad;
			this.peso = peso;
		}

		//Getters and Setters
		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public byte getEdad() {
			return edad;
		}

		public void setEdad(byte edad) {
			this.edad = edad;
		}

		public float getPeso() {
			return peso;
		}

		public void setPeso(float peso) {
			this.peso = peso;
		}

		//toString
		@Override
		public String toString() {
			return "FelinoSalvaje: nombre=" + nombre + ", edad=" + edad + " años" + ", peso=" + peso + "kg";
		}
		
}
