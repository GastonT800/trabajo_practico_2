package ar.edu.unju.fi.ejercicio7.main;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

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

		do {
			System.out.println("\n*********** MENU *************************************");
	        System.out.println("\n1 - Mostrar productos");
	        System.out.println("2 - Mostrar productos faltantes");
	        System.out.println("3 - Incrementar los precios de los productos en un 20%");
	        System.out.println("4 - Mostrar productos de Electrohogar disponibles");
	        System.out.println("5 - Ordenar los Productos por precio descendiente");
	        System.out.println("6 - Mostrar los productos con los nombres en mayúsculas");
	        System.out.println("7 - Salir");
	        System.out.println("========================================================");
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
                
	        	System.out.println("\n**** LISTA DE PRODUCTOS FALTANTES***");
	        	System.out.println("");
	        	mostrarProductosFaltantes();
	        	
                break;
	        case 3:
                
	        	System.out.println("\n**** LISTA DE PRODUCTOS CON UN INCREMENTO DEL 20% EN PRECIOS ***");
	        	System.out.println("");
	        	incrementarPrecios();
	        	
                break;
	        case 4:
	        	
	        	System.out.println("\n**** LISTA DE PRODUCTOS DE CATEGORIA ELECTROGRA DISPONIBLES ***");
	        	System.out.println("");
	        	mostrarCategoriaElectrohogar();
                
                break;
	        case 5:
                
	        	System.out.println("\n**** LISTA DE PRODUCTOS ORDENADOS POR PRECIO DE FORMA DESCENDIENTE ***");
	        	System.out.println("");
	        	mostrarProductosPrecioDescendiente();
	        	
                break;
	        case 6:
                
	        	System.out.println("\n**** LISTA DE PRODUCTOS CON NOMBRES EN MAYUSCULA ***");
	        	System.out.println("");
	        	mostrarProductosEnMayusculas();
	        	
                break;
	        case 7:
				
				System.out.println("\n**************** FIN DEL PROGRAMA ************************");
				System.out.println("=============================================================");
				
				break;
				
			default:
				
				System.out.println("\nOPCION INCORRECTA");
				
	        }
		
		}while(opcion != 7);

		
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
		
		Consumer<Producto> printConsumerProd = p -> System.out.println(p);
		//productos.forEach(printConsumerProd);
		productos.stream()
        .filter(Producto::getEstado)
        .forEach(printConsumerProd);
	}
	
	/**
	 * opcion2
	 */
	public static void mostrarProductosFaltantes() {
		
		Predicate<Producto> filterEstadoFalse = p -> !p.getEstado();
		productos.stream().filter(filterEstadoFalse).forEach(System.out::println);
	}
	
	/**
	 * opcion3
	 */
	public static void incrementarPrecios() {
		
		Function<Producto, Producto> funcionIncrementar = (p)->{
			double resultado = p.getPrecioUnitario() + (p.getPrecioUnitario() *0.2d);
			p.setPrecioUnitario(resultado);
			
			return p;
		};
		
		List<Producto> productosIncrementados = new ArrayList<>();
		productosIncrementados = productos.stream().map(funcionIncrementar).collect(Collectors.toList());
		productosIncrementados.forEach(System.out::println);
	}
	
	/**
	 * opcion4
	 */
	public static void mostrarCategoriaElectrohogar() {
		
		Predicate<Producto> filterElectroHogar = elect -> elect.getCategoria().name().equals("ELECTROHOGAR") && elect.getEstado();
		productos.stream().filter(filterElectroHogar).forEach(System.out::println);
	}
	
	/**
	 * opcion5
	 */
	public static void mostrarProductosPrecioDescendiente(){
		
		productos.sort(Comparator.comparing(Producto::getPrecioUnitario).reversed());
	    productos.forEach(System.out::println);
		
	}
	
	public static void mostrarProductosEnMayusculas() {
		
		Function<Producto, Producto> nombresMayusculas = (name)->{
			String productosMayusculas = name.getDescripcion().toUpperCase();
			name.setDescripcion(productosMayusculas);
			
			return name;
		};
		productos.stream().map(nombresMayusculas).forEach(System.out::println);
	}
}
