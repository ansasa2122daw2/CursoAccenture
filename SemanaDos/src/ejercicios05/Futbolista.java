package ejercicios05;

public class Futbolista extends Equipo {
	private int dorsal;
	private String demarcacion;
	
	public Futbolista(int id, String nombre, String apellidos, int edad, int dorsal, String demarcacion) {
		super(id, nombre, apellidos, edad);
		this.dorsal = dorsal;
		this.demarcacion = demarcacion;
	}
	
	public int getDorsal() {
		return dorsal;
	}

	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}

	public String getDemarcacion() {
		return demarcacion;
	}

	public void setDemarcacion(String demarcacion) {
		this.demarcacion = demarcacion;
	}

	@Override
	public void concentrarse() {
		// TODO Auto-generated method stub
	}

	@Override
	public void viajar() {
		// TODO Auto-generated method stub
	}
	
	public void jugarPartido() {
		
	}
	
	public void entrenar() {
		
	}

}
