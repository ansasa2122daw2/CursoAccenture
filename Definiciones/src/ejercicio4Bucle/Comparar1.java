package ejercicio4Bucle;

public class Comparar1 {

	public static void main(String[] args) {
		comparar(10, 20);
		comparar(3, 5);
		comparar(5, 5);

	}
	
	public static void comparar(int v1, int v2) {

		if (!(v1 > v2) && !(v1==v2)) {
			System.out.println(v2 + " es mayor que " + v1);
		}
		if (v1 > v2 && !(v1==v2)) {
			System.out.println(v1 + " es mayor que " + v2);
		}
		if (v1 == v2) {
			System.out.println("Son iguales");
		}
		if (v1%v2 == 0 || v2%v1 == 0) {
			System.out.println(v1 + " es multiplo de " + v2);
		}
		else {
			System.out.println("No son multiplos");
		}
	}

}
