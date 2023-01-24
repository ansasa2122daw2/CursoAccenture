package banco;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		LocalDate hoy = LocalDate.now();
		
		//Pruebas con los métodos de cuenta
		Cuenta cuent = new Cuenta("123456", "Andrea Sánchez");
		System.out.println("\nTarjeta CUENTA");
		cuent.getSaldo();
		cuent.ingresar(500);
		cuent.ingresar("Prueba cuenta ", 200);
		cuent.getSaldo();
		cuent.retirar(100);
		cuent.getSaldo();
		
		//Prueba con los métodos de debito | Primero haciendo setCuenta 
		Debito deb = new Debito(hoy, "123456", "Andrea");
		System.out.println("\nTarjeta DEBITO");
		deb.setCuenta(cuent);
		deb.ingresar(100);
		deb.getSaldo();
		deb.retirar(100);
		deb.getSaldo();
		
		//Prueba con los métodos de credito | Primero haciendo setCredito
		Credito cred = new Credito(hoy, "12345", "Andrea");
		System.out.println("\nTarjeta CREDITO");
		cred.setCuenta(cuent);
		cred.ingresar(150);
		cred.retirar(50);
		cred.getSaldo();
		//ejemplo liquidación
		cred.liquidar(01, 2023);
		cred.getSaldo();
		


	}

}
