package rf.curso.S4_MiniApi2.controller;

import java.sql.SQLException;

import java.util.List;

import rf.curso.S4_MiniApi2.dao.CountryDao;
import rf.curso.S4_MiniApi2.modelos.Country;


/**
 * Clase controller que lee y hace lo que tiene que hacer
 * Dialoga con la clase DAO
 * @author andrea.sanclemente
 *
 */

public class CountryController {
	//lamamos a la interface
	CountryDao cDao;
	
	/**
	 * constructor donde declaramos cDao
	 * @throws SQLException 
	 */
	public CountryController() throws SQLException {
		cDao = new CountryDao();
	}
	
	/**
	 * método que leerá todos de la clase CountryDAO
	 * @throws Exception 
	 */
	public List<Country> leerTodos() throws Exception {
		return cDao.obtenerCountrys();
		
	}
	
	/**
	 * Métdo apra leer uno que le pasas el string de country id
	 * @param country_id
	 * @return
	 * @throws Exception
	 */
	
	public Country leerUno(String country_id) throws Exception {
		return cDao.buscar(country_id);
		
	}
	
	public void eliminar(String country_id) throws Exception {
		cDao.eliminar(country_id);
	}
	
	public void eliminar(Country country) throws Exception {
		cDao.eliminar(country);
	}
	
	public void actualizar(Country country) throws Exception {
		cDao.editar(country);
	}
}
