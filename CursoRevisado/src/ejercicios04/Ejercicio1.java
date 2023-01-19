package ejercicios04;

/**
 * Predecir el resultado del código del ejercicio
 * @author andrea.sanclemente
 *
 */

public class Ejercicio1 {

	public static void main(String[] args) {
		int valor =0;
		valor = 23;
		valor+=10;
		System.out.println("Resultado a=" + --valor); //32
		System.out.println("Resultado b=" + ++valor); //33
		System.out.println("Resultado c=" + valor++); //33
		System.out.println("Resultado d=" + valor--); //34
		System.out.println("Resultado e=" + valor);   //33

	}

}
