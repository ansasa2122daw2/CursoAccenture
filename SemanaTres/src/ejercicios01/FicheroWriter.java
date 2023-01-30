package ejercicios01;

import java.io.FileWriter;
import java.io.PrintWriter;

public class FicheroWriter {

	public static void main(String[] args) {
		FileWriter fichero = null;
		
		PrintWriter pw = null;
		
		try {
			fichero = new FileWriter("C:\\aCursoAccenture\\cursowk\\TerceraSemana\\src\\ejercicios01\\prueba.txt");
			pw = new PrintWriter(fichero);
			
			for (int i=0; i <10; i++) 
				pw.println("Línea " + i);
			}catch(Exception e ){
			e.printStackTrace();
			
		}finally {
			try {
				if(null !=fichero)
					fichero.close();
			}catch(Exception e2) {
				e2.printStackTrace();
			}
		}
	}
}


