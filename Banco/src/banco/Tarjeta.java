package banco;

import java.time.LocalDate;
import java.util.Date;

public abstract class Tarjeta {
	protected Cuenta mCuentaAsociada;
	protected LocalDate mFechaDeCaducidad;
	protected String mNumero;
	protected String mTitular;
	
	public Tarjeta(LocalDate mFechaDeCaducidad, String mNumero, String mTitular) {
		super();
		this.mFechaDeCaducidad = mFechaDeCaducidad;
		this.mNumero = mNumero;
		this.mTitular = mTitular;
	}
	
	public Tarjeta() {
		super();
	}

	public Tarjeta(String mNumero, String mTitular) {
		super();
		this.mNumero = mNumero;
		this.mTitular = mTitular;
	}

	public abstract double getSaldo();
	public abstract void ingresar(double x);
	public abstract void pagoEnEstablecimiento(String datos, double x);
	public abstract void retirar(double x);
	
	public void setCuenta(Cuenta c) {
		mCuentaAsociada = c;
	}

	public Cuenta getmCuentaAsociada() {
		return mCuentaAsociada;
	}

	public void setmCuentaAsociada(Cuenta mCuentaAsociada) {
		this.mCuentaAsociada = mCuentaAsociada;
	}

	public LocalDate getmFechaDeCaducidad() {
		return mFechaDeCaducidad;
	}

	public void setmFechaDeCaducidad(LocalDate mFechaDeCaducidad) {
		this.mFechaDeCaducidad = mFechaDeCaducidad;
	}

	public String getmNumero() {
		return mNumero;
	}

	public void setmNumero(String mNumero) {
		this.mNumero = mNumero;
	}

	public String getmTitular() {
		return mTitular;
	}

	public void setmTitular(String mTitular) {
		this.mTitular = mTitular;
	}

	@Override
	public String toString() {
		return "Tarjeta [mCuentaAsociada=" + mCuentaAsociada + ", mFechaDeCaducidad=" + mFechaDeCaducidad + ", mNumero="
				+ mNumero + ", mTitular=" + mTitular + "]";
	}


}
