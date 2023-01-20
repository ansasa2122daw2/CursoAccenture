package ejercicios03;

import ejercicios02.Cliente;
import ejercicios02.Persona;

public class PCAire extends ProductosCongelados {
	private double pNitrogeno;
	private double pOxigeno;
	private double pDioxidoCarbono;
	private double pVaporAgua;
	
	public PCAire(String fechaCaducidad, int numLote, int congelacionReco, double pNitrogeno, double pOxigeno,
			double pDioxidoCarbono, double pVaporAgua) {
		super(fechaCaducidad, numLote, congelacionReco);
		this.setpNitrogeno(pNitrogeno);
		this.setpOxigeno(pOxigeno);
		this.setpDioxidoCarbono(pDioxidoCarbono);
		this.setpVaporAgua(pVaporAgua);
	}
	

	public PCAire() {
		super();
	}


	public double getpNitrogeno() {
		return pNitrogeno;
	}

	public void setpNitrogeno(double pNitrogeno) {
		this.pNitrogeno = pNitrogeno;
	}

	public double getpOxigeno() {
		return pOxigeno;
	}

	public void setpOxigeno(double pOxigeno) {
		this.pOxigeno = pOxigeno;
	}

	public double getpDioxidoCarbono() {
		return pDioxidoCarbono;
	}

	public void setpDioxidoCarbono(double pDioxidoCarbono) {
		this.pDioxidoCarbono = pDioxidoCarbono;
	}

	public double getpVaporAgua() {
		return pVaporAgua;
	}

	public void setpVaporAgua(double pVaporAgua) {
		this.pVaporAgua = pVaporAgua;
	}
	
	public void composicionAireCongelado(Productos pro) {
		ProductosCongelados cong = (ProductosCongelados) pro;
		String mensaje = cong.aString();
		System.out.println(mensaje + " " + pNitrogeno + "% nitrogeno, " + pOxigeno + "% oxigeno, " + pDioxidoCarbono + "% dioxido de carbono, " + pVaporAgua + "% vapor de agua.");
	}

}
