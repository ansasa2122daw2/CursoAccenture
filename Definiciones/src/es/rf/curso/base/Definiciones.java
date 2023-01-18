package es.rf.curso.base;

import java.time.LocalTime;

/**
 * 
 * @author andrea.sanclemente
 * Prueba como definir los campos
 */

public class Definiciones {
//	//DEFINIR ATRIBUTOS AQUI FUNCIONA PARA TODA LA CLASE 
//	//variables literales:
//	private static boolean seguro = false;
//	private static int importe = 0;
//	private static double cantidad = 0d; //indicas que el cero es double con d
//	
//	//ejemplos Enlace estatico, primero estatico
//	public static String descripcion = "\"Hola \nMundo\""; //doble comilla 
//	//ejemplo no estatico
//	public String nombre = "";
//	
//	
//	//Definicion de una constante SE PONE FINAL
//	public final String CVALOR="";
//	
//	//para la clase Enlace 
//	public String valor = "";
//	
//	//para hacer que un private pase a public
//	public int getImporte() {
//		return importe;
//	}
//	
//	public void setImporte(int imp) {
//		if (imp >= 0) {
//			importe = imp;
//		}
//			
//	}
	
	/**
	 * Lanzamiento por consola
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//DEFINES ATRIBUTOS AQUÍ SOLO LOS VERAN ESTE METODO
//		System.out.println(descripcion);
		
		//Enlace inicializacion
		Enlace ss = new Enlace();
		
		ss.url="http://ejemplo";
		ss.hora=LocalTime.now();
		ss.modificacion();

		Enlace ss1 = new Enlace();
		
		ss1.url="http://ejemplo";
		ss1.hora=LocalTime.now();
		ss1.modificacion();

		
	}
	
//	public static void valores() {
//		importe = 123;
//		cantidad = 500.222; //decimales con .
//		char separador ='/'; //caracteres comilla simpre ''
//	}

}