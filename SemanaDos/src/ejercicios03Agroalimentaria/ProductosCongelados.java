package ejercicios03Agroalimentaria;

/**
 * Clase Productos Congelados que tiene como padre Productos
 * @author andrea.sanclemente
 *
 */

public class ProductosCongelados extends Productos {
private int tempRecomendada;
	
	public ProductosCongelados(String fechaCaducidad, int numLote, int tempRecomendada) {
		super(fechaCaducidad, numLote);
		this.tempRecomendada = tempRecomendada;
	}

	public int getTempRecomendada() {
		return tempRecomendada;
	}

	public void setTempRecomendada(int tempRecomendada) {
		this.tempRecomendada = tempRecomendada;
	}
	
	/**
	 * método abstracto de Productos
	 */

	@Override
	public void info() {
		System.out.println("Productos congelados -->");
		System.out.println("Fecha caducidad: " + getFechaCaducidad() + " Número lote: " + getNumLote() + " Temperatura congelación recomendada: " + getTempRecomendada());
	}
}
