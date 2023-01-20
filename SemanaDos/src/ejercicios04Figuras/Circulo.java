package ejercicios04Figuras;

public class Circulo extends Formas{
	private int radio;

	public Circulo(int x, int y, int radio) {
		super(x, y);
		this.radio = radio;
	}
	
	public Circulo() {
	}

	public int getRadio() {
		return radio;
	}

	public void setRadio(int radio) {
		this.radio = radio;
	}
	
	@Override
	public String adibujar() {
		return "X: " + getX() + " Y: " + getY();
	}
	
	@Override
	public Integer aArea() {
		return "";
	}
	
	public void dibujarCirc(Formas formas) {
		Triangulo tria = (Triangulo) formas;
		String mensaje = tria.adibujar();
		System.out.println("Dibujar triangulo: " + mensaje);
	}

	public void areaCirc(int radio) {
		double area = Math.PI * (radio * radio);
		System.out.println("Calcular area Triangulo: " + area);
	}

}
