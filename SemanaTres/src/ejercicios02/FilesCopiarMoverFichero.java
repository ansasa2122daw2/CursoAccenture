package ejercicios02;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class FilesCopiarMoverFichero {
	public static void main(String[] args) throws IOException {
		//Utilizando Path para origen y destino
		//Ruta al fichero origen
		
		/**
		 * Copiar fichero
		 */
		Path pathSource1 = Paths.get("C:\\aCursoAccenture\\cursowk\\SemanaTres\\src\\ejercicios01","prueba.txt");
		Path destPath2 = Paths.get("C:\\aCursoAccenture\\cursowk\\SemanaTres\\src\\ejercicios02","pruebaCopia.txt");
		
		Path target = Files.copy(pathSource1,destPath2,StandardCopyOption.REPLACE_EXISTING);
		System.out.println(target.getFileName());
		
		/**
		 * Mover un fichero
		 */
		
		Path origen = Paths.get("C:\\aCursoAccenture\\cursowk\\SemanaTres\\src\\ejercicios01","prueba.txt");
		Path destino = Paths.get("C:\\aCursoAccenture\\cursowk\\SemanaTres\\src\\ejercicios02\\movido.txt");
		Files.move(origen, destino,  StandardCopyOption.REPLACE_EXISTING);
	}
	

}
