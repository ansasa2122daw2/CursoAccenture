package banco;

import java.time.LocalDate;

/**
 * Clase Main donde creo objetos de las clases para poder probar los métodos
 * @author andrea.sanclemente
 *
 */

public class Main {

	public static void main(String[] args) {
		LocalDate hoy = LocalDate.now();
		
		//Pruebas con los métodos de cuenta
		Cuenta cuent = new Cuenta("123456", "Andrea Sánchez");
		System.out.println("\n------------Movimientos en la cuenta------------");
		cuent.getSaldo();
		//cuent.ingresar(500); //Ejemplo error filtro de ingresar más dinero
		//cuent.ingresar("ingre", 200); //Ejemplo error filtro de concepto
		cuent.getSaldo();
		cuent.retirar("Pago realizado a Aliexpress", 100);
		cuent.getSaldo();
		
		//Prueba con los métodos de debito | Primero haciendo setCuenta 
		Debito deb = new Debito(hoy, "123456", "Andrea");
		System.out.println("\n------------Movimientos en la tarjeta debito------------");
		deb.setCuenta(cuent);
		deb.ingresar(100);
		deb.retirar(100);
		
		//Prueba con los métodos de credito | Primero haciendo setCredito
		Credito cred = new Credito(hoy, "12345", "Andrea");
		System.out.println("\n------------Movimientos en la tarjeta credito------------");
		cred.setCuenta(cuent);
		cred.ingresar(150);
		cred.retirar(50);
		//ejemplo liquidación
		cred.liquidar(hoy.getMonthValue(), hoy.getYear());


	}

}
