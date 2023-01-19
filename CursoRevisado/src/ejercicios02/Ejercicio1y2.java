package ejercicios02;

/**
 * Ejercicio comprobar error y explicar modificacion
 * @author andrea.sanclemente
 *
 */

public class Ejercicio1y2 {

	public static void main(String[] args) {
		 int $nombre;
		 int pasado; //pasado no se escribía asi
		 int alcance; //error en alcance porque no tiene ;
		 
		 int _contador;
		 _contador=25;
		 
		 $nombre=_contador;
		 pasado=_contador; 

		 System.out.println($nombre + " / " + _contador);

	}

}
