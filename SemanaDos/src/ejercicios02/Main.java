package ejercicios02;

public class Main {

	public static void main(String[] args) {
		Usuario usu = new Usuario("Fernando", "C/Felicidad", "fernando@gmail.com", 23);
		Cliente client = new Cliente("Raquel", "C/Restar", "raquel@gmail.com", 2102, "12 febrero 2012");

		System.out.println("Cliente: ");
		
		client.verFechaAlta();
		client.crear();
		client.borrar();
		client.enviarMensaje();
		
		System.out.println("\nUsuario: ");
		
		usu.autorizar();
		usu.crearUsuario();
		usu.crear();
		usu.borrar();
		usu.enviarMensaje();
		
	}

}
