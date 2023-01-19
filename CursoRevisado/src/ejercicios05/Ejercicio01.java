package ejercicios05;

/**
 * Indicar las variables e indicar mayor, iguales, o múltiplo
 * @author andrea.sanclemente
 *
 */

public class Ejercicio01 {

	public static void main(String[] args) {
		comparar(10, 20);
		comparar(3, 5);
		comparar(5, 5);
	}
	
	/**
	 * método comparar void 
	 * @param v1 primer valor	
	 * @param v2 segundo valor
	 */
	
	public static void comparar(int v1, int v2) {

		if ((v1 <= v2) && (v1!=v2)) {
			System.out.println(v2 + " es mayor que " + v1);
		}
		if (v1 > v2 && (v1!=v2)) {
			System.out.println(v1 + " es mayor que " + v2);
		}
		if (v1 == v2) {
			System.out.println("Son iguales");
		}
		if (v1%v2 == 0 || v2%v1 == 0) {
			System.out.println(v1 + " es multiplo de " + v2);
		}
		else {
			System.out.println("No son multiplos");
		}
	}

}
