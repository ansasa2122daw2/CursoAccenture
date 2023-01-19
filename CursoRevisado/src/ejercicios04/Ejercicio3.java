package ejercicios04;

/**
 * Calcular área del circulo y longitud circunferencia
 * @author andrea.sanclemente
 *
 */

public class Ejercicio3 {

	public static void main(String[] args) {
		int radio;
		double areaCirculo;
		double longitud;
		
		radio=23;
		
		/**
		 * Utilización Math.PI y Math.pow
		 */
		
		areaCirculo = Math.PI * Math.pow(radio, 2);
		longitud = 2 * Math.PI * radio;
		
		System.out.println("\nRadio: "+ radio + "\nArea Circulo: " + areaCirculo + "\nLongitud: " + longitud);
	}

}
