package ejercicios10Cartas;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Main {
	
	static final int CARTASNUM = 5;
	
	static Paquete pq = new Paquete();
	static Carta cartas = new Carta();
	static List<Jugador> jugadores = new ArrayList<>();
	static Set<Carta> cartasBaraja = new HashSet<>();
	
	static String tipoBaraja = Paquete.ESPANOLA;
	
	public static void main(String[] args) {

		pq.baraja(tipoBaraja);
		cartasBaraja = pq.cartas;
		cartasBaraja.forEach(System.out::println);
		
		
		recibesJugadores();
		
		visualiza();
		
		reparte();
		
		visualizaJugador("Andrea");
		
		
	}
	
	static void reparte() {
		Iterator<Carta> it = cartasBaraja.iterator();
		for(int i = 0; i < CARTASNUM; i++) {
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
			jugadores.forEach(System.out::println);
		}
	}
	
	static void visualiza() {
		System.out.println(jugadores.toString());

	}
	
	static void visualizaJugador(String nombre) {
	    for(int i=0; i<jugadores.size(); i++){
	        Jugador jugador = jugadores.get(i);
	        if(jugador.getNombre() == nombre) {
		    	System.out.println(jugadores.get(i).toString());
		    }
	    }
		
	}

}
