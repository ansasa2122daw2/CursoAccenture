package ejercicios05herenciaEquipos;

/**
 * Clase entrenador que extiende de Equipo
 * @author andrea.sanclemente
 *
 */

public class Entrenador extends Equipo {
	private String idFederacion;
	
	public Entrenador(int id, String nombre, String apellidos, int edad, String idFederacion) {
		super(id, nombre, apellidos, edad);
		this.idFederacion = idFederacion;
	}
	
	public Entrenador() {
	}

	public String getIdFederacion() {
		return idFederacion;
	}

	public void setIdFederacion(String idFederacion) {
		this.idFederacion = idFederacion;
	}
	
	/**
	 * Método toString
	 */
	
	@Override
	public String toString() {
		return super.toString() + "Entrenador [idFederacion=" + idFederacion + "]";
	}
	
	/**
	 * Métodos de la clase padre
	 */

	@Override
	public void concentrarse() {
		System.out.println(getNombre() + " (entrenador) concentrandose");
	}

	@Override
	public void viajar() {
		System.out.println(getNombre() + " (entrenador) viajando a...");

	}
	
	/**
	 * Métodos para clase Entrenador
	 */
	
	public void dirigirPartido() {
		System.out.println(getNombre() + " (entrenador) dirigiendo partido");
	}
	
	public void dirigirEntrenamiento() {
		System.out.println(getNombre() + " (entrenador) dirigiendo entrenamiento \n");
	}

}
