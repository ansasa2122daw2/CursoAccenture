package ejercicios02;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Clase ejemplo para ver el acceso de ficheros
 * @author andrea.sanclemente
 *
 */

public class FicheroPath {

	public static void main(String[] args) {
		//toda la estructura de ruta (importante toAbsolutePath y normalize)
		Path currentDir = Paths.get(".\\prueba.txt").toAbsolutePath().normalize();
		System.out.println(currentDir.toString());
		System.out.println("File Name- " + currentDir.getFileName());
		System.out.println("Get Name- " + currentDir.getName(1));
		System.out.println("Get Name Count- " + currentDir.getNameCount());
		System.out.println("Sub Path- " + currentDir.subpath(0,2));
		System.out.println("Get Parent- " + currentDir.getParent());
		System.out.println("Get Root- " + currentDir.getRoot());
		//System.out.println("Get Absolute Path- " + currentDir.getAbsolutePath());
		//System.out.println("Get Real Path- " + currentDir.toRealPath());
		System.out.println("To File- " + currentDir.toFile());
		System.out.println("Normalize- " + currentDir.normalize());
		//System.out.println("Compare To- " + currentDir.compareTo("SegundaSemana"));
		System.out.println("Ends With(Path other)- " + currentDir.endsWith("prueba.txt"));
		System.out.println("Ends With(String other)- " + currentDir.endsWith("prob.txt"));
	}

}
