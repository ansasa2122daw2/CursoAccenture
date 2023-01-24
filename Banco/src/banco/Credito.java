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
		System.out.println("Mostrar tarjeta CREDITO -> " + toString());
		System.out.println(forSaldo);
		return forSaldo;
	}

	@Override
	public void ingresar(double x) {
		Movimiento mov = new Movimiento();
		if(x>0) {
			mov.setmImporte(x);
			addMovi(mov);
			System.out.println("Ingresar tarjeta CREDITO -> " + toString());
			System.out.println("AÑADIDO " + x);
		}else {
			throw new MiExcepcion("Error ingresar dinero");
		}

	}
	
	public void liquidar(int mes, int ano) {
		double r= 0;
		//Corrección profesor
		for (Iterator it = mMovimientos.iterator(); it.hasNext();) {
			Movimiento m = (Movimiento) it.next();
			if(m.getmFecha().getMonthValue() == mes && m.getmFecha().getYear() == ano) {
				r += m.getmImporte();
				it.remove();
			}
		}
	}

	@Override
	public void pagoEnEstablecimiento(String datos, double x) {
		System.out.println("Compra a crédito en: ");

	}

	@Override
	public void retirar(double x) {
		if (x > 0) {
			Movimiento mov = new Movimiento();
			mov.setmImporte(- x);
			addMovi(mov);
			System.out.println("Retirar tarjeta CREDITO -> " + toString());
			System.out.println("RETIRADA " + x);
		}else {
			throw new MiExcepcion("Error retirada dinero");
		}
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
