package ejercicios03Agroalimentaria;

/**
 * Clase Agua que es hija de Congelados e Productos
 * @author andrea.sanclemente
 *
 */

public class PCAgua extends ProductosCongelados {
	private int salinidad;

	public PCAgua(String fechaCaducidad, int numLote, int tempRecomendada, int salinidad) {
		super(fechaCaducidad, numLote, tempRecomendada);
		this.salinidad = salinidad;
	}

	public int getSalinidad() {
		return salinidad;
	}

	public void setSalinidad(int salinidad) {
		this.salinidad = salinidad;
	}
	
	/**
	 * Método de la clase abstracta Productos
	 */
	
	@Override
	public void info() {
		System.out.println("Productos congelados | Congelados Agua -->");
		System.out.println("Fecha caducidad: " + getFechaCaducidad() + " Número lote: " + getNumLote() + " Salinidad: " + getSalinidad());
	}

}
