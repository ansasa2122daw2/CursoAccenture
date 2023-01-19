package ejercicios04;

/**
 * Calcular línea factura
 * @author andrea.sanclemente
 *
 */

public class Ejercicio2 {

	static final int IVA = 21;

	public static void main(String[] args) {
		int cantidad;
		int unidades;
		double precio;
		double importe;
		double iva;
		int total;
		
		cantidad = 3;
		unidades = 12;
		precio =5.40;
		
		importe= (cantidad * unidades * precio);

		iva = (importe*((double)IVA/100));
		total= (int)(importe + iva);
		
		System.out.println("cantidad\t=" + cantidad);
		System.out.println("unidades\t=" + unidades);
		System.out.println("precio\t=" + precio);
		System.out.println("Importe =" + importe);
		System.out.println("Iva =" + iva);
		System.out.println("Total =" + total +"\tdeberia ser:" + importe + iva);

	}

}
