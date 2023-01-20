package ejercicios02;

/**
 * Clase Cliente Exportacion que es hijo de cliente con nombre, direccion y correoElectronico
 * @author andrea.sanclemente
 *
 */

public class ClienteExportacion extends Cliente{
	
	private String VAT;

	public ClienteExportacion(String nombre, String direccion, String correoElectronico, String VAT) {
		super();
		this.setNombre(nombre);
		this.setDireccion(direccion);
		this.setCorreoElectronico(correoElectronico);
		this.setVAT(VAT);
	}

	public String getVAT() {
		return VAT;
	}

	public void setVAT(String vAT) {
		this.VAT = vAT;
	}
	

}
