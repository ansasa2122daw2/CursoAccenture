package ejercicios03;

/**
 * Ejercicio Datos y Datos2, variables vistas por cualquier método de la clase
 * @author andrea.sanclemente
 *
 */

public class Ejercicio1 {
	/**
	 * Variables definidas para ser vistas
	 */
	
	static int dia = 10;
	static double nDni = 57433222;
	static double precio;
	static final boolean ACTIVO=true; 

	public static void main(String[] args) {
		
		precio = 135.12;
		
		System.out.println("Dia\t" + dia + "\nDni\t" + (int)nDni + "\nPrecio\t" + precio + "\nActivo? " +ACTIVO);

	}

}
