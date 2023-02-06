package rf.curso.maven.ProyectoPrueba.controller;

import java.sql.SQLException;
import java.util.List;

import rf.curso.maven.ProyectoPrueba.dao.CountryDAO;
import rf.curso.maven.ProyectoPrueba.dominio.Country;

/**
 * Clase controller que lee y hace lo que tiene que hacer
 * Dialoga con la clase DAO
 * @author andrea.sanclemente
 *
 */

public class CountryController {
	//lamamos
	CountryDAO cDao;
	
	/**
	 * constructor donde declaramos cDao
	 * @throws SQLException 
	 */
	public CountryController() throws SQLException {
		cDao = new CountryDAO();
	}
	
	/**
	 * método que leerá todos de la clase CountryDAO
	 * @throws Exception 
	 */
	public List<Country> leerTodos() throws Exception {
		return cDao.leerTodos();
		
	}
	
	/**
	 * Métdo apra leer uno que le pasas el string de country id
	 * @param country_id
	 * @return
	 * @throws Exception
	 */
	
	public Country leerUno(String country_id) throws Exception {
		return cDao.leerUno(country_id);
		
	}
	
	public int delete(String country_id) throws Exception {
		return cDao.delete(country_id);
	}
	
	public int delete(Country country) throws Exception {
		return cDao.delete(country);
	}
	
	public int actualizar(Country country) throws Exception {
		return cDao.actualizar(country);
	}
}
