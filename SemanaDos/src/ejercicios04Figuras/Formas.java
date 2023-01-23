package ejercicios04Figuras;

/**
 * Clase Formas que es abstracta porque comparte métodos con las clases hijas
 * @author andrea.sanclemente
 *
 */

public abstract class Formas extends Punto{
	private int altura;
	private int anchura;
	//Defines la clase punto aqui
	Punto punt;
	//Defines la clase texto aqui
	Texto text;
	
	public Formas(int altura, int anchura) {
		super();
		this.altura = altura;
		this.anchura = anchura;
	}
	
	public Formas() {
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
	 * Métodos de la clase punto
	 * @return
	 */
	
	public Punto getPunt() {
		return punt;
	}

	public void setPunt(Punto punt) {
		this.punt = punt;
	}
	
	/**
	 * Métodos de la clase Texto
	 * @return
	 */
	
	public Texto getText() {
		return text;
	}

	public void setText(Texto text) {
		this.text = text;
	}

	/**
	 * métodos abstractos sin body
	 */
	
	public abstract void dibujar();
	public abstract void calcularArea();
	
	
}
