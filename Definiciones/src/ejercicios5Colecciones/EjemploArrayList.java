package ejercicios5Colecciones;
import java.util.ArrayList;
import java.util.List;

import java.util.*;

/**
 * crar un list con unos elementos y volcarlos para ver que funciona
 * como encontrar un elemento concreto de una lista
 * @author andrea.sanclemente
 *
 */

public class EjemploArrayList {

	public static void main(String[] args) {
		List<String> ejemplo = new ArrayList<String>();
		 ejemplo.add("valor");
		 ejemplo.add("otro");
		 if (ejemplo.contains("valor")) {
			 System.out.println("Contiene la palabra valor");
		 }
		 else {
			 System.out.println("No tiene la palabra valor");
		 }
		 
		 //Muestra el array
		 System.out.println(ejemplo);
		 //clase String tambien tiene indexOf
		 System.out.println(ejemplo.indexOf("valor"));
		 

		 for (String dato : ejemplo) {
			 System.out.println("FOR EACH -" + dato);
		 }
		 
		 //Para mostrar los valores de la lista
		 for (int i= 0; i <ejemplo.size(); i++) {
			 System.out.println("FOR GET -" + ejemplo.get(i));
		 }
		 
		 //Ejemplo iterator // it.hasNext es el incremento como el i++
		 for (Iterator<String> it = ejemplo.iterator(); it.hasNext();) {
			 System.out.println("ITERATOR - Otra forma de hacer el recorrido: " + it.next());
		 }

	}

}
