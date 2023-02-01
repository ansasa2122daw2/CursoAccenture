package ejercicios10Cartas;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Main {
	
	static final int CARTASNUM = 5;
	
	static Paquete pq = new Paquete();
	static Carta cartas;
	static List<Jugador> jugadores = new ArrayList<>();
	static Set<Carta> cartasBaraja = new HashSet<>();
	
	public static void main(String[] args) {
		cartas = new Carta();

		pq.baraja();
		cartasBaraja = pq.cartas;
		pq.getBaraja();
		
		recibesJugadores();
		
		visualiza();
		reparte(cartasBaraja, jugadores);
		
		visualizaJugador("Andrea");
		
		
	}
	
	static void reparte(Set<Carta> baraja, List<Jugador> jugadores) {
		Iterator<Carta> it = baraja.iterator();
		for(int i = 0; i < CARTASNUM; i++) {
			for(Iterator<Jugador> jugad = jugadores.iterator();jugad.hasNext();) {
				Jugador actual = jugad.next();
				//actual.setMano(it.next());
				it.remove();
				
				int numCarta = baraja.size()+1;

				Carta cartaNueva = baraja.stream().map().get()
			}
//			for(Iterator<Jugador> jugad = jugadores.iterator();jugad.hasNext();) {
//				Jugador actu = jugad.next();
//				actu.setCarta(it.next());
//				it.remove();
//			}
		}
	}
	
	static void recibesJugadores() {
		if(jugadores.isEmpty()) {
			jugadores.add(new Jugador("Andrea", 20));
			jugadores.add(new Jugador("David", 21));
			jugadores.add(new Jugador("Maria", 26));
		}
	}
	
	static void visualiza() {
		System.out.println(jugadores.toString());

	}
	
	static void visualizaJugador(String nombre) {
	    for(int i=0; i<jugadores.size(); i++){
	        Jugador jugador = jugadores.get(i);
	        if(jugador.getNombre().equals(nombre)) {
		    	System.out.println(jugadores.get(i).toString());
		    }
	    }
		
	}

}
