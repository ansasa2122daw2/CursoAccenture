package ejercicio4Bucle;

public class Factorial8 {

	public static void main(String[] args) {
		factorial(8);
		System.out.println(factorialR(8));
	}
	
	public static void factorial(int num) {
		int factorial =1;
		for(int i = 1; i<=num; i++) {
			factorial= factorial*i;
		}
		System.out.println("Factorial de " + num + " es " + factorial);
	}
	
	//manera recursiva, int ya que haces return (profe)
	static int factorialR(int num) {
		if(num>1) {
			return num*factorialR(--num);
		}
		else {
			return num;
		}
	}

}
