package banco;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Vector;

import bancoExcepciones.MiExcepcion;
import bancoFiltros.FiltroExcepciones;
import bancoFiltros.Filtros;

/**
 * Clase Cuenta 
 * @author andrea.sanclemente
 *
 */

public class Cuenta extends Exception{
	private List<Movimiento> mMovimientos = new ArrayList<Movimiento>(); //Lo inicio aquí
	private String mTitular;
	private String mNumero;
	private final int XMAX = 100;
	private final int XMIN = 10;
	
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
//		for (Movimiento movi : mMovimientos) {
//			forSaldo += movi.getmImporte();
//		}
//		return forSaldo;
			
		//ejemplo stream
		
		forSaldo = mMovimientos.stream()
				.map(mov -> mov.getmImporte())
				.reduce(0d, (subtotal, element) -> subtotal + element);
		
		return forSaldo;
	}

	public void ingresar(double x){
		Movimiento mov = new Movimiento();
		if(x>0) {
			mov.setmImporte(x);
			addMovi(mov);
			if(Filtros.filtroDinero(x, XMAX, XMIN)) {
				System.out.println(mov.getmFecha() +  "\tIngresar cuenta-> " + x + "\t Saldo ->"+  getSaldo());
			}else {
				throw new MiExcepcion("Error, cantidad");
			}
		}
	}
	
	/**
	 * Método para añadir los movimientos en el List<Movimientos>
	 * @param mov
	 */
	
	public void addMovi(Movimiento mov) {
		mMovimientos.add(mov);
	}
	
	/**
	 * Método ingresar con excepción y excepción de filtro con mensaje propio
	 * @param concepto
	 * @param x
	 */
	
	public void ingresar(String concepto, double x){
		Movimiento mov = new Movimiento();
		mov.setmImporte(x);	
		mov.setmConcepto(concepto);
		addMovi(mov);
		
		if (FiltroExcepciones.conceptoFiltroError(concepto,x)) {
			System.out.println(mov.getmFecha() +  "\tIngresar cuenta-> " + concepto + x + "\t Saldo ->"+  getSaldo());
		}
	}


	public void retirar(double x) {
		if (x > 0) {
			Movimiento mov = new Movimiento();
			mov.setmImporte(- x);
			addMovi(mov);
			System.out.println(mov.getmFecha() +  "\tRetirar cuenta-> " + x + "\t Saldo ->"+  getSaldo());
		}else {
			throw new MiExcepcion("Error retirada dinero");
		}
	}
	
	/**
	 * Método retirar con excepción y excepción de filtro con mensaje propio
	 * @param concepto
	 * @param x
	 */
	
	public void retirar(String concepto, double x) {
			Movimiento mov = new Movimiento();
			mov.setmImporte(- x); //- delante para restar
			mov.setmConcepto(concepto);
			addMovi(mov);
			if (FiltroExcepciones.conceptoFiltroError(concepto,x)) {
				System.out.println(mov.getmFecha() +  "\tRetirar cuenta-> " + concepto + x + "\t Saldo ->"+  getSaldo());
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
