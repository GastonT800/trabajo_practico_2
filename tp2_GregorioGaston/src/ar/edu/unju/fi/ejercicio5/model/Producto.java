package ar.edu.unju.fi.ejercicio5.model;

public class Producto {
	//Atributos de la clase
	private int codigo;
	private String descripcion;
	private double precioUnitario;
	private OrigenFabricacion origen;
	private Categoria categoria;
	private boolean estado;
	
	
	//Enum
	public enum OrigenFabricacion{
		
		ARGENTINA, CHINA, BRASIL, URUGUAY
		
	}
	
	public enum Categoria{
		
		TELEFONIA, INFORMATICA, ELECTROHOGAR, HERRAMIENTAS
		
	}

	
	//Constructor por defecto
	public Producto() {
		
		super();
		
	}
	
	//Constructor parametrizado
	public Producto(int codigo, String descripcion, double precioUnitario, OrigenFabricacion origen,
			Categoria categoria, boolean estado) {
		super();
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.precioUnitario = precioUnitario;
		this.origen = origen;
		this.categoria = categoria;
		this.estado = estado;
	}
	
	//Getters and Setters
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getPrecioUnitario() {
		return precioUnitario;
	}

	public void setPrecioUnitario(double precioUnitario) {
		this.precioUnitario = precioUnitario;
	}

	public OrigenFabricacion getOrigen() {
		return origen;
	}

	public void setOrigen(OrigenFabricacion origen) {
		this.origen = origen;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	
	public boolean getEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Producto codigo= " + codigo + " - descripcion= " + descripcion + " - precio Unitario= " + precioUnitario
				+ " - origen= " + origen + " - categoria= " + categoria + " - estado= " + estado;
	}
	
	
	
}
