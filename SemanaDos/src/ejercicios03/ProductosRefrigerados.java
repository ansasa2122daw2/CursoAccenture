package ejercicios03;

public class ProductosRefrigerados extends Productos {
	private int codigoOrganismo;

	public ProductosRefrigerados(String fechaCaducidad, int numLote, int codigoOrganismo) {
		super(fechaCaducidad, numLote);
		this.setCodigoOrganismo(codigoOrganismo);
	}

	public int getCodigoOrganismo() {
		return codigoOrganismo;
	}

	public void setCodigoOrganismo(int codigoOrganismo) {
		this.codigoOrganismo = codigoOrganismo;
	}
	
	public String aString() {
		return "fechaCaducidad=" + getFechaCaducidad() + ", numLote=" + getNumLote();
	}
	
	public void productosRefrigerados(Productos pro) {
		ProductosRefrigerados cong = (ProductosRefrigerados) pro;
		String mensaje = cong.aString();
		System.out.println(mensaje + " codigo organismo supervisor: " + getCodigoOrganismo());
	}

}
