package ejercicios09Adivina;

import java.util.Random;
import java.util.Scanner;

public class Adivina1 {
	int adivinar = 0;
	Random n = new Random();
	boolean jugadorY = false;
	boolean finJuego = false;
	
	int myN = n.nextInt(100)+1;
	
	Scanner teclado = new Scanner(System.in);

	public void pensar() {
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
			jugadorY = true;
			finJuego = true;
		}
	}
}


