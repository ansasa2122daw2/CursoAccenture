package ejercicios05;

/**
 * Calculo del factorial del numero 8
 * @author andrea.sanclemente
 *
 */

public class Ejercicio08 {

	public static void main(String[] args) {
		factorial(8);
		System.out.println(factorialR(8));
	}
	
	/**
	 * Metodo factorial
	 * @param num
	 */
	
	public static void factorial(int num) {
		int factorial =1;
		for(int i = 1; i<=num; i++) {
			factorial= factorial*i;
		}
		System.out.println("Factorial de " + num + " es " + factorial);
	}
	
	/**
	 * Metodo factorial de manera recursiva (ejemplo profe)
	 * @param num
	 * @return
	 */
	
	static int factorialR(int num) {
		if(num>1) {
			return num*factorialR(--num);
		}
		else {
			return num;
		}
	}

}
