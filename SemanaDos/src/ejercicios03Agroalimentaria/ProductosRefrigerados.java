package ejercicios03Agroalimentaria;

/**
 * Clase ProductosRefrigerados que extiende de Productos
 * @author andrea.sanclemente
 *
 */

public class ProductosRefrigerados extends Productos {
private int codAlimentario;
	
	public ProductosRefrigerados(String fechaCaducidad, int numLote, int codAlimentario) {
		super(fechaCaducidad, numLote);
		this.codAlimentario = codAlimentario;
	}

	public int getCodAlimentario() {
		return codAlimentario;
	}

	public void setCodAlimentario(int codAlimentario) {
		this.codAlimentario = codAlimentario;
	}

	/**
	 * método abstracto de Productos
	 */
	@Override
	public void info() {
		System.out.println("Productos refrigerados -->");
		System.out.println("Fecha caducidad: " + getFechaCaducidad() + " Número lote: " + getNumLote() + " Código organismo de supervisión alimentaria: " + getCodAlimentario());
	}

}
