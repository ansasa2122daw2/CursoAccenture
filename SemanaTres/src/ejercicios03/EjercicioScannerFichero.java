package ejercicios03;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Ejercicio Corregido el List y el for no hacian falta
 * @author andrea.sanclemente
 *
 */

public class EjercicioScannerFichero {
	public static void main(String[] args) {
		String nombre;
		String apellido;
		
		Scanner teclado = new Scanner(System.in);

		System.out.print("Introduce tu nombre: ");
		nombre = teclado.next();
		teclado.nextLine();
		System.out.print("Introduce tu apellido: ");
		apellido = teclado.next();

//		List listar = new ArrayList();
//		listar.add(nombre + apellido);
		
		FileWriter fichero = null;
		PrintWriter pw = null;
		
		try {
			fichero = new FileWriter("C:\\aCursoAccenture\\cursowk\\SemanaTres\\src\\ejercicios03\\fichero.txt");
			pw = new PrintWriter(fichero);
			
			//for (int i=0; i < listar.size(); i++) 
				//pw.println(i +  " Nombre y apellido " + nombre + " " + apellido);
			
			//era Nombre= y Apellido=
			pw.println("Nombre=" + nombre + " Apellido=" + apellido);
			}catch(Exception e ){
			e.printStackTrace();
			
		}finally {
			try {
				if(null !=fichero)
					fichero.close();
			}catch(Exception e2) {
				e2.printStackTrace();
			}
		}

	}

}
