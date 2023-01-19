package ejercicios03;

/**
 * Array con los días que tienen 12 meses
 * Array de dos dimensiones
 * Numeros secuenciales
 * @author andrea.sanclemente
 */

public class Ejercicio2 {

	public static void main(String[] args) {
		int[] diaMes= {31,28,31,30,31,30,31,31,30,31,30,31};
		int[][] elMes = new int[5][7];
		int contador = 0;
		
		/**
		 * Formato con fors
		 */
		
		for (int i = 0; i<5; i++ ) {
			for(int y = 0; y < 7; y++) {
				elMes[i][y] = i + y;
				System.out.println(elMes[i][y]);
			}
		}

		for (int i = 0; i < elMes.length; i++) {
			for (int y = 0; y < elMes[i].length; y++) {
				if (contador < 31) {
					elMes[i][y] = ++contador;
					System.out.println(elMes[i][y]);
				}
				
			}
		}
	}

}
