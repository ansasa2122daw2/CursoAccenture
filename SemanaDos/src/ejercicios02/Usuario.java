package ejercicios02;

/**
 * Clase usuario que hereda de Persona (extends) 
 * @author andrea.sanclemente
 *
 */

public class Usuario extends Persona{
	private int codigoUsuario;

	public Usuario(String nombre, String direccion, String correoElectronico, int codigoUsuario) {
		super();
		this.codigoUsuario = codigoUsuario;
	}

	public int getCodigoUsuario() {
		return codigoUsuario;
	}

	public void setCodigoUsuario(int codigoUsuario) {
		this.codigoUsuario = codigoUsuario;
	}
	
	/**
	 * Métodos OVERRIDE de Persona
	 */
	
	@Override
	public void crear() {
		super.crear();
	}

	@Override
	public void borrar() {
		super.borrar();
	}

	@Override
	public void enviarMensaje() {
		super.enviarMensaje();
	}
	
	//método de Persona
	@Override
	public String aString() {
		return "Cliente:" + getCodigoUsuario() + "-->" + getNombre();
	}
	
	/**
	 * Método autorizar
	 */
	
	public void autorizar() {
		System.out.println("Autorizado");
	}
	
	/**
	 * Método crear
	 */
	
	public void crearUsuario() {
		System.out.println("Creado");
	}

}
