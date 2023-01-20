package ejercicios04Figuras;

/**
 * Clase Triangulo que es hija de clase Formas
 * @author andrea.sanclemente
 *
 */

public class Triangulo extends Formas {
private int base;
	
	public Triangulo(int altura, int anchura, int base) {
		super(altura, anchura);
		this.base = base;
	}
	
	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}
	
	/**
	 * Clases abstractas de la clase Formas
	 */

	@Override
	public void dibujar() {
		System.out.println("DIBUJO TRIANGULO = Altura: " + getAltura() + " Anchura: " + getAnchura() + " Base: " + getBase());

	}

	@Override
	public void calcularArea() {
		int calculo = getBase() * getAltura()/2;
		System.out.println("El calculo de la área es: " + calculo);

	}

}
