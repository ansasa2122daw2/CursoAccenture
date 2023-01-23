package ejercicios04Figuras;

/**
 * Clase Rectangulo hija de la clase Formas
 * @author andrea.sanclemente
 *
 */

public class Rectangulo extends Formas{
	int i= 0;
	int j= 0;
	
	public Rectangulo(int altura, int anchura) {
		super(altura, anchura);
		
	}
	
	public Rectangulo() {
		
	}

	/**
	 * Clases abstractas de la clase Formas
	 */
	@Override
	public void dibujar() {
		System.out.println("DIBUJO RECTANGULO = Altura: " + getAltura() + " Anchura: " + getAnchura());
		while(i<getAltura()) {
			while(j<getAnchura()) {
				System.out.print("*");
				j++;
			}
			System.out.println();
			j=0;
			i++;
		}
	}

	@Override
	public void calcularArea() {
		int calculo = getAltura() * getAnchura();
		System.out.println("El calculo de la área del rectangulo es: " + calculo);

	}
	
	

}
