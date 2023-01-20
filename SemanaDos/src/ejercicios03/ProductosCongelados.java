package ejercicios03;

public class ProductosCongelados extends Productos {
	private int congelacionReco;

	public ProductosCongelados(String fechaCaducidad, int numLote, int congelacionReco) {
		super(fechaCaducidad, numLote);
		this.congelacionReco = congelacionReco;
	}
	
	public ProductosCongelados() {
	}

	public int getCongelacionReco() {
		return congelacionReco;
	}

	public void setCongelacionReco(int congelacionReco) {
		this.congelacionReco = congelacionReco;
	}

	@Override
	public String aString() {
		return "fechaCaducidad=" + getFechaCaducidad() + ", numLote=" + getNumLote() + " ProductosCongelados temperatura=" + getCongelacionReco();
	}
	
	public void productosCongelados(Productos pro) {
		ProductosCongelados cong = (ProductosCongelados) pro;
		String mensaje = cong.aString();
		System.out.println(mensaje + " temperatura: " + getCongelacionReco());
	}

}
