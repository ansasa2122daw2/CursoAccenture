package ejercicios06Automovil;

public class Camion extends Automovil {
	private int pesoMax;
	private double precio;
	private String modelo;
	
	public Camion(int numMarchas, int velMaxima, int numChasis, int numRuedas, int pesoMax,
			double precio, String modelo) {
		super(numMarchas, velMaxima, numChasis, numRuedas);
		this.pesoMax = pesoMax;
		this.precio = precio;
		this.modelo = modelo;
	}

	public int getPesoMax() {
		return pesoMax;
	}

	public void setPesoMax(int pesoMax) {
		this.pesoMax = pesoMax;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public void modelos() {
		System.out.println(getModelo());
	}

	@Override
	public String toString() {
		return super.toString() + "Camion [pesoMax=" + pesoMax + ", precio=" + precio + "]";
	}
	
	

}
