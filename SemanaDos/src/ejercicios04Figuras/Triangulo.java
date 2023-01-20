package ejercicios04Figuras;

public class Triangulo extends Formas {
	
	public Triangulo(int x, int y) {
		super(x, y);
	}
	
	public Triangulo() {
		super();
	}
	
	@Override
	public String adibujar() {
		return "X: " + getX() + " Y: " + getY();
	}
	
	@Override
	public Integer aArea() {
		return getX() * getY() / 2;
	}
	
	public void dibujarTrian(Formas formas) {
		Triangulo tria = (Triangulo) formas;
		String mensaje = tria.adibujar();
		System.out.println("Dibujar triangulo: " + mensaje);
	}

	public void areaTrian(Formas formas) {
		Triangulo tria = (Triangulo) formas;
		Integer mensaje = tria.aArea();
		System.out.println("Calcular area Triangulo: " + mensaje);
	}
	

}
