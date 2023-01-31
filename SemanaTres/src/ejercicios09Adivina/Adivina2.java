package ejercicios09Adivina;

import java.util.Random;
import java.util.Scanner;

/**
 * Clase que estaba haciendo EN PROCESO
 * @author andrea.sanclemente
 *
 */

public class Adivina2 {
	static int topeSup = 1000;
	static int topeInf = 0;
	
	//variables
	boolean finJuego = false;
	int randNum = 0;
	String maquina = "";
	boolean ganadorM = false;

		
	Random rand = new Random();
	int randN1000 = rand.nextInt(1000)+1;
	Scanner teclado = new Scanner(System.in);
	
	//NO FUNCIONA
	public void maquina() {
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
			finJuego=true;
			ganadorM=true;
		}
	}
}

