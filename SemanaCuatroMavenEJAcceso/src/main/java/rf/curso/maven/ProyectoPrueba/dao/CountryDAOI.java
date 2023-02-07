package rf.curso.maven.ProyectoPrueba.dao;

import java.util.List;

import rf.curso.maven.ProyectoPrueba.dominio.Country;

/**
 * Interfaz con los métodos DAO
 * @author andrea.sanclemente
 *
 */

public interface CountryDAOI {
	
	//posibilidad de ver uno
	public Country leerUno(String country_id) throws Exception;
	
	//para leer todos
	public List<Country> leerTodos() throws Exception;
	
	//poder actualizar Country (hace update de country) y devuelve las filas afectadas
	public int actualizar(Country country) throws Exception;
	
	//elimina con toda la query pasada
	public int delete(Country country) throws Exception;
	
	//elimina uno
	public int delete(String country_id) throws Exception;
	
	//insert ponemos Country para que te lo devuelva updateado ( por si tienes un autoincremento id)
	public Country insert(Country country);
}
