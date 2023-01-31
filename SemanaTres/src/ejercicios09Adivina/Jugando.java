package ejercicios09Adivina;

import java.util.Random;
import java.util.Scanner;

/**
 * La maquina te pregunta y tu le preguntas a la maquina
 * @author andrea.sanclemente
 *
 */

public class Jugando {
	
	static int topeSup = 1000;
	static int topeInf = 0;
	
	public static void main(String[] args) {
		//variables
		boolean finJuego = true;
		int randNum = 0;
		String maquina = "";
		boolean ganadorM = false;
		boolean ganadorY = false;

		Random rand = new Random();
		int randN1000 = rand.nextInt(1000)+1;
		int randN1000M = rand.nextInt(1000)+1;
		Scanner teclado = new Scanner(System.in);
		
		//maquina
		int adivinar = 0;
		
		do {
			System.out.print("Introduce un número: ");
			adivinar = teclado.nextInt();
			teclado.nextLine();
			if (randN1000M > adivinar) {
				System.out.println("mayor que el introducido");
			} else if (randN1000M < adivinar) {
					System.out.println("menor que el introducido");
			}
			if(adivinar == randN1000M) {
				System.out.println("Acertaste!");
			}
			
			// yo NO COMPLETO NUMERO ADIVINAR FALLA
			System.out.println("Numero maquina adivinar: " + randN1000 + "(M)ayor," + " me(N)or," + " (F)in");
			maquina = teclado.next();
			randN1000 = rand.nextInt(topeSup + topeInf + 1) / 2;
			if(maquina.equals("M")) {
				topeInf = randN1000 + 1;
			}
			if(maquina.equals("N")) {
				topeSup = randN1000 - 1;
			}
			if(maquina.equals("F")) {
			System.out.println("Maquina adivino");
			finJuego=false;
			ganadorM=true;
			}

		}while(!(ganadorM || ganadorY));
		
		/**
		 * Metodos de las clases EN PROCESO
		 */
//		Adivina2 tiradaMaqui = new Adivina2();
//		Adivina1 tiradaUsu = new Adivina1();
//		
//		do {
//			tiradaUsu.pensar();
//			tiradaMaqui.maquina();
//		}while(!(ganadorM || ganadorY) && finJuego );

	
	}
}


