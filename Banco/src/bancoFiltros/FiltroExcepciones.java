package bancoFiltros;

import bancoExcepciones.MiExcepcion;

public class FiltroExcepciones {
	private final static int CONCEPTMAX = 40;
	private final static int CONCEPTMIN = 15;

	
	public static boolean conceptoFiltroError(String concepto, double x) {
		if (x <= 0) {
			throw new MiExcepcion("No se puede ingresar cantidad negativa");
		}
		if (!Filtros.filtroString(concepto, CONCEPTMAX, CONCEPTMIN)) {
			throw new MiExcepcion("Error tamaño concepto");
		}
		return true;
	}
}
