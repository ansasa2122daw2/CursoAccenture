package banco;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Vector;

import bancoExcepciones.MiExcepcion;

/**
 * Clase Cuenta 
 * @author andrea.sanclemente
 *
 */

public class Cuenta{
	private List<Movimiento> mMovimientos = new ArrayList<Movimiento>(); //Lo inicio aquí
	private String mTitular;
	private String mNumero;
	
	public Cuenta(String mTitular, String mNumero) {
		super();
		this.mTitular = mTitular;
		this.mNumero = mNumero;

	}
	
	public Cuenta() {
		super();
	}

	public double getSaldo() {
		double forSaldo = 0;
			for (Movimiento movi : mMovimientos) {
				forSaldo += movi.getmImporte();
			}
			System.out.println(forSaldo);
			return forSaldo;
	}

	public void ingresar(double x) {
		Movimiento mov = new Movimiento();
		if(x>0) {
			mov.setmImporte(x);
			addMovi(mov);
			System.out.println("AÑADIDO " + x);
		}else {
			throw new MiExcepcion("Error al añadir");
		}
	}
	
	/**
	 * Método para añadir los movimientos en el List<Movimientos>
	 * @param mov
	 */
	
	public void addMovi(Movimiento mov) {
		mMovimientos.add(mov);
	}
	
	public void ingresar(String concepto, double x) {
		Movimiento mov = new Movimiento();
		if (x>0) {
			mov.setmImporte(x);	
			mov.setmConcepto(concepto);
			addMovi(mov);
		}else {
			throw new MiExcepcion("Error");
		}

		System.out.println(concepto + "AÑADIDO " + x);
	}

	public void retirar(double x) {
		if (x > 0) {
			Movimiento mov = new Movimiento();
			mov.setmImporte(- x);
			addMovi(mov);
			System.out.println("RETIRADA " + x);
		}else {
			throw new MiExcepcion("Error retirada dinero");
		}
	}

	public List<Movimiento> getmMovimientos() {
		return mMovimientos;
	}

	public void setmMovimientos(List<Movimiento> mMovimientos) {
		this.mMovimientos = mMovimientos;
	}

	public String getmTitular() {
		return mTitular;
	}

	public void setmTitular(String mTitular) {
		this.mTitular = mTitular;
	}

	public String getmNumero() {
		return mNumero;
	}

	public void setmNumero(String mNumero) {
		this.mNumero = mNumero;
	}
	

}
