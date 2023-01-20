package ejercicios02;

/**
 * Clase Cliente que hereda de Persona
 * @author andrea.sanclemente
 *
 */

public class Cliente extends Persona{
	private int numeroCliente;
	private String fechaAlta;
	
	public Cliente(String nombre, String direccion, String correoElectronico, int numeroCliente, String fechaAlta) {
		super();
		this.numeroCliente = numeroCliente;
		this.fechaAlta = fechaAlta;
	}
	
	//ejemplo para cuando piden filtrar el nombre del padre pero solo EN CLIENTE
	public Cliente(String nombre, int numeroCliente, String fechaAlta) {
		super();
		this.setNombre(nombre);
		this.numeroCliente = numeroCliente;
		this.fechaAlta = fechaAlta;
	}
	
	//si hacen un setNombre esto hara que haciendo set se siga filtrando
	public void setNombre (String nombre) {
		if(filtraNombre(nombre)) {
			super.setNombre(nombre);
		}else {
			//comunicaria error
		}
	}
	
	//para filtrarlo y que de si true o no
	public boolean filtraNombre(String nombre) {
		if(nombre.length() > 20 && nombre.length() <= 50) {
			return true;
		}
		return false;
	}
	
	// Para la clase ClienteNacional
	public Cliente() {
		super();
	}
	
	//constructor para Cliente Exportacion
	public Cliente(String nombre, String direccion, String correoElectronico) {
		super();
	}

	public int getNumeroCliente() {
		return numeroCliente;
	}

	public void setNumeroCliente(int numeroCliente) {
		this.numeroCliente = numeroCliente;
	}

	public String getFechaAlta() {
		return fechaAlta;
	}
	
	public void setFechaAlta(String fechaAlta) {
		this.fechaAlta = fechaAlta;
	}
	
	//método de Persona
	@Override
	public String aString() {
		//ejemplo si aString en Persona tuviera cosas
			//String salida = super.aString();
		return "Cliente:" + getNumeroCliente() + "-->" + getNombre(); //+salida
	}
	
	//un ejemplo de casting entre clases para coger aString si no estuviera en Persona
	public void ejemplo(Persona per) {
		Cliente ss = (Cliente) per;
		ss.aString();
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

	/**
	 * Método ver la fecha de alta
	 */
	
	public void verFechaAlta() {
		System.out.println("Visualización fecha alta");
	}
	

}
