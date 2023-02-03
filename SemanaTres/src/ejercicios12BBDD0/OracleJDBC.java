package ejercicios12BBDD0;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class OracleJDBC {
	private static Connection conn;
	public final static String JDBC_DRIVER = "oracle.jdbc.driver.OracleDriver";
	public final static String DATABASE = "";
	public final static String URL = "jdbc:oracle:thin:@95.17.8.252:1521:xe";
	public final static String USUARIO = "hr";
	public final static String PASSWORD = "hr";
	
	// crear la sql
	public final static String SQL_LEER_TODOS = "Select * from Employees";
	public final static String SQL_LEER_COUNTRY = "Select * from countries";

	public static void main(String[] args) throws SQLException {
		System.out.println("----- ORACLE JDBC Connection Testing -----");

		// Carga driver
		try {
			Class.forName(JDBC_DRIVER);
		} catch (ClassNotFoundException e) {
			System.out.println("Where is your Oracle JDBC Driver?");
			e.printStackTrace();
			return;
		}
		System.out.println("Oracle JDBC Driver Registered!");

		// Consigue conexión
		conn = null;
		try {
			conn = DriverManager.getConnection(URL + DATABASE, USUARIO, PASSWORD);
		} catch (SQLException e) {
			System.out.println("Connection Failed! Check output console");
			e.printStackTrace();
			return;
		}
		
		/**
		 * Llamando al método
		 */
		lecturaCountry();
		
		/**
		 * Lectura del método
		 */
		lecturaEmployees();
		
		//
		if (conn != null) {
			System.out.println("You mae it, take control your database now");
			conn.close();
		} else {
			System.out.println("Failed to make connection!");
		}
	}

	/**
	 * metodo Statement creacion
	 * @throws SQLException
	 */
	public static void lecturaEmployees() throws SQLException {
		//declarando resultset fuera del try para que lo coja en el finally
		ResultSet rs = null;
		//haciendo una excepcion con try catch finally
		try {
			Statement stm = conn.createStatement();
			rs = stm.executeQuery(SQL_LEER_TODOS);
		
		//lo que printara
			while(rs.next()) {
				System.out.println(rs.getString("First_name") + " " + rs.getString("last_name"));
			}
		}catch(SQLException e) {
			System.out.println(SQL_LEER_TODOS + " " + e.getMessage());
		}finally {
			if( rs!=null ) {
				rs.close();
			}
		}
		
	}
	
	/**
	 * metodo Statement creacion de countries y set de la base de datos a la clase
	 * @throws SQLException
	 */
	public static void lecturaCountry() throws SQLException {
		//declarando resultset fuera del try para que lo coja en el finally
		ResultSet rs = null;
		try {
			Statement stm = conn.createStatement();
			rs = stm.executeQuery(SQL_LEER_COUNTRY);
		
		/**
		 * While para printar
		 */
			while(rs.next()) {
				/**
				 * Declaras el objeto de la clase country
				 * Luego con el set para añadir lo de la base de datos ahí
				 */
				Country ctr = new Country();

				ctr.setCountry_id(rs.getString("country_id"));
				ctr.setCuntry_name(rs.getString("country_name"));
				ctr.setRegion_id(rs.getString("region_id"));
				listarCtr(ctr);
			}
			
		}catch(SQLException e) {
			System.out.println(SQL_LEER_COUNTRY + " " + e.getMessage());
		}finally {
			if( rs!=null ) {
				rs.close();
			}
		}
		
	}
	
	public static void listarCtr(Country ctr) {
		System.out.println(ctr.getCountry_id());
	}

}
