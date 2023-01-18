package ejercicio4Bucle;

public class NumeroALetras {

	public static void main(String[] args) {
		int num = 14;
		int unidades, decenas;
		// "" es para los ceros
		String[] parte1 = {"", "uno", "dos", "tres","cuatro", "cinco", "seis", "siete", "ocho", "nueve","diez", "doce", "trece","catorce","quince"};
		String[] parte2 = {"","diez","veinte", "treinta", "cuarente", "cincuenta", "sesenta","setenta", "ochenta","noventa"};
		
		unidades = num%10;
		decenas = num /10;
		//version buena:

			if (num < 16) {
				System.out.println(parte1[num-1]);
			}else {
				System.out.println(parte2[decenas] + " y " + parte1[unidades]);
			}

		

		
		
		

	}

}
