package ejercicios06Automovil;

public class Coche extends Automovil implements Comportamiento {
	private String modelo;
	private int numPuertas;
	private String color;
	private boolean situacion4x4;

	public Coche(int numMarchas, int velMaxima, int numChasis, int numRuedas, int numPuertas, String color, String modelo) {
		super(numMarchas, velMaxima, numChasis, numRuedas);
		this.numPuertas = numPuertas;
		this.color = color;
		this.modelo = modelo;
	}
	
	public int getNumPuertas() {
		return numPuertas;
	}

	public void setNumPuertas(int numPuertas) {
		this.numPuertas = numPuertas;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	/**
	 * Método de la clase padre
	 */
	@Override
	public void modelos() {
		System.out.println(getModelo());
	}

	@Override
	public String toString() {
		return super.toString() + "Coche [numPuertas=" + numPuertas + ", color=" + color + "]";
	}
	
	/**
	 * Método de la interface Comportamiento
	 */

	@Override
	public void activarReductora(boolean activar) {
		situacion4x4 = activar;
		System.out.println(situacion4x4);
	}
	
	

}
