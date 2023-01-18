package ejercicio4Bucle;

public class Vuelta {

	public static void main(String[] args) {
		//para el args vas a click derecho Vuelta.java/Run As/Run Configurations/Arguments
		//args 0 lleva solo una palabra
		System.out.println("Fase 1:");
		System.out.println(args[0]);
		String salida="";

		//deja en ele una palabra distinta cada vez que pase
		for(String ele:args) {
			salida = salida + ele + " "; 
		}
		System.out.println(salida);
		
		System.out.println("*****************");
		System.out.println("\nFase 2: (invertir orden palabras)");
		
		String[] palabras = salida.split(" ");
		int fin = palabras.length;
		String salida2= "";
		// Es -1 porque empieza con 0, comparas con 0 porque cuando alcance se para
		for(int i = fin-1; i>=0; i--) {
			salida2 = salida2 + palabras[i] + " ";
		}
		System.out.println(salida2);
		
		System.out.println("*****************");
		System.out.println("\nFase 3: (invertir orden frase)");

		String invertirSalida = "";
		for (int i = salida.length() -1; i>0 ; i-- ) {
			//coge el char del index i
			invertirSalida += salida.charAt(i);
			//System.out.println(invertirSalida += salida.charAt(i));
		}
		System.out.println(invertirSalida);
		
		System.out.println("*****************");
		System.out.println("\nFase 4: (Inversion cambiando vocales)");

		String fraseCambio="";
		for (int i = salida.length() -1; i>0 ; i-- ) {
			char letra = salida.charAt(i);
			//ejemplo con el metodo
			letra = conver(letra);
//			
//			switch(letra) {
//			case 'a':
//				letra = '4';
//				break;
//			case 'e':
//				letra = '3';
//				break;
//			case 'o':
//				letra = '0';
//				break;
//			case 'u':
//				letra = '9';
//				break;
//		}
			fraseCambio += letra;
		}
		System.out.println(fraseCambio);
		
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
		//otro ejemplo con metodo seria:
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
		}
			return letra;
		}
		
	}


