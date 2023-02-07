package rf.curso.maven.ProyectoPrueba.util;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import rf.curso.maven.ProyectoPrueba.dominio.Country;

class MontadorSQLTest {
	
	final String NOMCAMPO = "region_id";
	
	final int VALOR_INT = 2;
	final long VALOR_LONG = 12345;
	final double VALOR_DOUBLE = 23.45;
	final String VALOR_STRING = "Valor Texto";
	
	final String SALIDA_UNO_OK = "region_id = 2";
	final String SALIDA_DOS_OK = "region_id = 23.45";
	final String SALIDA_TRES_OK = "region_id = 12345";
	final String SALIDA_CUATRO_OK = "region_id = 'Valor Texto'";
	
	@Test
	void testAddSalidaStringStringIntString() {
		String salida = "";
		salida = MontadorSQL.addSalida(salida, NOMCAMPO,VALOR_INT,",");
		assertEquals(SALIDA_UNO_OK, salida);
	}

	@Test
	void testAddSalidaStringStringDoubleString() {
		String salida = "";
		salida = MontadorSQL.addSalida(salida, NOMCAMPO, VALOR_DOUBLE, ",");
		assertEquals(SALIDA_DOS_OK.trim(), salida.trim());
	}

	@Test
	void testAddSalidaStringStringLongString() {
		String salida = "";
		salida = MontadorSQL.addSalida(salida, NOMCAMPO, VALOR_LONG, ",");
		assertEquals(SALIDA_TRES_OK.trim(), salida.trim());
	}

	@Test
	void testAddSalidaStringStringStringString() {
		String salida = "";
		salida = MontadorSQL.addSalida(salida, NOMCAMPO, VALOR_STRING, ",");
		assertEquals(SALIDA_CUATRO_OK.trim(), salida.trim());
	}


}
