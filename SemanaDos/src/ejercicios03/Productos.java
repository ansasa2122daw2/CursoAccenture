package ejercicios03;

public abstract class Productos {
	private String fechaCaducidad;
	private int numLote;
	
	public abstract String aString();
	
	public Productos(String fechaCaducidad, int numLote) {
		super();
		this.fechaCaducidad = fechaCaducidad;
		this.numLote = numLote;
	}
	
	public Productos() {
		super();
	}
	
	public String getFechaCaducidad() {
		return fechaCaducidad;
	}
	
	public void setFechaCaducidad(String fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}
	
	public int getNumLote() {
		return numLote;
	}
	
	public void setNumLote(int numLote) {
		this.numLote = numLote;
	}
	
}
