package ejercicios06Automovil;

public class AccesoABD {

	//Recibir Coches, Motos, Cuadrados, Rectangulos
	public void accesoLectura(ABD rece) {
		//Abre BBDD
		//Prepara SQL
		//Ejecuta SQL
		rece.leer();
		System.out.println("Leido");
	}
	
	public void accesoGrabacion(ABD rece) {
		System.out.println("Grabado");
	}
}
