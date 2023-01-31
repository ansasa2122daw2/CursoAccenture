package ejercicios04;

/**
 * Ejercicio Reloj con Thread.sleep
 * @author andrea.sanclemente
 *
 */

public class Reloj {

	public static void main(String[] args) throws InterruptedException {

		for(int i = 0; i < 24; i++) {
			for(int y = 0; y < 60; y++) {
				for(int z = 0; z < 60; z++) {
					Thread.sleep(1000);
					String formati = String.format("%02d", i);
					String formaty = String.format("%02d", y);
					String formatz = String.format("%02d", z);
					System.out.println(formati + ":" + formaty + ":" + formatz );
					
				}
			}
		}
		

	}

}
