package banco;

import java.time.LocalDate;
import java.util.Date;

public class Debito extends Tarjeta {

	public Debito(LocalDate localDate, String mNumero, String mTitular) {
		super(localDate, mNumero, mTitular);
	
	}

	@Override
	public double getSaldo() {
		System.out.println("Mostrar tarjeta DEBITO -> " + toString());
		return mCuentaAsociada.getSaldo();
	}

	@Override
	public void ingresar(double x){
		System.out.println("Ingresar tarjeta DEBITO -> " + toString());
		this.mCuentaAsociada.ingresar(x);

	}

	@Override
	public void pagoEnEstablecimiento(String datos, double x) {
		System.out.println("Compras en: " + datos + " " + x);

	}

	@Override
	public void retirar(double x) {
		System.out.println("Retirar tarjeta DEBITO -> " + toString());
		this.mCuentaAsociada.retirar(x);

	}

	@Override
	public String toString() {
		return "mFechaDeCaducidad=" + mFechaDeCaducidad + ", mNumero="
				+ mNumero + ", mTitular=" + mTitular + "]";
	}
	

}
