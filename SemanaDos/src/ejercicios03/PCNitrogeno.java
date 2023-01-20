package ejercicios03;

public class PCNitrogeno extends ProductosCongelados {
	private int metodo;
	private int segundos;
	
	public PCNitrogeno(String fechaCaducidad, int numLote, int congelacionReco, int metodo, int segundos) {
		super(fechaCaducidad, numLote, congelacionReco);
		this.metodo = metodo;
		this.segundos = segundos;
	}

	public int getMetodo() {
		return metodo;
	}

	public void setMetodo(int metodo) {
		this.metodo = metodo;
	}

	public int getSegundos() {
		return segundos;
	}

	public void setSegundos(int segundos) {
		this.segundos = segundos;
	}
	
	public void congelacionEmpleado() {
		//
	}
	
	public void exposicionNitrogenoSeg() {
		
	}
	
}
