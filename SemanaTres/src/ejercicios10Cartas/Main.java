package ejercicios10Cartas;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 * MAIN juego de cartas
 * @author andrea.sanclemente
 *
 */
public class Main {
	
	static final int CARTASNUM = 5;
	
	static Paquete pq = new Paquete();
	static Carta cartas;
	static Set<Carta> cartasBaraja = new HashSet<>();
	
	public static void main(String[] args) {
		List<Jugador> jugadores = new ArrayList<>();

		cartas = new Carta();

		pq.baraja();
		cartasBaraja = pq.cartas;
		pq.getBaraja();
		
		recibesJugadores(jugadores);
		
		visualiza(jugadores);
		reparte(cartasBaraja, jugadores);
		
		visualizaJugador(jugadores, "Maria");
		
		//valorarMano1(jugadores, "Maria");
		
		
	}
	
	static void reparte(Set<Carta> baraja,List<Jugador> jugadores) {
		System.out.println("\nrepartiendo...");
		Iterator<Carta> it = baraja.iterator();
		for(int i = 0; i < CARTASNUM; i++) {
			for(Iterator<Jugador> jugad = jugadores.iterator();jugad.hasNext();) {
				Jugador actual = jugad.next();
				actual.setMano(it.next());
				it.remove();
			}
		}
	}
	
	//otro metodo repartir a jugador (para cuando se descarte)
	
	
	static void recibesJugadores(List<Jugador> jugadores) {
		if(jugadores.isEmpty()) {
			jugadores.add(new Jugador("Andrea", 20));
			jugadores.add(new Jugador("David", 21));
			jugadores.add(new Jugador("Maria", 26));
		}
	}
	
	static void visualiza(List<Jugador> jugadores) {
		System.out.println("\n********Visualizando jugadores: " + "********");
		System.out.println(jugadores.toString());

	}
	
	static void visualizaJugador(List<Jugador> jugadores, String nombre) {
		System.out.println("\n********Visualizando jugador: " + nombre + "********");
	    for(int i=0; i<jugadores.size(); i++){
	        Jugador jugador = jugadores.get(i);
	        if(jugador.getNombre().equals(nombre)) {
		    	System.out.println(jugadores.get(i).toString());
		    }
	    }
		
	}
	
	static void valorarMano1(List<Jugador> jugadores, String nombre) {
		System.out.println("\n********Valorando mano del jugador: " + nombre + "********");
	    for(int i=0; i<jugadores.size(); i++){
	        Jugador jugador = jugadores.get(i);
	        if(jugador.getNombre().equals(nombre)) {
//	        	if(isPair(jugadores)) {
//	        		System.out.println("Jugador " + nombre + " tiene un PAIR");
//	        	}
		    }
	    }
	}
	
	static boolean isPair(List<Jugador> jugadores) {
		return false;
	}
}
