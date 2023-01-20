package ejercicios03Agroalimentaria;

/**
 * Clase Aire hija de Congelados e Productos
 * @author andrea.sanclemente
 *
 */

public class PCAire extends ProductosCongelados {
	private double pNitrogeno;
	private double pOxigeno;
	private double pDioxidoCarbono;
	private double pVaporAgua;
	
	public PCAire(String fechaCaducidad, int numLote, int tempRecomendada, double pNitrogeno, double pOxigeno,
			double pDioxidoCarbono, double pVaporAgua) {
		super(fechaCaducidad, numLote, tempRecomendada);
		this.pNitrogeno = pNitrogeno;
		this.pOxigeno = pOxigeno;
		this.pDioxidoCarbono = pDioxidoCarbono;
		this.pVaporAgua = pVaporAgua;
	}

	public double getpNitrogeno() {
		return pNitrogeno;
	}

	public void setpNitrogeno(int pNitrogeno) {
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
	
	/**
	 * Método de la clase abstracta Productos
	 */
	
	@Override
	public void info() {
		System.out.println("Productos congelados | Congelados Aire -->");
		System.out.println("Fecha caducidad: " + getFechaCaducidad() + " Número lote: " + getNumLote() + " Nitrogeno: " + getpNitrogeno() + "% Oxigeno: " + getpOxigeno() + "% Dioxido carbono: " + " % Vapor de agua: " +getpVaporAgua() );
	}

}
