package ejercicios05;

/**
 * Colección de números desde args y calcular el cuadrado
 * @author andrea.sanclemente
 *
 */

public class Ejercicio05 {

	public static void main(String[] args) {
		
		System.out.println(Integer.parseInt(args[0]));
		int num;
		int calculo;
		
		/**
		 * for para pasar por cada args y hacer un parse int
		 */
		
		for(String ele:args) {
			num = Integer.parseInt(ele); 
			calculo = num * num;
			System.out.println(num + " al cuadrado es igual a " + calculo);
		}

	}

}
