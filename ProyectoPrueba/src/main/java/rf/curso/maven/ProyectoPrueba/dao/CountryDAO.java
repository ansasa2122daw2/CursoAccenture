package rf.curso.maven.ProyectoPrueba.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import rf.curso.maven.ProyectoPrueba.dominio.Country;
import rf.curso.maven.ProyectoPrueba.util.OracleJDBC;

/**
 * Clase Country DAO que implementa de la interface Ejecuta ordenes directas
 * 
 * Tiene que tener los querys Conseguir objeto connection
 * 
 * Lee o graba registros
 * 
 * @author andrea.sanclemente
 *
 */

public class CountryDAO implements CountryDAOI {
	private static Connection conn;
	
	private static final Country country = new Country();
	
	public final static String SQL_LEER_COUNTRY = "Select * from countries";
	public final static String SQL_LEER_COUNTRY_POR_ID = "Select * from countries_ass where country_id = ";
	//usando preparedStatement
	public final static String SQL_LEER_COUNTRY_POR_ID2 = "Select * from countries_ass where country_id = ?";
	public final static String SQL_DELETE_COUNTRY_POR_ID = "delete from countries_ass where country_id = ?";
	public final static String SQL_DELETEALL_COUNTRY = "delete * from countries_ass";
	public final static String SQL_UPDATE_COUNTRY_POR_ID = "update countries_ass set country_id = ?, country_name = ?, region_id = ? where country_id = ?";
	
	/**
	 * Constructor
	 * 
	 * @throws SQLException
	 */
	public CountryDAO() throws SQLException {
		// instancias la clase connection
		OracleJDBC ora = new OracleJDBC();
		conn = ora.abrir();
	}

	@Override
	public Country leerUno(String country_id) throws Exception {
		// declarando resultset fuera del try para que lo coja en el finally
		ResultSet rs = null;

		try {
//			Statement stm = conn.createStatement();
//			rs = stm.executeQuery(SQL_LEER_COUNTRY_POR_ID + "'" + country_id + "'");
			//con preparedStatement
			/**
			 * PREPARED STATEMENT CON ? 
			 */
			PreparedStatement ps = conn.prepareStatement(SQL_LEER_COUNTRY_POR_ID2);
			ps.setString(1, country_id);
			rs = ps.executeQuery();

			// llamas al método carga y devuelve solo un country
			rs.next();
			return carga(rs);

		} catch (SQLException e) {
			throw new Exception(SQL_LEER_COUNTRY_POR_ID + " " + e.getMessage());
		}
	}

	@Override
	public List<Country> leerTodos() throws Exception {
		// declarando resultset fuera del try para que lo coja en el finally
		ResultSet rs = null;
		List<Country> salida = new ArrayList<>();
		try {
			Statement stm = conn.createStatement();
			// rs consigue una lista de punteros a registros
			rs = stm.executeQuery(SQL_LEER_COUNTRY);

			/**
			 * While para printar
			 */
			while (rs.next()) {
				// llamas al método carga
				salida.add(carga(rs));
			}

		} catch (SQLException e) {
			throw new Exception(SQL_LEER_COUNTRY + " " + e.getMessage());
		}
		return salida;
	}

	@Override
	public int actualizar(Country country) throws Exception {
		try {
			PreparedStatement ps = conn.prepareStatement(SQL_UPDATE_COUNTRY_POR_ID);
			ps.setString(1, country.getCountry_id());
			ps.setString(2, country.getCountry_name());
			ps.setString(3, country.getRegion_id());
			ps.setString(4, country.getCountry_id());
			System.out.println("Country modificada");
			return ps.executeUpdate();

		} catch (SQLException e) {
			throw new Exception(SQL_UPDATE_COUNTRY_POR_ID + " " + e.getMessage());
		}
	}

	@Override
	public int delete(Country country) throws Exception {
		try {
			PreparedStatement ps = conn.prepareStatement(SQL_DELETEALL_COUNTRY);
			return ps.executeUpdate();

		} catch (SQLException e) {
			throw new Exception(SQL_DELETEALL_COUNTRY + " " + e.getMessage());
		}
	}

	@Override
	public int delete(String country_id) throws Exception {
		try {
			PreparedStatement ps = conn.prepareStatement(SQL_DELETE_COUNTRY_POR_ID);
			ps.setString(1, country_id);
			return ps.executeUpdate();

		} catch (SQLException e) {
			throw new Exception(SQL_DELETE_COUNTRY_POR_ID + " " + e.getMessage());
		}
	}

	@Override
	public Country insert(Country country) {

		return null;
	}

	/**
	 * método para añadir las cosas a Country de la base de datos y para no tener
	 * que repetirlo
	 * 
	 * @throws SQLException
	 */
	public Country carga(ResultSet rs) throws SQLException {
		/**
		 * Declaras el objeto de la clase country Luego con el set para añadir lo de la
		 * base de datos ahí
		 */
		Country ctr = new Country();

		ctr.setCountry_id(rs.getString("country_id"));
		ctr.setCountry_name(rs.getString("country_name"));
		ctr.setRegion_id(rs.getString("region_id"));

		return ctr;
	}

}
