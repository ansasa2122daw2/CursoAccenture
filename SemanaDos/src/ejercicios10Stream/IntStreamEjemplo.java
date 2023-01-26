package ejercicios10Stream;

import java.util.stream.IntStream;

public class IntStreamEjemplo {

	public static void main(String[] args) {
		
		IntStream numeros = IntStream.range(1,20);
		numeros.forEach(System.out::println);
	}

}
