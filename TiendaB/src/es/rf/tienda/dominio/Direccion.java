package es.rf.tienda.dominio;

import es.rf.tienda.exception.DomainException;
import es.rf.tienda.util.Validator;

/**
 * Nombre: Direccion
 * Descipcion: Clase Direccion
 * @author andrea.sanclemente
 *
 */

public class Direccion {
	private String dir_nombre;		//Nombre
	private String dir_direccion;	//Direccion
	private String dir_poblacion;	//Poblacion
	private String cPostal;			//Codigo postal
	private String dir_provincia;	//Provincia
	private String dir_pais;		//Pais
	private String dir_correoE;		//Correo electronico
	
	/**
	 * Constructor
	 */
	
	public Direccion() {
		super();
	}

	/**
	 * Getters y setters
	 * @return
	 */
	
	public String getDir_nombre() {
		return dir_nombre;
	}

	public void setDir_nombre(String dir_nombre) throws DomainException {
		if(Validator.isAlfanumeric(dir_nombre)) {
			this.dir_nombre = dir_nombre;
		}else throw new DomainException("El nombre no es correcto");
		
	}

	public String getDir_direccion() {
		return dir_direccion;
	}

	public void setDir_direccion(String dir_direccion) throws DomainException {
		if(Validator.isAlfanumeric(dir_direccion)) {
			this.dir_direccion = dir_direccion;
		}else throw new DomainException("La dirreción no es correcta");
		
	}

	public String getDir_poblacion() {
		return dir_poblacion;
	}

	public void setDir_poblacion(String dir_poblacion) throws DomainException {
		if(Validator.isAlfanumeric(dir_poblacion)) {
			this.dir_poblacion = dir_poblacion;
		}else throw new DomainException("La poblacion no es correcta");
		
	}

	public String getcPostal() {
		return cPostal;
	}

	public void setcPostal(String cPostal) throws DomainException {
		if(Validator.isAlfanumeric(cPostal)) {
			this.cPostal = cPostal;
		}else throw new DomainException("El código postal es incorrecto");
		
	}

	public String getDir_provincia() {
		return dir_provincia;
	}

	public void setDir_provincia(String dir_provincia) throws DomainException {
		if(Validator.isAlfanumeric(dir_provincia)) {
			this.dir_provincia = dir_provincia;
		}else throw new DomainException("La provincia es incorrecta");
		
	}

	public String getDir_pais() {
		return dir_pais;
	}

	public void setDir_pais(String dir_pais) throws DomainException {
		if(Validator.isAlfanumeric(dir_pais)) {
			this.dir_pais = dir_pais;
		}else throw new DomainException("El pais es incorrecto");
		
	}

	public String getDir_correoE() {
		return dir_correoE;
	}

	public void setDir_correoE(String dir_correoE) throws DomainException {
		if(Validator.isEmailValido(dir_correoE)) {
			this.dir_correoE = dir_correoE;
		}else throw new DomainException("El correo es incorrecto");
		
	}

	@Override
	public String toString() {
		return "Direccion [dir_nombre=" + dir_nombre + ", dir_direccion=" + dir_direccion + ", dir_poblacion="
				+ dir_poblacion + ", cPostal=" + cPostal + ", dir_provincia=" + dir_provincia + ", dir_pais=" + dir_pais
				+ ", dir_correoE=" + dir_correoE + "]";
	}	
		
}
