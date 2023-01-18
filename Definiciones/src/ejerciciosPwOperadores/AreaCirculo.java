package ejerciciosPwOperadores;

public class AreaCirculo {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int radio;
		double areaCirculo;
		double longitud;
		
		radio=23;
		areaCirculo = Math.PI * Math.pow(radio, 2); //otra forma (radio * radio)
		longitud = 2 * Math.PI * radio;
		
		System.out.println("\nRadio: "+ radio + "\nArea Circulo: " + areaCirculo + "\nLongitud: " + longitud);
		

	}

}
