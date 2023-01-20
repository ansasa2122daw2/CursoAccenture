package ejercicios02;

/**
 * Clase Persona Abstract que es la clase Padre y tiene dos clases hijas (Cliente y Usuario)
 * @author andrea.sanclemente
 *
 */

//Clase abstracta suelen ser clases padres como ahora. Obligas a tener tus métodos
//Así tambien no tienes que usar la clase persona si no las hijas en el main
public abstract class Persona implements EjemploImplements {
	private String nombre;
	private String direccion;
	private String correoElectronico;
	
	//definir método abstract que lo pondremos en las clases hijas
	//si haces implement y como en esa clase es public tienes que poner esta public también
	public abstract String aString();
		
	public Persona() {
		super();
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getCorreoElectronico() {
		return correoElectronico;
	}
	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}
	
	/**
	 * Método crear
	 */
	
	public void crear() {
		System.out.println("Persona creada");
	}
	
	/**
	 * Método borrar
	 */
	
	public void borrar() {
		System.out.println("Persona borrada");
	}
	
	/**
	 * Método enviar mensaje
	 */
	
	public void enviarMensaje() {
		System.out.println("Mensaje enviado");
	}

}
