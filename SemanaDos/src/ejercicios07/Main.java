package ejercicios07;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


public class Main {

	public static void main(String[] args) {
			
		Alumno alum = new Alumno("cod1", "Mariola", 14, "932661070", 1);
		alum.setAsignatura("Mates");
		alum.setAsignatura("Geografia");
		alum.setAsignatura("Música");
	
		alum.mostrar();
		
		Profesor pro = new Profesor("cod2", "Montse", 30, "932661070", 1200, "12/12/2008");
		
		pro.mostrar();
	}

}
