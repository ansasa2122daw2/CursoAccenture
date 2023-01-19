package ejercicios05;

/**
 * Powerpoint ejercicio "Viendo los bucles" con las diferentes opciones.
 * @author andrea.sanclemente
 *
 */

public class Ejercicio01PowerPoint {

	/**
	 * Usando args para modificar la frase
	 * @param args
	 */
	public static void main(String[] args) {
		
		/**
		 * Primera modificacion Invertir orden palabras
		 */

		System.out.println("Fase 1:");
		System.out.println(args[0]);
		String salida="";

		for(String ele:args) {
			salida = salida + ele + " "; 
		}
		System.out.println(salida);
		
		/**
		 * Fase 2 Invertir orden palabras
		 */
		
		System.out.println("*****************");
		System.out.println("\nFase 2: (invertir orden palabras)");
		
		String[] palabras = salida.split(" ");
		int fin = palabras.length;
		String salida2= "";
		
		for(int i = fin-1; i>=0; i--) {
			salida2 = salida2 + palabras[i] + " ";
		}
		System.out.println(salida2);
		
		/**
		 * Fase 3 Invertir orden frase
		 */
		
		System.out.println("*****************");
		System.out.println("\nFase 3: (invertir orden frase)");

		String invertirSalida = "";
		for (int i = salida.length() -1; i>0 ; i-- ) {

			invertirSalida += salida.charAt(i);
		}
		System.out.println(invertirSalida);
		
		/**
		 * Fase 4: Inversion cambiando vocales
		 */
		
		System.out.println("*****************");
		System.out.println("\nFase 4: (Inversion cambiando vocales)");

		String fraseCambio="";
		for (int i = salida.length() -1; i>0 ; i-- ) {
			char letra = salida.charAt(i);

			letra = conver(letra);	
			
			fraseCambio += letra;
		}
		System.out.println(fraseCambio);
		
		/**
		 * Fase 5: Dar la vuelta al string pero sin lenght y sin contar /
		 */
		
		System.out.println("*****************");
		System.out.println("\nFase 5: (Dar la vuelta al string pero sin lenght y sin contar el primer / y que se pare en el ultimo /)");
		
		char bus = salida.charAt(0);
		String salidaGirada = "";
		// por si no han puesto el caracrter del final salida + bus
		for (int a = 1; (salida + bus).charAt(a) != bus ; a++) {
			System.out.print(salida.charAt(a));
			salidaGirada = salida.charAt(a) + salidaGirada;
		}
		System.out.println("\n" + salidaGirada);
		
		/**
		 * Fase 6: Sin calcular la longitud de string y sin retenedores
		 */
		
		System.out.println("*****************");
		System.out.println("\nFase 6: (Sin calcular la longitud de string y sin retenedores)");
		
		salida += (char)0;
		int pos = 0;
		String salida6 = "";
		while (salida.charAt(pos) != (char) 0) {
			//se pone salida6 al final para que salga al revés
			salida6 = salida.charAt(pos++) + salida6;
		}
		System.out.println(salida6);
	}
		
		/**
		 * Convierte vocales a codigos numericos
		 * @param letra posible vocal a convertir
		 * @return valor convertido, si necesario
		 */

		public static char conver(char letra) {
			switch(letra) {
			case 'a':
				letra = '4';
				break;
			case 'e':
				letra = '3';
				break;
			case 'o':
				letra = '0';
				break;
			case 'u':
				letra = '9';
				break;
			default:
				break;
		}
			return letra;

	}

}
