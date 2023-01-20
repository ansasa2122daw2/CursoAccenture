package ejercicios04Figuras;

import ejercicios03.ProductosCongelados;

public class Rectangulo extends Formas{
	private int area;
	
	public Rectangulo(int x, int y, int area) {
		super(x, y);
		this.area = area;
	}
	
	public Rectangulo() {
		super();
	}

	public int getArea() {
		return area;
	}

	public void setArea(int area) {
		this.area = area;
	}
	
	@Override
	public String adibujar() {
		return "X: " + getX() + " Y: " + getY();
	}
	
	@Override
	public Integer aArea() {
		return getX() * getY();
	}
	
	public void dibujarRect(Formas formas) {
		Rectangulo rect = (Rectangulo) formas;
		String mensaje = rect.adibujar();
		System.out.println("Dibujar rectangulo: " + mensaje);
	}

	public void areaRect(Formas formas) {
		Rectangulo rect = (Rectangulo) formas;
		Integer mensaje = rect.aArea();
		System.out.println("Calcular area rectangulo: " + mensaje);
	}
	
	

}
