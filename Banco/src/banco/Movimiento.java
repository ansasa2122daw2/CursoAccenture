package banco;

import java.time.LocalDate;
import java.util.Date;

public class Movimiento {
	private String mConcepto;
	private LocalDate mFecha;
	private double mImporte;
	
	public Movimiento(String mConcepto, double mImporte) {
		this.mConcepto = mConcepto;
		this.mImporte = mImporte;
	}
	
	public Movimiento(double mImporte) {
		super();
		this.mImporte = mImporte;
	}

	public Movimiento() {
		mFecha = LocalDate.now();    
	}

	public String getmConcepto() {
		return mConcepto;
	}

	public void setmConcepto(String mConcepto) {
		this.mConcepto = mConcepto;
	}

	public LocalDate getmFecha() {
		return mFecha;
	}

	public void setmFecha(LocalDate mFecha) {
		this.mFecha = mFecha;
	}

	public double getmImporte() {
		return mImporte;
	}

	public void setmImporte(double mImporte) {
		this.mImporte = mImporte;
	}

	@Override
	public String toString() {
		return "Movimiento [mConcepto=" + mConcepto + ", mFecha=" + mFecha + ", mImporte=" + mImporte + "]";
	}

	
	

}
