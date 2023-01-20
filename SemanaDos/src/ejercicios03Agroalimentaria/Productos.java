package ejercicios03Agroalimentaria;

/**
 * Clase Productos que es padre y abstracta para compartir un método a sus clases hijas
 * @author andrea.sanclemente
 *
 */

public abstract class Productos {
	private String fechaCaducidad;
	private int numLote;
	
	/**
	 * Creación método abstracto sin body
	 */
	
	public abstract void info();
	
	public Productos(String fechaCaducidad, int numLote) {
		super();
		this.fechaCaducidad = fechaCaducidad;
		this.numLote = numLote;
	}

	public String getFechaCaducidad() {
		return fechaCaducidad;
	}

	public void setFechaCaducidad(String fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}

	public int getNumLote() {
		return numLote;
	}

	public void setNumLote(int numLote) {
		this.numLote = numLote;
	}
	
}
