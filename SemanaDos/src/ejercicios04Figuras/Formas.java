package ejercicios04Figuras;

/**
 * Clase Formas que es abstracta porque comparte métodos con las clases hijas
 * @author andrea.sanclemente
 *
 */

public abstract class Formas {
	private int altura;
	private int anchura;
	
	public Formas(int altura, int anchura) {
		super();
		this.altura = altura;
		this.anchura = anchura;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public int getAnchura() {
		return anchura;
	}

	public void setAnchura(int anchura) {
		this.anchura = anchura;
	}
	
	/**
	 * métodos abstractos sin body
	 */
	
	public abstract void dibujar();
	public abstract void calcularArea();
	
	
}
