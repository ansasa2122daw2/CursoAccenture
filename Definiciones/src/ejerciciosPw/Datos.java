package ejerciciosPw;

public class Datos {
	static int dia = 10;
	static double nDni = 57433222;
	static double precio;
	static final boolean ACTIVO=true; 
	
	public static void main(String[] args) {
//		int dia = 10;
//		double nDni = 57433222;
//		double precio;
//		final boolean ACTIVO=true;
		
		precio = 135.12;
		
		System.out.println("Dia\t" + dia + "\nDni\t" + (int)nDni + "\nPrecio\t" + precio + "\nActivo? " +ACTIVO);
	}

}
