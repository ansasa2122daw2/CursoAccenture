package ejercicios03;

import java.io.File;

/**
 * Ejercicio corrección. 1 fallo se debería tener en cuenta de que te llega el nombre y apellido
 */
import java.util.Scanner;

public class LeerFichero {
	public static void main(String[] args) {
		File fichero = new File("C:\\aCursoAccenture\\cursowk\\SemanaTres\\src\\ejercicios03\\fichero.txt");
		try (Scanner leerfichero = new Scanner(fichero)){
		leerfichero.useDelimiter("\n");
		
		while(leerfichero.hasNext()) {
			String cadena = leerfichero.next();
			System.out.println(cadena + " ");
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
