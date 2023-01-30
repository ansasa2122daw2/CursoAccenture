package ejercicios01;

import java.io.File;
import java.util.Scanner;

/**
 * Clase FileScanner ejemplo de File con Scanner y try/catch
 * @author andrea.sanclemente
 *
 */

public class FileScanner {

	public static void main(String[] args) {
		//carpeta ruta completa hasta el archivo
		File fichero = new File("C:\\aCursoAccenture\\cursowk\\TerceraSemana\\src\\ejercicios01\\FileScanner.java");
		//try con resource entonces no tienes que hacer un close al final
		try (Scanner leerfichero = new Scanner(fichero)){
		//en vez de utilizar nextLine puedo usar Delimiter
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
