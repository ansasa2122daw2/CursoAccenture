package ejercicios06Automovil;

/**
 * Creacion Interface
 * @author andrea.sanclemente
 *
 */

public interface ABD {
	/**
	 * Recibe un objeto SQL y lo transforma en el correcto
	 */
	public void leer();
	
	/**
	 * Coge la estructura y le da forma SQL
	 */
	public void grabar();

}
