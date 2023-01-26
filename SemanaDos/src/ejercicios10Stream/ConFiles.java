package ejercicios10Stream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class ConFiles {
	public static void main(String[] args) throws IOException{
		Stream ficheros = Files.list(Paths.get("."));
		ficheros.forEach(System.out::println);
		
		//con walk sacaria todo lo de \src
		Stream ficheros2 = Files.walk(Paths.get("."));
		ficheros2.filter(p -> p.toString().endsWith(".java")).forEach(System.out::println);
		

	}
}
