package ejercicios04Figuras;

public abstract class Formas {
	private int x;
	private int y;
	
	public abstract String adibujar();
	public abstract Integer aArea();
	
	public Formas(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	public Formas() {
		super();
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	
}
