package ejercicios06Automovil;

public abstract class Automovil implements ABD{
	private int numMarchas;
	private int velMaxima;
	private int numChasis;
	private int numRuedas;
	
	public Automovil(int numMarchas, int velMaxima, int numChasis, int numRuedas) {
		super();
		this.numMarchas = numMarchas;
		this.velMaxima = velMaxima;
		this.numChasis = numChasis;
		this.numRuedas = numRuedas;
		
		//acceso, instancias el método y mandas todo el objeto del constructor
		AccesoABD dao = new AccesoABD();
		dao.accesoGrabacion(this);
		
	}
	
	public Automovil() {
		super();
	}

	public int getNumMarchas() {
		return numMarchas;
	}

	public void setNumMarchas(int numMarchas) {
		this.numMarchas = numMarchas;
	}

	public int getVelMaxima() {
		return velMaxima;
	}

	public void setVelMaxima(int velMaxima) {
		this.velMaxima = velMaxima;
	}

	public int getNumChasis() {
		return numChasis;
	}

	public void setNumChasis(int numChasis) {
		this.numChasis = numChasis;
	}

	public int getNumRuedas() {
		return numRuedas;
	}

	public void setNumRuedas(int numRuedas) {
		this.numRuedas = numRuedas;
	}
	
	public abstract void modelos();

	@Override
	public String toString() {
		return "Automovil [numMarchas=" + numMarchas + ", velMaxima=" + velMaxima + ", numChasis=" + numChasis
				+ ", numRuedas=" + numRuedas + "]";
	}

	@Override
	public void leer() {
		//Convierte SQL a dominio
	}

	@Override
	public void grabar() {
		//Convierte dominio a SQL
		
	}
	
	

}
