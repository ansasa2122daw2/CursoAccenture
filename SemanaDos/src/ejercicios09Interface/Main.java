package ejercicios09Interface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

public class Main {
	
	public static void main(String[] args) {
		Interface1 objeto = (a,b) -> a + b; //implementacion metodo abstracto usando lambda
		Interface1 objeto2 = (a,b) -> { //ejemplo con {}
			return a + b;
		}; 
		
		//otro ejemplo lista integers con stream
		
		List<Integer> entrada = new ArrayList<Integer>(Arrays.asList(1,2,3,7,9));
		
		//el método max no soporta la clase Integers por eso haces antes mapToLong (igual con min y average)
		//para convertirlo en primitivo
		long max = entrada.stream()
				.mapToLong(x->x)
				.max().orElseThrow(NoSuchElementException::new); //si no puedes conseguir el máximo lanzas exception
		
		entrada.forEach(System.out::println);
		System.out.println("Maximo: " +max);

		
		System.out.println(objeto.cuenta(3, 5));
		System.out.println(objeto.resuelto(20));
		System.out.println(objeto.saluda());
	}

}
