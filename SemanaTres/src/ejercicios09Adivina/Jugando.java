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
	static boolean ganador = false;
	
	static Random rand = new Random();
	static int randUSU = rand.nextInt(1000)+1;
	static int randMAQ = rand.nextInt(1000)+1;
	
	static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		while(!(finPartida)) {
			if(!(ganador)) {
				yoGuess();
			}
			if(!(ganador)) {
				maquinaGuess();
			}
		}
	}
	
	/**
	 * Métodos que serán llamados en el main
	 */	
	static void yoGuess() {
		int adivinar;
		
		System.out.print("Introduce un número: ");
		adivinar = teclado.nextInt();
		teclado.nextLine();
		
		if (randUSU > adivinar) {
			System.out.println("Número mayor que el introducido");
		} else if (randUSU < adivinar) {
			System.out.println("Número menor que el introducido");
		}
		if(adivinar == randUSU) {
			System.out.println("Acertaste!");
			ganador=true;
			finPartida = true;
		}
		
	}
	
	static void maquinaGuess() {
		String maquina;

		System.out.println("\nMáquina adivinar: " + randMAQ + "\n(M)ayor," + " me(N)or," + " (F)in");
		maquina = teclado.next();
		
		if(maquina.equals("M")) {
			topeInf = randMAQ +1;
			randMAQ = ((topeSup + topeInf) /2);
		}
		if(maquina.equals("N")) {
			topeSup = randMAQ -1;
			randMAQ = ((topeSup + topeInf) /2);
		}
		if(maquina.equals("F")) {
			System.out.println("Máquina acerto!");
			ganador=true;
			finPartida = true;
		}
	}
}