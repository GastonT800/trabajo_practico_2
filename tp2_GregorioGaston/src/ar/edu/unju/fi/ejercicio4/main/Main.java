package ar.edu.unju.fi.ejercicio4.main;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio4.constantes.Posicion;
import ar.edu.unju.fi.ejercicio4.model.Jugador;

public class Main {

	public static void main(String[] args) {
		
		Scanner escaner = new Scanner(System.in);

		ArrayList<Jugador> jugadores = new ArrayList<>();
		
		int opcion;
		try {
		do {
			System.out.println("\n****************************");
			System.out.println("********* MENU *************");
			System.out.println("1- Alta de jugador");
			System.out.println("2- Mostrar todos los jugadores");
			System.out.println("3- Modificar la posición de un jugador");
			System.out.println("4- Eliminar un jugador");
			System.out.println("5- Salir");
			System.out.print("\nSeleccione una opcion: ");
			opcion = escaner.nextInt();
			escaner.nextLine();
			
			 switch (opcion) {
             case 1:
            	 System.out.println("\n*** Alta de jugador ***");
            	 System.out.print("Ingrese nombre del jugador: ");
                 String nombre = escaner.nextLine();
                 System.out.print("Ingrese apellido del jugador: ");
                 String apellido = escaner.nextLine();
                 System.out.println("Acontinuacion ingresera su fecha de nacimiento en orden");
                 System.out.print("Ingrese su dia: ");
                 int dia = escaner.nextInt();
                 System.out.print("Ingrese el mes: ");
                 int mes = escaner.nextInt();
                 System.out.print("Ingrese el año: ");
                 int anio = escaner.nextInt();
                 LocalDate fechaNacimiento = LocalDate.of(anio,mes,dia);
                 escaner.nextLine();
                 System.out.println("La fecha de nacimiento ingresada fue: " + dia + "/" + mes + "/" + anio);
                 System.out.print("Ingrese la nacionalidad: ");
                 String nacionalidad = escaner.nextLine();
                 System.out.print("Ingrese la estatura: ");
                 double estatura = escaner.nextDouble();
                 System.out.print("Ingrese el peso: ");
                 double peso = escaner.nextDouble();
                 System.out.println("\n*** Posiciones ***");
                 int i=0;
                 for(Posicion posicion: Posicion.values()) {
                	 i+=1;
                	 System.out.println(i+" - " + posicion);
                 }
                 System.out.print("\nIngrese la posicion del jugador: ");
                 int pos = escaner.nextInt();
                 while(pos<1 || pos>4) {
                	 System.out.print("Ingrese la posicion del jugador: ");
                	 pos = escaner.nextInt();
                 }
                 escaner.nextLine();
                 Posicion posicion = Posicion.values()[pos - 1];
                 //System.out.println("La posicion del jugadpr es: " + posicion);
                 
                 Jugador nuevoJudador = new Jugador(nombre, apellido, fechaNacimiento, nacionalidad, estatura, peso, posicion);
                 jugadores.add(nuevoJudador);
                 System.out.println("\nEl alta del jugador fue cargado correctamente");
                 break;
             case 2:
            	 if(jugadores.isEmpty()) {
 					
 					System.out.println("\nPara mostrar los jugadores primero tiene que dar de alta un jugador");
 					
 				}else {
            	 System.out.println("\n*** Lista de jugadores ***");
                 for (Jugador jugador : jugadores) {
                     System.out.println(jugador);
                 }
 				}
                 break;
             case 3:
            	 
            	if(jugadores.isEmpty()) {
  					
  					System.out.println("\nPara modificar la posicíon de un jugador primero tiene que dar de alta un jugador");
  					
  				}else {
            	 
	            	 System.out.println("\n*** Modificar la posición de un jugador ***");
	            	 System.out.print("Ingrese el nombre del jugador: ");
	            	 nombre = escaner.nextLine();
	            	 System.out.print("Ingrese el apellido del jugador: ");
	            	 apellido = escaner.nextLine();
	            	 boolean buscar = false;
	            	 for (Jugador jugador : jugadores) {
	            	        if (jugador.getNombre().equalsIgnoreCase(nombre) && jugador.getApellido().equalsIgnoreCase(apellido)) {
	            	            System.out.println(jugador);
	
	            	            // Solicitar la nueva posición
	            	            System.out.println("\n*** Posiciones ***");
	            	            int j = 0;
	            	            for (Posicion posic:Posicion.values()) {
	            	                j++;
	            	                System.out.println(j + " - " + posic);
	            	            }
	            	            System.out.print("\nIngrese la nueva posición del jugador: ");
	            	            int nuevaPos = escaner.nextInt();
	            	            while (nuevaPos < 1 || nuevaPos > 4) {
	            	                System.out.print("Ingrese la nueva posición del jugador: ");
	            	                nuevaPos = escaner.nextInt();
	            	            }
	            	            escaner.nextLine();
	            	            Posicion nuevaPosicion = Posicion.values()[nuevaPos - 1];
	            	            jugador.setPosicion(nuevaPosicion);
	            	            System.out.println("\nLa posición del jugador fue modificada");
	            	            buscar = true;
	                            break;
	            	            
	            	        }
	            	 }
	            	 if (!buscar) {
	                     System.out.println("\nNo se encontró a ningun jugador con ese nombre y apellido");
	                 }
  				 }
            	
                 break;
             case 4:
            	 
            	 if(jugadores.isEmpty()) {
  					
  					System.out.println("\nPara eliminar un jugador primero tiene que dar de alta un jugador");
  					
  				}else {
	            	 System.out.println("\n*** Eliminar jugador ***");
	            	 System.out.print("Ingrese el nombre del jugador: ");
	            	 nombre = escaner.nextLine();
	            	 System.out.print("Ingrese el apellido del jugador: ");
	            	 apellido = escaner.nextLine();
	            	 
	            	 Iterator<Jugador> iterador = jugadores.iterator();
	            	 while (iterador.hasNext()) {
	            		    Jugador jugador = iterador.next();
	            		    if (jugador.getNombre().equalsIgnoreCase(nombre) && jugador.getApellido().equalsIgnoreCase(apellido)) {
	            		        iterador.remove();
	            		        System.out.println("\nJugador eliminado");
	            		    }
	            	 }
	            	 
	            	 if (!iterador.hasNext()) {
	            	        System.out.println("\nNo se encontró a ningun jugador con ese nombre y apellido");
	            	    }
	
  				 }
            	 
                 break;
             case 5:
                 System.out.println("\n****** FIN DEL PROGRAMA *******");
                 break;
             default:
                 System.out.println("\nOPCION INCORRECTA");
                 break;
         }
		
		}while (opcion != 5);
		
		escaner.close();
		
		}catch(Exception e) {
			
	        System.out.println("Se ha Producido un Error durante la Ejecutacion del Programa");
	        System.out.println("****** PROGRAMA FINALIZADO ****");
		}
		
	}

}
