package ejercicios08Execepciones;

public class Main {
	private int a;
	private int b;

	//tercer ejercicio pones throws Exception
	public static void main(String[] args) throws Exception{
		calcular(0,300);
	}
	
	/**
	 * Primer ejercicio con try catch finally
	 * @param a
	 * @param b
	 */
	
//	public static void calcular(int a, int b) {		
//		try {
//			int resultado = b/a;
//			System.out.println(resultado);
//		}catch(ArithmeticException e){
//			System.out.println("Se ha producido un error" + e);
//		}
//		finally {
//			System.out.println("Programa finalizado");
//		}
//		
//	}
	
	/**
	 * Segundo ejercicio, no procesamos error y lo procesamor al modulo llamador
	 * @param a
	 * @param b
	 */
	
//	public static void calcular(int a, int b) {		
//		try {
//			int resultado = b/a;
//			System.out.println(resultado);
//		}
//		finally {
//			System.out.println("Programa finalizado");
//		}
//		
//	}
	
	/**
	 * Tercer ejercicio 
	 * @throws Exception 
	 * 
	 */
	public static void calcular(int a, int b) throws Exception {		
		try {
			int resultado = b/a;
			System.out.println(resultado);
		}catch (ArithmeticException e) {
			System.out.println("Se ha producido un error");
			e.printStackTrace();
			throw (new Exception());
		}
		finally {
			System.out.println("Programa finalizado");
		}
	}
	
	/**
	 * Mi excepcion
	 * @param a
	 * @param b
	 */
	
//	public static void calcular(int a, int b) {		
//		try {
//			int resultado = b/a;
//			System.out.println(resultado);
//		}catch(ArithmeticException e){
//			throw new MiExcepcion("Se ha producido un error");
//		}
//		finally {
//			System.out.println("Programa finalizado");
//		}
//	}
	
}
