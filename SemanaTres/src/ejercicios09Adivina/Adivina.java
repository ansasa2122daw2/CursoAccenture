package ejercicios09Adivina;

import java.util.Random;
import java.util.Scanner;

/**
 * Realizar un juego para adivinar un número. Para ello obtenerlo aleatoriamente un numero, 
 * y luego ir pidiendo numeros indicando mayor o menor segun sea mayor o menor con resposto a N.
 * Aciertas y termina
 * @author andrea.sanclemente
 *
 */

public class Adivina {

	public static void main(String[] args) {
		int adivinar = 0;
		Random n = new Random();
		
		int myN = n.nextInt(100)+1;
	
		Scanner teclado = new Scanner(System.in);
		
		while(adivinar != myN) {
			System.out.print("Introduce un número: ");
			adivinar = teclado.nextInt();
			teclado.nextLine();
			if (myN > adivinar) {
		        System.out.println("mayor que el introducido");
		    } else if (myN < adivinar) {
		        System.out.println("menor que el introducido");
		    }
			if(adivinar == myN) {
				System.out.println("Acertaste!");
			}
		}

	}

}
