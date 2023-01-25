package banco;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DebitoTest {
	
	private double IMPORTE = 50;
	private double IMPORTERETIRAR = 10;
	
	Debito deb;
	
	@BeforeEach
	void crear() {
		deb = new Debito();
	}

	@Test
	void testGetSaldo() {
		fail("Not yet implemented");
	}

	@Test
	void testIngresar() throws Exception{
		deb.ingresar(IMPORTE);
		assertEquals(IMPORTE, deb.getSaldo());
	}

	@Test
	void testPagoEnEstablecimiento() {
		fail("Not yet implemented");
	}

	@Test
	void testRetirar() throws Exception{
		deb.ingresar(IMPORTE);
		deb.retirar(IMPORTERETIRAR);
		assertEquals(deb.getSaldo(), deb.getSaldo());
	}

	@Test
	void testDebitoLocalDateStringString() {
		fail("Not yet implemented");
	}

}
