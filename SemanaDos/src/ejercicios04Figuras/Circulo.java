package ejercicios04Figuras;

/**
 * Clase Circulo que es clase hija de Formas
 * @author andrea.sanclemente
 *
 */

public class Circulo extends Formas{
private int radio;
	
	public Circulo(int altura, int anchura, int radio) {
		super(altura, anchura);
		this.radio = radio;
	}
	
	public int getRadio() {
		return radio;
	}

	public void setRadio(int radio) {
		this.radio = radio;
	}
	
	/**
	 * métodos abstractos de la clase Formas
	 */
	
	@Override
	public void dibujar() {
		System.out.println("DIBUJO CIRCULO = Altura: " + getAltura() + " Anchura: " + getAnchura() + " Radio: " + getRadio());
	}

	@Override
	public void calcularArea() {
		int calculo = (int) (Math.PI * getRadio() * getRadio());
		System.out.println("El calculo de la área es: " + calculo);

	}

}
