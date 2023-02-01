package ejercicios10Cartas;

import java.util.HashSet;
import java.util.Set;

public class Paquete {
	
	Set<Carta> cartas = new HashSet<>();
	
	public void baraja() {
		if(cartas.isEmpty()) {
			for(int i = 1; i <14; i++) {
				cartas.add(new Carta(i, "CORAZONES"));
				cartas.add(new Carta(i, "DIAMANTES"));
				cartas.add(new Carta(i, "TREBOLES"));
				cartas.add(new Carta(i, "PICAS"));
			}
		}
	}
	
	public void getBaraja() {
		cartas.forEach(System.out::println);
	}
}
