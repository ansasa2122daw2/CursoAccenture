package banco;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import bancoExcepciones.MiExcepcion;
import bancoExcepciones.SaldoInsuficiente;
import bancoFiltros.Filtros;

/**
 * Clase Cuenta Test JUnit
 * @author andrea.sanclemente
 *
 */

class CuentaTest {
	
	private String TITULAR = "Ejemplo Titular";
	private String NUMERO = "1234566";
	private double IMPORTE = 90;
	private double IMPORTEMAL = -1.0;
	public double IMPORTERETIRAR = 10;
	final String CONCEPTO_OK = "Concepto Cumple";
	final String CONCEPTO_NO = "Concepto No Cumple";
	
	/**
	 * Definir cuent de la clase Cuenta
	 */
	Cuenta cuent;

	/**
	 * BeforeEach cada Test se inicializa la Cuenta
	 */
	@BeforeEach
	void iniciar() {
		creacion();
		
		//Ejemplo Mockito
		//Filtros asignado = Mockito.mock(Filtros.class);
//		Mockito.when(asignado.cumpleLongitud(TITULAR_ERR, Cuenta.TITULAR_MAX, Cuenta.TITULAR_MIN).thenReturn(false))
	}
	
	@BeforeEach
	void creacion() {
		cuent = new Cuenta();
	}

	@Test
	void testIngresarDouble() throws Exception{
		cuent.ingresar(IMPORTE);
		assertEquals(IMPORTE, cuent.getSaldo());
	}

	@Test
	void testIngresarStringDouble() throws Exception{
		cuent.ingresar(CONCEPTO_OK, IMPORTE);
		assertEquals(IMPORTE, cuent.getSaldo());
	}
	
	@Test
	void testRetirarDouble() throws Exception{
		cuent.ingresar(IMPORTE);
		cuent.retirar(IMPORTERETIRAR);
		assertEquals(cuent.getSaldo(), cuent.getSaldo());
	}

	@Test
	void testRetirarStringDouble() {
		cuent.ingresar(TITULAR, IMPORTE);
		cuent.retirar(TITULAR, IMPORTERETIRAR);
		assertEquals(cuent.getSaldo(), cuent.getSaldo());
	}

	@Test
	void testGetmTitular() {
		cuent.setmTitular(TITULAR);
		assertEquals(TITULAR, cuent.getmTitular());
	}

	@Test
	void testGetmNumero() {
		cuent.setmNumero(NUMERO);
		assertEquals(NUMERO, cuent.getmNumero());
	}

}
