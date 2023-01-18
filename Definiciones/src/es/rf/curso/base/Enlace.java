package es.rf.curso.base;
import java.sql.Time;
import java.time.LocalTime;

public class Enlace {
	
	public String url;
	public LocalTime hora;
	public int indice;
	static int contador =0; //si esto fuera public se quedaria en uno si cambias de objeto
	
	//constructor
	Enlace(){
		indice=contador++;
	}
	
	//crear metodo para pasar el dato de Definiciones
	public void modificacion() {
		
		System.out.println(this);
		
		
//		//Objetos 
//		Definiciones defi = new Definiciones();
//		Definiciones defi2 = new Definiciones();
//		
//		//ejemplo nombre no estatico luego ir a main 
//		defi.nombre="Esto es defi";
//		defi2.nombre="Esto es defi2";
//		
//		System.out.println("defi= " + defi.nombre);
//		System.out.println("defi2= " + defi2.nombre);
//		
//		//ejemplo descripcion estatico
//		defi.descripcion="Esto es descripcion";
//		defi2.descripcion="Esto es descripcion2";
//		
//		System.out.println("descripcion= " + defi.descripcion);
//		System.out.println("descripcion2= " + defi2.descripcion);
//		
//		//campo publico
//		defi.valor="Clase Enlace!";
//		//esto no funcionaria (defi.importe=12)
//		//campo privado
//		defi.setImporte(7);
		
	}

	@Override
	public String toString() {
		return "Enlace [url=" + url + ", hora=" + hora + ", indice=" + indice + "]";
	}
	
}
