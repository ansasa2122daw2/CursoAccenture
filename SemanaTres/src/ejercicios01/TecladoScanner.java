package ejercicios01;

import java.io.IOException;
import java.util.Scanner;

/**
 * Clase que lee los valores con Scanner que escribes en consola
 * @author andrea.sanclemente
 *
 */

public class TecladoScanner {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int n1, n2;
		System.out.print("Introduce un número: ");
		n1 = teclado.nextInt();
		//Con nextLine() lee hasta final de la línea
		teclado.nextLine();
		System.out.print("Introduce otro número: ");
		n2 = teclado.nextInt();
		teclado.nextLine();
		
		System.out.format("primer número: %d y segundo numero %d" ,n1,n2);
		
		//ejemplo 1 try-catch
		
//		try (Scanner teclado = new Scanner(System.in)){
//			int n1, n2;
//			System.out.print("Introduce un número: ");
//			n1 = teclado.nextInt();
//			//Con nextLine() lee hasta final de la línea
//			teclado.nextLine();
//			System.out.print("Introduce otro número: ");
//			n2 = teclado.nextInt();
//			teclado.nextLine();
//		}catch(IOException e) {
//			//
//		}
//
//		System.out.format("primer número: %d y segundo numero %d" ,n1,n2);
		
		//ejemplo 2 try-catch
//		try {
//			int n1, n2;
//			System.out.print("Introduce un número: ");
//			n1 = teclado.nextInt();
//			//Con nextLine() lee hasta final de la línea
//			teclado.nextLine();
//			System.out.print("Introduce otro número: ");
//			n2 = teclado.nextInt();
//			teclado.nextLine();
//		}catch(IOException e) {
//			//
//		}finally{
//			teclado.close();
//	}
	}
	
	

}
