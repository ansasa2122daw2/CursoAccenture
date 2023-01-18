package ejerciciosPwOperadores;

public class LineaFactura {
	//nada de literales 
	//forma bonita para no poner 1.21 en todo el medio
	final static int IVA = 21;

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

		iva = (importe*(IVA/100));
		//total= (int)(importe * 1.21);
		total= (int)(importe + iva);
		
		System.out.println("cantidad\t=" + cantidad);
		System.out.println("unidades\t=" + unidades);
		System.out.println("precio\t=" + precio);
		System.out.println("Importe =" + importe);
		System.out.println("Iva =" + iva);
		System.out.println("Total =" + total +"\tdeberia ser:" + importe + iva);
		

	}

}
