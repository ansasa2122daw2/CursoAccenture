package ejercicios04Figuras;

public class MainFiguras {

	public static void main(String[] args) {
		Rectangulo rect = new Rectangulo();
		
		rect.setX(25);
		rect.setY(15);
		
		rect.dibujarRect(rect);
		rect.areaRect(rect);
		
		Triangulo trian = new Triangulo();
		
		trian.setX(45);
		trian.setY(15);
		
		trian.dibujarTrian(trian);
		trian.areaTrian(trian);
		
		Circulo circ = new Circulo();
		
		circ.setRadio(5);
		
		circ.areaCirc(circ);

	}

}
