package ejercicio4Bucle;

public class TablaMultiplicar9 {

	public static void main(String[] args) {

		for (int tabla = 1; tabla <=10; tabla++) {
			System.out.println("--------------");
			System.out.println(" Tabla del " + tabla);
			System.out.println("--------------");
			for (int i = 1; i <= 10; i++) {
				System.out.println(tabla + " x " + i + " = " + tabla * i);
			}
		}

		}


}
