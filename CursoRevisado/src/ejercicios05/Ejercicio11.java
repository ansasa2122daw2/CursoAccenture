package ejercicios05;

/**
 * Calcular números primos hay entre 1 y 100
 * @author andrea.sanclemente
 *
 */

public class Ejercicio11 {
	public static void main(String[] args) {
		//volver a hacerlo (esta mal)
//		int contador = 1;
//		for (int i = 1 ; i <= 100; i++) {
//			System.out.println(i);
//				if (i%contador!=0) {
//					System.out.println(i + contador + " % " + i%contador);
//					System.out.println(i);
//					contador++;
//				}
//
//			}
		int num = 100;
		for (int i = 1 ; i <= num; i++) {
			primoB(i);
			}
		}
	
	/**
	 * método para los primos
	 * @param num
	 * @return primo
	 */
	
	public static boolean primoB(int num) {
		int j = 2; //porque si fuera 1 todo se podria dividir
		boolean primo = true;
		while (j < num && primo == true ) {
			if(num % j == 0) {
				primo = false;
			}
			else {
				j++;
			}
		}
		return primo;
	}
}
