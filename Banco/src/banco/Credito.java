package banco;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import bancoExcepciones.MiExcepcion;

/**
 * Clase Credito que extiende de Tarjeta
 * @author andrea.sanclemente
 *
 */

public class Credito extends Tarjeta {
	private final double COMISION = 0.05;
	private final double MIN_COMISION = 3.0;
	private double mCredito;
	private List<Movimiento> mMovimientos = new ArrayList<Movimiento>(); //Lo inicio aquí
	
	public Credito(LocalDate mFechaDeCaducidad, String mNumero, String mTitular) {
		super(mFechaDeCaducidad, mNumero, mTitular);
	}
	
	public double getCreditoDisponible() {
		return mCredito + getSaldo();
	}
	
	public void addMovi(Movimiento mov) {
		mMovimientos.add(mov);
	}

	@Override
	public double getSaldo() {
		double forSaldo = 0;
		for (Movimiento movi : mMovimientos) {
			forSaldo += movi.getmImporte();
		}
		return forSaldo;
	}

	@Override
	public void ingresar(double x) {
		Movimiento mov = new Movimiento();
		if(x>0) {
			mov.setmImporte(x);
			addMovi(mov);
			System.out.println(toString() +  "\tIngresar credito-> " + x + "\t Saldo ->"+  getSaldo());
		}else {
			throw new MiExcepcion("Error ingresar dinero");
		}

	}
	
	public void liquidar(int mes, int ano) {
		Movimiento liq = new Movimiento();
		System.out.println("Liquidación tarjeta del mes: " + mes + " y año: " + ano);
		double r= 0;
		//Corrección profesor
		for (Iterator it = mMovimientos.iterator(); it.hasNext();) {
			Movimiento m = (Movimiento) it.next();
			if(m.getmFecha().getMonthValue() == mes && m.getmFecha().getYear() == ano) {
				r += m.getmImporte(); //para el total
				it.remove();
			}
		}
		liq.setmImporte(r);
		System.out.println(toString() + "\t Saldo ->"+  getSaldo());
		if (r != 0) {
			mMovimientos.add(liq);
			

		}
	}

	@Override
	public void pagoEnEstablecimiento(String datos, double x) {
		Movimiento movi = new Movimiento();
		movi.setmFecha(mFechaDeCaducidad);
		movi.setmConcepto(datos);
		movi.setmImporte(x);
		mMovimientos.add(movi);
		System.out.println(toString() +  "\tPago en establecimiento credito-> "+ datos + x + "\t Saldo ->"+  getSaldo());

	}

	@Override
	public void retirar(double x) {
		if (x > 0 ) {
			x = x + (x * COMISION < MIN_COMISION ? MIN_COMISION : x * COMISION);
		}
		Movimiento mov = new Movimiento();
		mov.setmImporte(- x);
		addMovi(mov);
		System.out.println(toString() +  "\tRetirada credito-> " + x + "\t Saldo ->"+  getSaldo());
	}

	public double getmCredito() {
		return mCredito;
	}

	public void setmCredito(double mCredito) {
		this.mCredito = mCredito;
	}

	public List<Movimiento> getmMovimientos() {
		return mMovimientos;
	}

	public void setmMovimientos(List<Movimiento> mMovimientos) {
		this.mMovimientos = mMovimientos;
	}

}
