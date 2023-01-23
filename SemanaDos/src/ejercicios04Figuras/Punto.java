package ejercicios04Figuras;

public class Punto{
	private int x;
	private int y;
	
	public void inverse(int x, int y) {
		int temp = x;
		x=y;
		y=temp;
		System.out.println("Cambiado " + x + " "+ y);
	}
	
	
	
	public Punto(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public Punto() {
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
