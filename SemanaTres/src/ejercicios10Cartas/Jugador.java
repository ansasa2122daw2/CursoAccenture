package ejercicios10Cartas;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Jugador {
	private String nombre;
	private int edad;
	private Set<Carta> mano;
	
	public Jugador(String nombre, int edad, Set<Carta> mano) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.mano = mano;
	}
	
	public Jugador(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}
	
	public Jugador() {
		mano = new HashSet<>();
	}

	public Jugador(List<Jugador> jugadoresList) {
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public Set<Carta> getMano() {
		return mano;
	}
	
	@Override
	public String toString() {
		return "Jugador [nombre=" + nombre + ", edad=" + edad + ", mano=" + mano + "]";
	}

	/**
	 * Creas este método
	 * @param carta
	 */

	public void setMano(Set<Carta> mano) {
		mano = new HashSet<>();
		this.mano = mano;
	}


}
