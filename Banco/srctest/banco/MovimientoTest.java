package banco;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class MovimientoTest {
	
	final String CONCEPTO_1 = "Concepto";
	final int IMPORTE_1 = 100;
	Movimiento mov;
	
	@BeforeEach
	void creacion() {
		mov = new Movimiento();
	}
	
	@Test
	void testGetmImporte() {
		mov.setmImporte(IMPORTE_1);
		assertEquals(IMPORTE_1, mov.getmImporte());
	}

	@Test
	void testGetmConcepto() {
		mov.setmConcepto(CONCEPTO_1);
		assertEquals(CONCEPTO_1, mov.getmConcepto());
	}

	@Test
	void testGetmFecha() {
		LocalDate hoy = LocalDate.now();
		mov.setmFecha(hoy);
		assertEquals(hoy, mov.getmFecha());
	}

	/**
	 * Ejemplo Excepcion ( si fuera Excepcion.class) o tu filtro (MiFiltro.class)
	 */
	@Disabled
	@Test
	void testToString() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			mov.getmFecha();
		});
	}

}
