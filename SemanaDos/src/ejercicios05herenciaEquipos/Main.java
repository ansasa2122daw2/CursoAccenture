package ejercicios05herenciaEquipos;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase Main para printar los datos y metodos
 * @author andrea.sanclemente
 *
 */

public class Main {

	public static void main(String[] args) {	
		
		List<Equipo> lista = new ArrayList<Equipo>();
		
		//Entrenador creado con sus metodos y lo añadimos a lista
		Entrenador oEntrenador = new Entrenador(22, "Felipe", "Gomez Torres", 45, "a243");
		oEntrenador.concentrarse();
		oEntrenador.viajar();
		oEntrenador.dirigirEntrenamiento();
		oEntrenador.dirigirPartido();
		lista.add(oEntrenador);
		
		//Futbolista creado con sus metodos y lo añadimos a lista
		Futbolista oFutbolista = new Futbolista(26, "Manolo", "Ramirez de la Corte", 32, 234, "delantero");
		oFutbolista.concentrarse();
		oFutbolista.viajar();
		oFutbolista.jugarPartido();
		oFutbolista.entrenar();
		lista.add(oFutbolista);
		
		//Masajista creado con sus metodos y lo añadimos a lista
		Masajista oMasajista = new Masajista(9, "David", "Romero Cruz", 35, "Masajista", 12);
		oMasajista.concentrarse();
		oMasajista.viajar();
		oMasajista.darMasaje();
		lista.add(oMasajista);
		
		lista.forEach(prent-> System.out.println(prent));
		
		/**
		 * Propuesta profesor
		 */
		
		lista.forEach(actual-> {
			actual.concentrarse();
			actual.viajar();
			if (actual instanceof Entrenador) {
				((Entrenador) actual).dirigirPartido();
				((Entrenador) actual).dirigirEntrenamiento();
			}
			if (actual instanceof Futbolista) {
				((Futbolista) actual).jugarPartido();
				((Futbolista) actual).entrenar();
			}
			if (actual instanceof Masajista) {
				((Masajista) actual).darMasaje();
			}
		});
		
	}

}
