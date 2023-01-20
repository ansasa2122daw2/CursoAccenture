package ejercicios03;

public class PCAgua extends ProductosCongelados {
	private int salinidad;

	public PCAgua(String fechaCaducidad, int numLote, int congelacionReco, int salinidad) {
		super(fechaCaducidad, numLote, congelacionReco);
		this.salinidad = salinidad;
	}

	public PCAgua() {
		super();
	}

	public int getSalinidad() {
		return salinidad;
	}

	public void setSalinidad(int salinidad) {
		this.salinidad = salinidad;
	}
	
	public void salinidad() {
		
	}

	
	public void salinidad(Productos pro) {
		ProductosCongelados cong = (ProductosCongelados) pro;
		String mensaje = cong.aString();
		System.out.println(mensaje + " salinidad: " + salinidad);
	}

}
