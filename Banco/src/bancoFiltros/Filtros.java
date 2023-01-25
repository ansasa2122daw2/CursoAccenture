package bancoFiltros;

import java.time.LocalDate;

/**
 * Clase para filtros, strings mayor que 20 y menor que 30
 * fecha mayor que 3 años y menor que 5
 * ingresos o gastos mayor que 10 menor que 100
 * @author andrea.sanclemente
 *
 */

public class Filtros {
	private static int MAXFECHA = 3;
	private static int MINFECHA = 5;
	
	public static boolean filtroString(String texto, int maxLong, int minLong) {
		return (texto.length()<= maxLong) && (texto.length()>= minLong);
	}
		public static boolean filtroFecha(LocalDate fecha, LocalDate fMax, LocalDate fMin) {
			LocalDate hoy = LocalDate.now();
			fMax = hoy.plusYears(MAXFECHA);
			fMin = hoy.plusYears(MINFECHA);
		return false;
	}
	
	public static boolean filtroDinero(double din, int maxLong, int minLong) {
		return (din <= maxLong && din >= minLong);
		
	}

}
