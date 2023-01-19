package ejercicios05;

/**
 * Clase que convierta números a letras
 * @author andrea.sanclemente
 *
 */

public class Ejercicio04 {

	public static void main(String[] args) {
		int num = 26;
		int unidades;
		int decenas;
		String mensaje = "";
		String[] parte1 = {"", "uno", "dos", "tres","cuatro", "cinco", "seis", "siete", "ocho", "nueve","diez", "doce", "trece","catorce","quince"};
		String[] parte2 = {"","diez","veinte", "treinta", "cuarente", "cincuenta", "sesenta","setenta", "ochenta","noventa"};
		
		unidades = num%10;
		decenas = num /10;

			if (num < 16) {
				System.out.println(parte1[num-1]);
			}else {
				System.out.println(parte2[decenas] + " y " + parte1[unidades]);
			}
			if (decenas == 2) {
				mensaje = "venti";
			}
			if (decenas == 1) {
				mensaje = "dieci";
			}
			mensaje += parte1[unidades];
			System.out.println(mensaje);
	}
}
