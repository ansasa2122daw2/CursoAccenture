package ejercicio4Bucle;

public class SumaMultiplos7 {

	public static void main(String[] args) {
		int contador = 10;
		int indice = 0;
		
		while (contador >0) {
				if(++indice%5==0) {
					--contador;
					System.out.println(indice);	
				}
		}
		
//		for (int i = 0; i<50; i++) {
//			if(i%5==0) {
//				System.out.println(i + " ");
//			}
//		}

	}

}
