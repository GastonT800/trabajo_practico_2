package ar.edu.unju.fi.ejercicio1.main;

import java.util.ArrayList;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio1.model.Producto;
import ar.edu.unju.fi.ejercicio1.model.Producto.Categoria;
import ar.edu.unju.fi.ejercicio1.model.Producto.OrigenFabricacion;

public class Main {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		ArrayList<Producto> productos = new ArrayList<>();
		
		//Definimos variable
		int opcion;
		//try {
		do {
			System.out.println("****************************");
			System.out.println("********* MENU *************");
			System.out.println("1- Crear Producto");
			System.out.println("2- Mostrar Producto");
			System.out.println("3- Modificar Producto");
			System.out.println("4- Salir");
			try {
			System.out.print("Seleccione una opcion: ");
			opcion = entrada.nextInt();
			}catch(Exception e) {
	        	System.out.println("\nDebe de Ingresar un Número para que la OPCION sea Valida");
	        	entrada.nextLine();
				opcion = 0;
			}
			try {
			switch(opcion) {
			
			case 1:
				Producto producto = new Producto();
				System.out.println("");
				System.out.println("Crear un nuevo producto");
				System.out.print("Ingrese codigo: ");
				producto.setCodigo(entrada.nextInt());
				System.out.print("Ingrese descripcion: ");
				entrada.nextLine();
				producto.setDescripcion(entrada.nextLine());
				System.out.print("Ingrese precio unitario: ");
				producto.setPrecioUnitario(entrada.nextDouble());
				int origen;
				
				do {
					System.out.println("");
					System.out.println("---- Origen de fabricacion ----");
					System.out.println("1 - Argentina");
					System.out.println("2 - China");
					System.out.println("3 - Brasil");
					System.out.println("4 - Uruguay");
					System.out.print("Sleccione el origen de fabricante: ");
					origen = entrada.nextInt();
					switch(origen) {
					case 1:
						producto.setOrigen(OrigenFabricacion.ARGENTINA);
						break;
					case 2:
						producto.setOrigen(OrigenFabricacion.CHINA);
						break;
					case 3:
						producto.setOrigen(OrigenFabricacion.BRASIL);
						break;
					case 4:
						producto.setOrigen(OrigenFabricacion.URUGUAY);
						break;
					default:
						System.out.println("Debe elejir una de las opciones mostradas");
					}
				}while (origen <1 || origen >4);
				
				int categorias;
				do {
					System.out.println("");
					System.out.println("----- Categoría ----");
					System.out.println("1 - Telefonía");
					System.out.println("2 - Informática");
					System.out.println("3 - Electro hogar");
					System.out.println("4 - Herramientas");
					System.out.print("Seleccione la categoria del producto: ");
					categorias = entrada.nextInt();
					
					switch(categorias) {
					
					case 1:
						
						producto.setCategoria(Categoria.TELEFONIA);
						break;
						
					case 2:
						
						producto.setCategoria(Categoria.INFORMATICA);
						break;
						
					case 3:
						
						producto.setCategoria(Categoria.ELECTROHOGAR);
						break;
						
					case 4:
						
						producto.setCategoria(Categoria.HERRAMIENTAS);
						break;
						
					default:
						System.out.println("OPCION INVALIDA");
					}
				}while (categorias <1 || categorias >4);
				
				System.out.println("El producto fue creado");
				System.out.println("");
				
				productos.add(producto);
				
				break;
			
			case 2:
				
				if(productos.isEmpty()) {
					
					System.out.println("Primero tiene que crear un producto para ser mostrado");
					System.out.println("");
					
				}else {
					System.out.println("");
					System.out.println("***** Lista de Productos ****");
					int i=0;
					while (i < productos.size()) {
			        	
			            Producto product = productos.get(i);
			            System.out.println("Índice: " + i + "- " + product);
			            i++;
					}
				}
				
				break;
				
			case 3:
				
				if(productos.isEmpty()) {
					
					System.out.println("Primero tiene que crear un producto para ser Modificado");
					System.out.println("");
					
				}else {
					System.out.println("");
					System.out.println("***** Lista de Productos ****");
					int i=0;
					while (i < productos.size()) {
			        	
			            Producto produc = productos.get(i);
			            System.out.println("Índice: " + i + ", producto: " + produc.toString());
			            i++;
					}
					
					System.out.print("Indique el indice del producto que desea modificar: ");
					int modificar = entrada.nextInt();
					
					if (modificar >= 0 && modificar < productos.size()) {
			            Producto productoModificado = productos.get(modificar);

			            System.out.println("");
			            System.out.println("1 - Descripción");
			            System.out.println("2 - Precio unitario");
			            System.out.println("3 - Origen de fabricación");
			            System.out.println("4 - Categoría");
			            System.out.print("¿Qué atributo desea modificar del producto?: ");
			            int modificado = entrada.nextInt();

			            switch (modificado) {
			            
			                case 1:
			                	entrada.nextLine();
			                    System.out.print("Ingrese una nueva descripción para el producto: ");
			                    productoModificado.setDescripcion(entrada.nextLine());
			                    break;
			                case 2:
			                    System.out.print("Ingrese nuevo precio unitario: ");
			                    productoModificado.setPrecioUnitario(entrada.nextDouble());
			                    break;
			                case 3:
			                	
			                	do {
			    					System.out.println("");
			    					System.out.println("---- Origen de fabricacion ----");
			    					System.out.println("1 - Argentina");
			    					System.out.println("2 - China");
			    					System.out.println("3 - Brasil");
			    					System.out.println("4 - Uruguay");
			    					System.out.print("Seleccione el nuevo origen del fabricante: ");
			    					origen = entrada.nextInt();
			    					
			    					switch(origen) {
			    					case 1:
			    						productoModificado.setOrigen(OrigenFabricacion.ARGENTINA);
			    						break;
			    					case 2:
			    						productoModificado.setOrigen(OrigenFabricacion.CHINA);
			    						break;
			    					case 3:
			    						productoModificado.setOrigen(OrigenFabricacion.BRASIL);
			    						break;
			    					case 4:
			    						productoModificado.setOrigen(OrigenFabricacion.URUGUAY);
			    						break;
			    						
			    					default:
			    						
			    						System.out.println("OPCION INVALIDA");
			    						System.out.println("");
			    					}
			    				}while (origen <1 || origen >4);
			                	
			                    break;
			                    
			                case 4:
			                	
			                	do {
			    					System.out.println("");
			    					System.out.println("----- Categoría ----");
			    					System.out.println("1 - Telefonía");
			    					System.out.println("2 - Informática");
			    					System.out.println("3 - Electro hogar");
			    					System.out.println("4 - Herramientas");
			    					System.out.print("Seleccione la nueva categoria para el producto: ");
			    					categorias = entrada.nextInt();
			    					
			    					switch(categorias) {
			    					
			    					case 1:
			    						
			    						productoModificado.setCategoria(Categoria.TELEFONIA);
			    						break;
			    						
			    					case 2:
			    						
			    						productoModificado.setCategoria(Categoria.INFORMATICA);
			    						break;
			    						
			    					case 3:
			    						
			    						productoModificado.setCategoria(Categoria.ELECTROHOGAR);
			    						break;
			    						
			    					case 4:
			    						
			    						productoModificado.setCategoria(Categoria.HERRAMIENTAS);
			    						break;
			    						
			    					default:
			    						
			    						System.out.println("OPCION INVALIDA");
			    					}
			    					
			    				}while (categorias <1 || categorias >4);
			                	
			                    break;
			                    
			                default:
			                    System.out.println("OPCION INVALIDA");
			                    System.out.println("");
			            }

			            System.out.println("El producto fue modificado");
			            System.out.println("");
			            
			        } else {
			        	
			            System.out.println("Índice proporcionado no es valido");
			            System.out.println("");
			            
			        }
				}
				
				break;
				
			case 4:
				
				System.out.println("***** FIN DEL PROGRAMA ****");
				break;
				
			default:
				
				System.out.println("OPCION INCORRECTA");
				System.out.println("Debe elejir una de las opciones mostradas");
				System.out.println("");
				
			}
			}catch(Exception e) {
 				System.out.println("Error");
 				entrada.nextLine();
             }
			
		}while (opcion != 4);
		
		
		/*	
		} catch (java.util.InputMismatchException e) {
			System.out.println("ERROR, EL INGRESO DE DATO NO COINCIDE CON EL TIPO DE DATO ");
		
		}*/
		entrada.close();
	}

}
