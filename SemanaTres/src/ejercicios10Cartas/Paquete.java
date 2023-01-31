package ejercicios10Cartas;

import java.util.HashSet;
import java.util.Set;

public class Paquete {
	static final String ESPANOLA = "ESP";
	static final String POKER = "POK";
	static final String[] BARAJA_ESPANOLA = {"OROS","COPAS","ESPADAS","BASTOS"};
	static final String[] BARAJA_POKER = {"CORAZONES","DIAMANTES","TREBOLES","PICAS"};
	
	Set<Carta> cartas = new HashSet<>();
	
	public void baraja(String tipo) {
		if(tipo.contains(ESPANOLA)) {
			if(cartas.isEmpty()) {
				for(int i = 1; i <13; i++) {
					cartas.add(new Carta(i, "OROS"));
					cartas.add(new Carta(i, "COPAS"));
					cartas.add(new Carta(i, "ESPADAS"));
					cartas.add(new Carta(i, "BASTOS"));
					
				}
				//System.out.println(cartas.toString());
			}
		}else if(tipo.contains(POKER)){
			if(cartas.isEmpty()) {
				for(int i = 1; i <13; i++) {
					cartas.add(new Carta(i, "CORAZONES"));
					cartas.add(new Carta(i, "DIAMANTES"));
					cartas.add(new Carta(i, "TREBOLES"));
					cartas.add(new Carta(i, "PICAS"));
				}
			}
		}
	}
}
