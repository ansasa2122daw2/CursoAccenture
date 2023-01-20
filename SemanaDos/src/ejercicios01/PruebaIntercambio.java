package ejercicios01;

/**
 * Main de la clase Intercambio
 * @author andrea.sanclemente
 *
 */

public class PruebaIntercambio {
	public static void main(String[] args) {
		Intercambio<String> inter = new Intercambio<String>("Miguel", "Antonio");
		
		System.out.println("Texto 1 antes intercambio: " + inter.getValor1() + " " + inter.getValor2());
		
		inter.intercambio();
		
		System.out.println("Texto 2 despues intercambio: " + inter.getValor1() + " " + inter.getValor2());

	}

}
