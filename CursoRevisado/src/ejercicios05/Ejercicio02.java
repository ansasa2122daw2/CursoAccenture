package ejercicios05;

/**
 * Switch case para la variable nota
 * @author andrea.sanclemente
 *
 */

public class Ejercicio02 {

	public static void main(String[] args) {
		int nota = 9;
		
		switch(nota) {
		case 4:
			System.out.println("Insuficiente");
			break;
		case 5:
			System.out.println("Suficiente");
			break;
		case 6:
			System.out.println("Bien");
			break;
		case 7: case 8:
			System.out.println("Notable");
			break;		
		case 9: case 10:
			System.out.println("Sobresaliente");
			break;
		default:
			break;
		}

	}

}
