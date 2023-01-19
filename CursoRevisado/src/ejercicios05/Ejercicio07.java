package ejercicios05;

/**
 * Calcular la suma de los primeros 10 numeros multiplos de 5
 * @author andrea.sanclemente
 *
 */

public class Ejercicio07 {

	public static void main(String[] args) {
		int contador = 10;
		
		for (int i = 1; i<100; i++) {
			if(i%5==0 && contador !=0) {
				--contador;
				System.out.println(i + " ");
			}
		}
	}

}
