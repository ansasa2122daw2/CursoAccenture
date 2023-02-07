package rf.curso.S4_MiniApi2;

import java.util.List;

import rf.curso.S4_MiniApi2.controller.CountryController;
import rf.curso.S4_MiniApi2.modelos.Country;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception
    {
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
		cc.actualizar(count);
		System.out.println(cc.leerUno("ZW"));
		
		System.out.println("---------- Eliminar uno -----------");
		cc.eliminar("AR");

		
	}
	
	public static void listarCtr(List<Country> ctr) {
		ctr.stream().forEach(System.out::println);
	}

}
