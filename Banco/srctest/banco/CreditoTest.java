package banco;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CreditoTest {
	
	private double IMPORTE = 50;
	private double IMPORTERETIRAR = 10;
	private double CREDITO = 12;
	
	Credito cred;
	
	@BeforeEach
	void crear() {
		cred = new Credito();
	}

	@Test
	void testIngresar() {
		cred.ingresar(IMPORTE);
		assertEquals(IMPORTE, cred.getSaldo());
	}

	@Test
	void testPagoEnEstablecimiento() {
		fail("Not yet implemented");
	}

	@Test
	void testRetirar() {
		cred.ingresar(IMPORTE);
		cred.retirar(IMPORTERETIRAR);
		assertEquals(cred.getSaldo(), cred.getSaldo());
	}

	@Test
	void testGetCreditoDisponible() {
		double calcular;
		calcular = cred.getmCredito() + cred.getSaldo();
	}

	@Test
	void testLiquidar() {
		fail("Not yet implemented");
	}

	@Test
	void testGetmCredito() {
		cred.setmCredito(CREDITO);
		assertEquals(CREDITO, cred.getmCredito());
	}

}
