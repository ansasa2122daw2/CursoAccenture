package ejercicio4Bucle;

public class ColeccionNum5 {

	public static void main(String[] args) {

		System.out.println(Integer.parseInt(args[0]));
		int num, calculo;
		
		for(String ele:args) {
			num = Integer.parseInt(ele); 
			calculo = num * num;
			System.out.println(num + " al cuadrado es igual a " + calculo);
		}
		

	}
	
	

}
