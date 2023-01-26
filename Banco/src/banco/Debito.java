package banco;

import java.time.LocalDate;
import java.util.Date;

public class Debito extends Tarjeta {

	public Debito(LocalDate localDate, String mNumero, String mTitular) {
		super(localDate, mNumero, mTitular);
	
	}

	public Debito() {
	}

	@Override
	public double getSaldo() {
		return mCuentaAsociada.getSaldo();
	}

	@Override
	public void ingresar(double x) {	
		this.mCuentaAsociada.ingresar(x);

	}

	@Override
	public void pagoEnEstablecimiento(String datos, double x) {
		this.mCuentaAsociada.retirar(datos, x);;	
	}

	@Override
	public void retirar(double x) {
		this.mCuentaAsociada.retirar(x);

	}

	@Override
	public String toString() {
		return mFechaDeCaducidad + " ";
	}
	

}
