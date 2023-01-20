package ejercicios03Agroalimentaria;

/**
 * Clase ProductosFrescos hija de la clase Productos
 * @author andrea.sanclemente
 *
 */

public class ProductosFrescos extends Productos{
	private String fechaEnvasado;
	private String paisOrigen;
	
	public ProductosFrescos(String fechaCaducidad, int numLote, String fechaEnvasado, String paisOrigen) {
		super(fechaCaducidad, numLote);
		this.setFechaEnvasado(fechaEnvasado);
		this.setPaisOrigen(paisOrigen);
	}

	public String getFechaEnvasado() {
		return fechaEnvasado;
	}

	public void setFechaEnvasado(String fechaEnvasado) {
		this.fechaEnvasado = fechaEnvasado;
	}

	public String getPaisOrigen() {
		return paisOrigen;
	}

	public void setPaisOrigen(String paisOrigen) {
		this.paisOrigen = paisOrigen;
	}
	
	/**
	 * método abstracto de Productos
	 */
	public void info() {
		System.out.println("Productos frescos -->");
		System.out.println("Fecha caducidad: " + getFechaCaducidad() + " Número lote: " + getNumLote() + " Fecha envasado: " + getFechaEnvasado() + " Pais Origen: " + getPaisOrigen());
	}

}
