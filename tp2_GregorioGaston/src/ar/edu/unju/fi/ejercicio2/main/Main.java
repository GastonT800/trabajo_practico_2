package ar.edu.unju.fi.ejercicio2.main;

import java.util.ArrayList;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio2.constantes.Mes;
import ar.edu.unju.fi.ejercicio2.model.Efemeride;

public class Main {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		ArrayList<Efemeride> efemerides = new ArrayList<>();
		
		//Definimos variable
		int opcion;
		try {
		do {
			System.out.println("\n****************************");
			System.out.println("********* MENU *************");
			System.out.println("1- Crear efeméride");
			System.out.println("2- Mostrar efeméride");
			System.out.println("3- Eliminar efeméride");
			System.out.println("4- Modificar efeméride");
			System.out.println("5- Salir");
			System.out.print("Seleccione una opcion: ");
			opcion = entrada.nextInt();
			entrada.nextLine();
			
			switch (opcion){
			
			case 1:
				
				Efemeride nuevoEfemeride = new Efemeride();
				
				System.out.println("\nCrear un nuevo efeméride");
				System.out.print("Ingrese código: ");
				nuevoEfemeride.setCodigo(entrada.nextInt());
				int i=0;
				System.out.println("\n******* MESES DEL AÑO *********");
				for(Mes mes: Mes.values()) {
					i+=1;
					System.out.println("Mes del año - " + i +": " + mes);
					
				}
				System.out.print("\nIngrese el número de Mes: ");
		        int numMes = entrada.nextInt();
		        entrada.nextLine();
		        while (numMes < 1 || numMes > 12) {
		            System.out.println("OPCION INCORRECTA");
		            System.out.print("\nIngrese el número de Mes: ");
		            numMes = entrada.nextInt();
		        }
				
		        switch(numMes) {
		        
		        case 1:
		        	
		        	nuevoEfemeride.setMes(Mes.ENERO);
		        	
		        	break;
		        case 2:
		        	
		        	nuevoEfemeride.setMes(Mes.FEBRERO);
		        	
		        	break;
		        case 3:
		        	
		        	nuevoEfemeride.setMes(Mes.MARZO);
		        	
		        	break;
		        case 4:
		        	
		        	nuevoEfemeride.setMes(Mes.ABRIL);
		        	
		        	break;
		        case 5:
		        	
		        	nuevoEfemeride.setMes(Mes.MAYO);
		        	
		        	break;
		        case 6:
		        	
		        	nuevoEfemeride.setMes(Mes.JUNIO);
		        	
		        	break;
		        case 7:
		        	
		        	nuevoEfemeride.setMes(Mes.JULIO);
		        	
		        	break;
		        case 8:
		        	
		        	nuevoEfemeride.setMes(Mes.AGOSTO);
		        	
		        	break;
		        case 9:
		        	
		        	nuevoEfemeride.setMes(Mes.SEPTIEMBRE);
		        	
		        	break;
		        case 10:
		        	
		        	nuevoEfemeride.setMes(Mes.OCTUBRE);
		        	
		        	break;
		        case 11:
		        	
		        	nuevoEfemeride.setMes(Mes.NOVIEMBRE);
		        	
		        	break;
		        case 12:
		        	
		        	nuevoEfemeride.setMes(Mes.DICIEMBRE);
		        	
		        	break;
		        }
		        
		        System.out.print("\nIngrese dia del mes " + nuevoEfemeride.getMes() + ": ");
		        int dia = entrada.nextInt();
		        while(dia<1 || dia>31) {
		        	System.out.print("\nIngrese dia del mes " + nuevoEfemeride.getMes() + ": ");
		        	dia = entrada.nextInt();
		        }
		        entrada.nextLine();
		        nuevoEfemeride.setDia(dia);
		        
		        System.out.print("\nIngrese detalles: ");
		        nuevoEfemeride.setDetalle(entrada.nextLine());
		        
		        efemerides.add(nuevoEfemeride);
		        System.out.println("\nEfeméride fue creado");
		        
				break;
				
			case 2:
				
				if (efemerides.isEmpty()) {
					
		            System.out.println("Primero tiene que crear un efeméride para ser Mostrado");
		            
		        } else {
		        	
		            System.out.println("\n***** Lista de Efeméride ****");
		            
		            for (Efemeride efemeride : efemerides) {
                        System.out.println(efemeride);
                    }
		        }
				
				
				break;
				
			case 3:
				
				if (efemerides.isEmpty()) {
					
		            System.out.println("Primero tiene que crear un efeméride para ser Eliminado");
		            
		        } else {
		        	
		            System.out.println("\n***** Lista de Efeméride ****");
		            int k=0;
		            for (Efemeride efemeride : efemerides) {
		            	k+=1;
		            	System.out.println("Efeméride " + k);
                        System.out.println(efemeride);
                    }
		            
		            System.out.print("\nIndique el número de efeméride que desea Eliminar: ");
                    int indiceEliminar = entrada.nextInt();
                    entrada.nextLine();
                   // boolean band=true;
                   // while(band) {
                    if (indiceEliminar > 0 && indiceEliminar <= efemerides.size()) {
                    	
                        efemerides.remove(indiceEliminar - 1);
                        System.out.println("\nEfeméride Eliminado");
                     //   band=false;
                        
                    } else {
                    	
                        System.out.println("Número de efeméride INCORRECTO");
                    }
                   // }
		        }
				
				break;
				
			case 4:
				
				if (efemerides.isEmpty()) {
					
		            System.out.println("Primero tiene que crear un efeméride para ser modificado");
		            
		        } else {
		        	
		            System.out.println("\n***** Lista de Efeméride ****");
		            int j=0;
		            for (Efemeride efemeride : efemerides) {
		            	j+=1;
		            	System.out.println("Efeméride " + j);
                        System.out.println(efemeride);
                    }
		            System.out.print("Indique el número de efeméride que desea modificar: ");
		            int indiceModificar = entrada.nextInt();
		            entrada.nextLine();
		            
		            if (indiceModificar > 0 && indiceModificar <= efemerides.size()) {
                        Efemeride efemeride = efemerides.get(indiceModificar - 1);
                        
                        System.out.println("****** Modicar Efeméride ************");
                        System.out.println("¿Qué desea modificar de este efeméride?");
                        System.out.println("1 - Código");
                        System.out.println("2 - Mes");
                        System.out.println("3 - Día");
                        System.out.println("4 - Detalle");
                        System.out.println("5 - Cancelar Modificacion");
                        System.out.print("Seleccione una opción: ");
                        int modificar = entrada.nextInt();
                        entrada.nextLine();
                        switch (modificar) {
                        	case 1:
                        		
                        		System.out.print("Ingrese el nuevo codigo para efeméride: ");
                        		efemeride.setCodigo(entrada.nextInt());
                        		System.out.println("\nEl Código fue Modificado");
                        		
                        		break;
                        		
                        	case 2:
                        		i=0;
                        		for(Mes mes: Mes.values()) {
                					i+=1;
                					System.out.println("Mes del año - " + i +": " + mes);
                					
                				}
                				System.out.print("\nIngrese el número de Mes: ");
                		        numMes = entrada.nextInt();
                		        entrada.nextLine();
                		        while (numMes < 1 || numMes > 12) {
                		            System.out.println("OPCION INCORRECTA");
                		            System.out.print("\nIngrese el número de Mes: ");
                		            numMes = entrada.nextInt();
                		        }
                				
                		        switch(numMes) {
                		        
                		        case 1:
                		        	
                		        	efemeride.setMes(Mes.ENERO);
                		        	
                		        	break;
                		        case 2:
                		        	
                		        	efemeride.setMes(Mes.FEBRERO);
                		        	
                		        	break;
                		        case 3:
                		        	
                		        	efemeride.setMes(Mes.MARZO);
                		        	
                		        	break;
                		        case 4:
                		        	
                		        	efemeride.setMes(Mes.ABRIL);
                		        	
                		        	break;
                		        case 5:
                		        	
                		        	efemeride.setMes(Mes.MAYO);
                		        	
                		        	break;
                		        case 6:
                		        	
                		        	efemeride.setMes(Mes.JUNIO);
                		        	
                		        	break;
                		        case 7:
                		        	
                		        	efemeride.setMes(Mes.JULIO);
                		        	
                		        	break;
                		        case 8:
                		        	
                		        	efemeride.setMes(Mes.AGOSTO);
                		        	
                		        	break;
                		        case 9:
                		        	
                		        	efemeride.setMes(Mes.SEPTIEMBRE);
                		        	
                		        	break;
                		        case 10:
                		        	
                		        	efemeride.setMes(Mes.OCTUBRE);
                		        	
                		        	break;
                		        case 11:
                		        	
                		        	efemeride.setMes(Mes.NOVIEMBRE);
                		        	
                		        	break;
                		        case 12:
                		        	
                		        	efemeride.setMes(Mes.DICIEMBRE);
                		        	
                		        	break;
                		        }
                		        
                        		System.out.println("\nEl Mes fue Modificado");
                		        
                        		break;
                        		
                        	case 3:
                        		
                        		System.out.print("\nIngrese el Dia del Mes " + efemeride.getMes() + ": ");
                		        dia = entrada.nextInt();
                		        while(dia<1 || dia>31) {
                		        	System.out.print("\nIngrese Dia del Mes " + efemeride.getMes());
                		        	dia = entrada.nextInt();
                		        }
                		        entrada.nextLine();
                		        efemeride.setDia(dia);
                		        
                		        System.out.println("\nEl Dia fue Modificado");
                		        
                        		break;
                        		
                        	case 4:
                        		
                        		System.out.print("\nIngrese nuevo  Detalles: ");
                		        efemeride.setDetalle(entrada.nextLine());
                		        
                		        System.out.println("\nEl detalle fue Modificado");
                		        
                        		break;
                        	case 5:
                        		
                        		System.out.println("La Modificacion de Efeméride fue CANCELADA");
                        		
                        		break;
                        }
                    
		            }
		        }
				
				break;
				
			case 5:
				
				System.out.println("****** FIN DEL PROGRAMA *******");
				
				break;
				
			default:
				
				System.out.println("OPCION INVALIDA");
				//System.out.println("");
				
			}
			
		}while(opcion != 5);
		
		entrada.close();
		
		}catch(Exception e) {
			
	        System.out.println("Se ha Producido un Error dutrante la Ejecutacion del Programa");
	        System.out.println("****** PROGRAMA FINALIZADO ****");
		}
	}

}
