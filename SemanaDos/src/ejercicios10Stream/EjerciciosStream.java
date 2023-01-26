package ejercicios10Stream;

import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Random;
import java.util.stream.Stream;

public class EjerciciosStream {
	
	public static void main(String[] args) {
		int[] num = new int[] {1,2,3,4,5,6,7,8,9,10};

		int[] stream = Arrays.stream(num)
				.filter(x-> x%2 == 0)
				.toArray();
			
		Arrays.stream(stream).forEach(System.out::println);
		
		//ejemplo counting
		long stream2 = Arrays.stream(num)
				.filter(x-> x%2 == 0)
				.count(); //el resultado de count tiene que ser long
			
		System.out.println("Contador " + stream2);
		
		//ejemplo iterate
		Stream.iterate(0, n -> n+1)
			.limit(10)
			.forEach(x -> System.out.println(x));
		
		//ejemplo generate
		Random rand = new Random();
		Stream.generate(() -> rand.nextInt(100))
			.limit(20)
			.forEach(System.out::println);
		
		//ejemplo de peek
		Random rand2 = new Random();
		Stream.generate(() -> rand2.nextInt(100))
			.limit(20)
			.peek((a) -> {
				System.out.println("……………");
				System.out.println(a);
			})
			.forEach(System.out::println);
	}
	
}
