package ejercicios02;

/**
 * Clase Cliente Nacional que es hijo de cliente con solo NIF
 * @author andrea.sanclemente
 *
 */

public class ClienteNacional extends Cliente{
	private String NIF;
	
	public ClienteNacional(String NIF) {
		super();
		this.setNIF(NIF);
	}

	public String getNIF() {
		return NIF;
	}

	public void setNIF(String NIF) {
		this.NIF = NIF;
	}

}
