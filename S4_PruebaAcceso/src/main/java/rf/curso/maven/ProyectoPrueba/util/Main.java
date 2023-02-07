package rf.curso.maven.ProyectoPrueba.util;

import java.util.List;

import rf.curso.maven.ProyectoPrueba.controller.CountryController;
import rf.curso.maven.ProyectoPrueba.dominio.Country;

/**
 * Clase Main que llama al controlador
 * @author andrea.sanclemente
 *
 */

public class Main {

	public static void main(String[] args) throws Exception {
		
		CountryController cc = new CountryController();

		//para leer todos
		List<Country> ll = cc.leerTodos();
		listarCtr(ll);
		
		System.out.println("---------- Leer uno -----------");
		//para leer uno y le pasas con comillas cual
		System.out.println(cc.leerUno("AR"));
		
		System.out.println("---------- Updatear uno -----------");
		Country count = cc.leerUno("ZW");
		count.setCountry_name("ZimbawUPDATE");
		System.out.println(cc.actualizar(count));
		System.out.println(cc.leerUno("ZW"));
		
		System.out.println("---------- Eliminar uno -----------");
		System.out.println(cc.delete("AU"));




		
	}
	
	public static void listarCtr(List<Country> ctr) {
		ctr.stream().forEach(System.out::println);
	}

}
