package ejercicios04Figuras;

/**
 * Clase Main donde llamamos a las otras clases
 * @author andrea.sanclemente
 *
 */

public class MainFiguras {

	public static void main(String[] args) {
		Rectangulo rect = new Rectangulo(2, 9);
		
		rect.dibujar();
		rect.calcularArea();
		
		Triangulo trian = new Triangulo(20,24,10);
		
		trian.dibujar();
		trian.calcularArea();
		
		Circulo circ = new Circulo(10,15,5);
		
		circ.dibujar();
		circ.calcularArea();

		/** 
		 * Clase Punto cambiado con Figuras
		 */
		Formas form = new Rectangulo();
		Punto punto = new Punto(6,3);
		form.setPunt(punto);
		form.getPunt().inverse(6,6);
		

	}
	
	

}
