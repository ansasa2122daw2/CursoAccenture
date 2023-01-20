package ejercicios03;

public class ProductosFrescos extends Productos{
	private String fechaEnvasado;
	private String paisOrigen;
	
	public ProductosFrescos() {
	}

	public ProductosFrescos(String fechaCaducidad, int numLote, String fechaEnvasado, String paisOrigen) {
		super(fechaCaducidad, numLote);
		this.fechaEnvasado = fechaEnvasado;
		this.paisOrigen = paisOrigen;
	}

	public String getFechaEnvasado() {
		return fechaEnvasado;
	}

	public void setFechaEnvasado(String fechaEnvasado) {
		this.fechaEnvasado = fechaEnvasado;
	}

	public String getPaisOrigen() {
		return paisOrigen;
	}

	public void setPaisOrigen(String paisOrigen) {
		this.paisOrigen = paisOrigen;
	}
	
	public String aString() {
		return "fechaCaducidad=" + getFechaCaducidad() + ", numLote=" + getNumLote();
	}
	
	public void productosFrescos(Productos pro) {
		ProductosFrescos cong = (ProductosFrescos) pro;
		String mensaje = cong.aString();
		System.out.println(mensaje + " fechaEnvasado: " + getFechaEnvasado() + ", paisOrigen: " + getPaisOrigen());
	}

}
