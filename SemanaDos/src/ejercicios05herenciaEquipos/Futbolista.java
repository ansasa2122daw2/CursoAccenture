package ejercicios05herenciaEquipos;

/**
 * Clase Futbolista que extiende de Equipo
 * @author andrea.sanclemente
 *
 */

public class Futbolista extends Equipo {
	private int dorsal;
	private String demarcacion;
	
	public Futbolista(int id, String nombre, String apellidos, int edad, int dorsal, String demarcacion) {
		super(id, nombre, apellidos, edad);
		this.dorsal = dorsal;
		this.demarcacion = demarcacion;
	}
	
	public int getDorsal() {
		return dorsal;
	}

	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}

	public String getDemarcacion() {
		return demarcacion;
	}

	public void setDemarcacion(String demarcacion) {
		this.demarcacion = demarcacion;
	}
	
	/**
	 * Métodos abstractos de la clase Equipo
	 */

	@Override
	public void concentrarse() {
		System.out.println(getNombre() + " (futbolista) concentrandose");
	}

	@Override
	public void viajar() {
		System.out.println(getNombre() +" (futbolista) viajando a...");
	}
	
	/**
	 * Métodos creados para esta clase
	 */
	
	public void jugarPartido() {
		System.out.println(getNombre() + " (futbolista) jugando partido");
	}
	
	public void entrenar() {
		System.out.println( getNombre() + " (futbolista) entrenando \n");
	}
	
	/**
	 * Método toString
	 */

	@Override
	public String toString() {
		return super.toString() + "Futbolista [dorsal=" + dorsal + ", demarcacion=" + demarcacion + "]";
	}
	
	

}
