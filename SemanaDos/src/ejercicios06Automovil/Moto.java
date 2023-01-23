package ejercicios06Automovil;

public class Moto extends Automovil {
	private int deposito;
	private String matricula;

	public Moto(int numMarchas, int velMaxima, int numChasis, int numRuedas, int deposito, String matricula) {
		super(numMarchas, velMaxima, numChasis, numRuedas);
		this.deposito = deposito;
	}

	public int getDeposito() {
		return deposito;
	}

	public void setDeposito(int deposito) {
		this.deposito = deposito;
	}
	
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public void modelos() {
		System.out.println(getMatricula());
	}

	@Override
	public String toString() {
		return super.toString() + "Moto [deposito=" + deposito + "]";
	}

}
