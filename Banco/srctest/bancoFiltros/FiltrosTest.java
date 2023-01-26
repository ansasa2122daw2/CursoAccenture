package bancoFiltros;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class FiltrosTest {
	final String TITULAR1 = "Este titular es de 21";
	final double DINERO = 5;
	final String FECHA= "12.12.2002";
	final String FECHA2= "12/12/2002";
	final String FECHA3= "12-12-2002";
	final String FECHA4= "12-12-22";
	
	@Test
	void testFechaCorrecta() throws Exception{
		assertEquals(Filtros.fechaCorrecta(FECHA2),null);
	}
	

	@Test
	void testFiltroString() {
		assertFalse(Filtros.filtroString(TITULAR1, 20, 25));
	}
	
	@Test
	void testFiltroString2() {
		assertTrue(Filtros.filtroString(TITULAR1,80, 6));
	}

	@Test
	void testFiltroFecha() {
		LocalDate hoy = LocalDate.now();
		assertTrue(Filtros.filtroFecha(hoy, hoy.withYear(2026), hoy.withYear(2024)));
		System.out.println(Filtros.filtroFecha(hoy, hoy.withYear(2026), hoy.withYear(2024)));
	}
	
	@Disabled
	@Test
	void testFiltroFecha2() {
		LocalDate hoy = LocalDate.now();
		assertFalse(Filtros.filtroFecha(hoy, hoy.withYear(2029), hoy.withYear(2020)));
		System.out.println(Filtros.filtroFecha(hoy, hoy.withYear(2029), hoy.withYear(2020)));
	}

	@Test
	void testFiltroDinero() {
		assertFalse(Filtros.filtroDinero(DINERO, 30, 10));
	}
	
	@Test
	void testFiltroDinero2() {
		assertTrue(Filtros.filtroDinero(DINERO, 5, 3));
	}

}
