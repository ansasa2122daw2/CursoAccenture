package ejercicios05herenciaEquipos;

/**
 * Clase Masajista que extiende de Equipo
 * @author andrea.sanclemente
 *
 */

public class Masajista extends Equipo {
	private String titulacion;
	private int aniosExperiencia;

	public Masajista(int id, String nombre, String apellidos, int edad, String titulacion, int aniosExperiencia) {
		super(id, nombre, apellidos, edad);
		this.titulacion = titulacion;
		this.aniosExperiencia = aniosExperiencia;
	}
	
	public String getTitulacion() {
		return titulacion;
	}

	public void setTitulacion(String titulacion) {
		this.titulacion = titulacion;
	}

	public int getAniosExperiencia() {
		return aniosExperiencia;
	}

	public void setAniosExperiencia(int aniosExperiencia) {
		this.aniosExperiencia = aniosExperiencia;
	}
	
	/**
	 * Métodos de Equipo 
	 */

	@Override
	public void concentrarse() {
		System.out.println(getNombre() + " (masajista) concentrandose");

	}

	@Override
	public void viajar() {
		System.out.println(getNombre() + "(masajista) viajando a...");

	}
	
	/**
	 * Métodos creados solo para masajista
	 */
	
	public void darMasaje() {
		System.out.println(getNombre() + " da un masaje \n");
	}
	
	/**
	 * Método toString
	 */

	@Override
	public String toString() {
		return super.toString() + "Masajista [titulacion=" + titulacion + ", aniosExperiencia=" + aniosExperiencia + "]";
	}
	
	

}
