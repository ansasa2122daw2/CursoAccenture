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
	static boolean finPartida = false;
	
	public static void main(String[] args) {
	
		boolean ganadorM = false;
		boolean ganadorY = false;

		
		
		while(!(finPartida)) {
			if(!(ganadorM)) {
				yoGuess();
			}
			if(!(ganadorY)) {
				maquinaGuess();
			}
		}

	}
	
	/**
	 * Métodos
	 */
	
	static void yoGuess() {
		Random rand = new Random();
		int randUSU = rand.nextInt(1000)+1;
		boolean ganadorY = false;

		Scanner teclado = new Scanner(System.in);
		
		int adivinar = 0;
		
		System.out.print("Introduce un número: ");
		adivinar = teclado.nextInt();
		teclado.nextLine();
		
		if (randUSU > adivinar) {
			System.out.println("mayor que el introducido");
		} else if (randUSU < adivinar) {
			System.out.println("menor que el introducido");
		}
		if(adivinar == randUSU) {
			System.out.println("Acertaste!");
			ganadorY=true;
			finPartida = false;
		}
		
	}
	
	static void maquinaGuess() {
		boolean ganadorM = false;
		Random rand = new Random();
		int randMAQ = rand.nextInt(1000)+1;
		Scanner teclado = new Scanner(System.in);
		String maquina = "";
		
		System.out.println("Numero maquina adivinar: " + randMAQ + "(M)ayor," + " me(N)or," + " (F)in");
		maquina = teclado.next();
		if(maquina.equals("M")) {
			topeInf = randMAQ;
		}
		if(maquina.equals("N")) {
			topeSup = randMAQ;
		}
		randMAQ = (int)((topeSup + topeInf) /2);
		
		if(maquina.equals("F")) {
			System.out.println("Maquina adivino");
			ganadorM=true;
			finPartida = true;
		}
	}

}


