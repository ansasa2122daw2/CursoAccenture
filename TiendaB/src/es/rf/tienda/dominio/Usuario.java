package es.rf.tienda.dominio;

import java.time.LocalDate;
import java.util.List;

public class Usuario {
	private int id_usuario;			
	private String user_nombre;
	private String user_email;
	private String user_pass;
	private int id_tipo; //REVISAR
	private String user_dni;
	private LocalDate user_fecAlta;
	private LocalDate user_fecConfirmacion;
	private List<Direccion> user_pago; //REVISAR
	private List<Direccion> user_envio; //REVISAR
	
	/**
	 * Constructor
	 */
	
	public Usuario() {
		super();
	}
	
	
	
}
