package ejercicio1;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("HOLA MUNDO");
		System.out.println("Pruebas de tipos");
		
		char c='A';
		double precio=23.4;
		double iva=0.16;
		double importeTotal;
		importeTotal=precio*iva+precio;
		
		System.out.println("Caracter: "+c);
		System.out.println("Equivalencia Unicode: "+(int)c); //pasar c a int CAST
		System.out.println("Importe Total=: "+importeTotal);
		System.out.println("Primavera\nVerano\nOtoño\nInvierno");
		System.out.println("Lun\tMar\tMie\tJue\tVie");
		System.out.println("Lun\\Mar\\Mie\\Jue\\Vie");
		System.out.println("\"Cocodrilo\"");
		
		//Pasar un String a numero
		int importe = 100;
		String valor = importe + "";
	}

}
