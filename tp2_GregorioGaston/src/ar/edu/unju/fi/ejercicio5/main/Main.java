package ar.edu.unju.fi.ejercicio5.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio5.interfaces.Pago;
import ar.edu.unju.fi.ejercicio5.model.PagoEfectivo;
import ar.edu.unju.fi.ejercicio5.model.PagoTarjeta;
import ar.edu.unju.fi.ejercicio5.model.Producto;
import ar.edu.unju.fi.ejercicio5.model.Producto.Categoria;
import ar.edu.unju.fi.ejercicio5.model.Producto.OrigenFabricacion;

public class Main {
	
	//Atributo de la clase
	private static List<Producto> productos;

	public static void main(String[] args) {
		
		//Definimos la clase Scanner
		Scanner escaner = new Scanner(System.in);
				
		productos = new ArrayList<>();
		precargarProductos();
				
		int opcion;
		//try {
			do {
				System.out.println("\n******** MENU ***********");
		        System.out.println("\n1 - Mostrar productos");
		        System.out.println("2 - Realizar compra");
		        System.out.println("3 - Salir");
		        System.out.println("===========================");
		        try {
		        	System.out.print("\nIngrese su opción: ");
			        opcion = escaner.nextInt();
			        escaner.nextLine();
		        }catch(Exception e) {
		        	System.out.println("\nDebe de Ingresar un Número para que la OPCION sea Valida");
		        	escaner.nextLine();
					opcion = 0;
		        }
		        switch(opcion) {
		        
		        case 1:
		        	
		        	System.out.println("\n**** LISTA DE PRODUCTOS ***");
		        	System.out.println("");
		            mostrarProductos();
		        	
		        	break;
		        	
		        case 2:
		        	
		        	mostrarProductosDisponibles();
		        	comprarProductos();
                    
                    break;
                    
		        case 3:
					
					System.out.println("***** FIN DEL PROGRAMA ****");
					break;
					
				default:
					
					System.out.println("\nOPCION INCORRECTA");
					
		        }
			
		}while(opcion != 3);
			
		//} catch (java.util.InputMismatchException e) {
			
		//	System.out.println("ERROR, EL INGRESO DE DATO NO COINCIDE CON EL TIPO DE DATO ");
		
		//}
		
		
		
		escaner.close();
	}

	
	//Metodos
	public static void precargarProductos() {
		        
		if(productos.isEmpty()) {
		        	
			productos.add(new Producto(101, "Placa de Video", 12002,OrigenFabricacion.ARGENTINA, Categoria.INFORMATICA, true));
			productos.add(new Producto(202, "Destornillador Eléctrico", 25000., OrigenFabricacion.URUGUAY, Categoria.HERRAMIENTAS, false));
			productos.add(new Producto(303, "Impresora Epson", 100500., OrigenFabricacion.ARGENTINA, Categoria.INFORMATICA, true));
			productos.add(new Producto(404, "Cafetera Philips", 500750., OrigenFabricacion.BRASIL, Categoria.ELECTROHOGAR, true));
			productos.add(new Producto(505, "Aspiradora Samsung", 55000., OrigenFabricacion.BRASIL, Categoria.ELECTROHOGAR, true));
			productos.add(new Producto(606, "Samsung Galaxy S21", 450000., OrigenFabricacion.ARGENTINA, Categoria.TELEFONIA, false));
			productos.add(new Producto(707, "Monitor LG 24''", 160000., OrigenFabricacion.CHINA, Categoria.INFORMATICA, true));
			productos.add(new Producto(808, "Teclado Razer", 13800., OrigenFabricacion.ARGENTINA, Categoria.INFORMATICA, true));
			productos.add(new Producto(909, "Mouse Logitech", 8750., OrigenFabricacion.URUGUAY, Categoria.INFORMATICA, false));
			productos.add(new Producto(110, "Auriculares Sony", 7500., OrigenFabricacion.CHINA, Categoria.TELEFONIA, true));
			productos.add(new Producto(111, "Tarjeta Gráfica Nvidia", 90000., OrigenFabricacion.ARGENTINA, Categoria.INFORMATICA, true));
			productos.add(new Producto(122, "Lavavajillas Whirlpool", 350000., OrigenFabricacion.BRASIL, Categoria.ELECTROHOGAR, true));
			productos.add(new Producto(133, "Macbook Pro", 950000., OrigenFabricacion.ARGENTINA, Categoria.TELEFONIA, false));
			productos.add(new Producto(144, "Taladro Bosch", 8900., OrigenFabricacion.BRASIL, Categoria.HERRAMIENTAS, true));
			productos.add(new Producto(155, "Silla Gamer", 7500., OrigenFabricacion.CHINA, Categoria.INFORMATICA, false));
			       
		 }
		        
	}
	
	/**
	 * opcion1
	 */
	public static void mostrarProductos() {
		
		for(Producto producto: productos) {
			System.out.println(producto);
		}
	}
	
	/**
	 * opcion2
	 */
	public static void mostrarProductosDisponibles() {
		
		List<Producto> productosDisponibles = new ArrayList<>();
		
		for(Producto product : productos) {
			
			if(product.getEstado()) {
				productosDisponibles.add(product);
			}
		}
		
		System.out.println("\nPRODUCTOS QUE SE ENCUENTRAN DISPONIBLES ");
		for(Producto producto: productosDisponibles) {
			System.out.println(producto);
		}
		
	}
	
	public static void comprarProductos() {
		
		Scanner sc = new Scanner(System.in);
		
		int codigo;
		
		List<Producto> productosComprados = new ArrayList<>();
		do {
			try {
			System.out.print("\nIngrese el codigo del producto que desea comprar (1 para salir): ");
			codigo = sc.nextInt();
			
			}catch(Exception e) {
	        	System.out.println("\nDebe de Ingresar un Número para que la OPCION sea Valida");
	        	sc.nextLine();
				codigo = 0;
	        }
			if(codigo != 1) {
				
			
				for(Producto product : productos) {
					
					if(product.getCodigo() == codigo) {
						productosComprados.add(product);
						System.out.println("\nEl producto fue agregado con exito");
					}
				}
			}
			
		}while(codigo !=1);
		
		if (productosComprados.isEmpty()) {
			System.out.println("|n No se realizaron compras");
		}else {
			
			System.out.println("\nLISTA DE PRODUCTOS COMPRADOS");
			for(Producto producto: productosComprados) {
				System.out.println(producto);
				
			}
			int op;
			System.out.println("\n*** OPCIONES DE PAGO ***");
			System.out.println("\n1-Pago con Efectivo");
			System.out.println("2-Pago con Tarjeta");
			System.out.println("");
			try {
				System.out.print("\nIngrese su opción de pago: ");
		        op = sc.nextInt();
		        sc.nextLine();
			}catch(Exception e) {
	        	System.out.println("\nDebe de Ingresar un Número para que la OPCION sea Valida");
	        	sc.nextLine();
				op = 0;
	        }
			switch(op) {
	        
	        case 1:
	        	
	        	System.out.println("\n**** Pago EFECTIVO ***");
	        	System.out.println("");
	            double montoTotalEfectivo=0;
	            for(Producto producto: productosComprados) {
					montoTotalEfectivo = montoTotalEfectivo + producto.getPrecioUnitario();
				}
	            
	        	PagoEfectivo pagarEfectivo = new PagoEfectivo();
	        	pagarEfectivo.realizarPago(montoTotalEfectivo);
	        	pagarEfectivo.imprimirRecibo();
	            
	        	break;
	        	
	        case 2:
	        	
	        	System.out.println("\n**** Pago TARJETA ***");
	        	System.out.println("");
	        	String ops="";
	        	int os;
	        	try {
	        		System.out.println("Ingrese Número de Tarjeta Bancaria");
	        		ops = sc.next();
			        sc.nextLine();
	        	}catch(Exception e) {
		        	System.out.println("\nDebe de Ingresar un Número para que la OPCION sea Valida");
		        	sc.nextLine();
					os = 0;
		        }
	        	double montoTotalTarjeta=0;
	            for(Producto producto: productosComprados) {
					montoTotalTarjeta = montoTotalTarjeta + producto.getPrecioUnitario();
				}
	            
	            PagoTarjeta pagarTarjeta = new PagoTarjeta();
	            pagarTarjeta.setNumeroTarjeta(ops);
	            pagarTarjeta.realizarPago(montoTotalTarjeta);
	            pagarTarjeta.imprimirRecibo();
	            
	        	break;
	        
	        default:
				
				System.out.println("\nOPCION INCORRECTA");
				
	        }
		}
		
		
		//sc.close();
		
	}
}
