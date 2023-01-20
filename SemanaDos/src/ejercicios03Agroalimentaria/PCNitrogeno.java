package ejercicios03Agroalimentaria;

/**
 * Clase Nitrogeno hija de la clase ProductosCongelados y Productos
 * @author andrea.sanclemente
 *
 */

public class PCNitrogeno extends ProductosCongelados {
	private String metodo;
	private int segundos;
	
	public PCNitrogeno(String fechaCaducidad, int numLote, int tempRecomendada, String metodo, int segundos) {
		super(fechaCaducidad, numLote, tempRecomendada);
		this.metodo = metodo;
		this.segundos = segundos;
	}

	public String getMetodo() {
		return metodo;
	}

	public void setMetodo(String metodo) {
		this.metodo = metodo;
	}

	public int getSegundos() {
		return segundos;
	}

	public void setSegundos(int segundos) {
		this.segundos = segundos;
	}
	
	/**
	 * Al ser hija de Congelados también es hija de Productos, entonces puedo usar este método
	 */
	
	@Override
	public void info() {
		System.out.println("Productos congelados | Congelados Nitrogeno -->");
		System.out.println("Fecha caducidad: " + getFechaCaducidad() + " Número lote: " + getNumLote() + " Metodo: " + getMetodo() + " Segundos: " + getSegundos() );
	}
	
}
