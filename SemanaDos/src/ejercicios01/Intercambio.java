package ejercicios01;

/**
 * Clase GENERICA Intercambio con su constructor y getters & setters
 * @author andrea.sanclemente
 *
 */

public class Intercambio<T> {
	T valor1;
	T valor2;
	
	public Intercambio(T valor1, T valor2) {
		super();
		this.valor1 = valor1; //setValor1(valor1)
		this.valor2 = valor2; //setValor2(valor2)
	}
	public T getValor1() {
		return valor1;
	}
	public void setValor1(T valor1) {
		this.valor1 = valor1;
	}
	public T getValor2() {
		return valor2;
	}
	public void setValor2(T valor2) {
		this.valor2 = valor2;
	}
	
	/**
	 * Método intercambio que haremos intercambiar los dos Strings de posición
	 */
	public void intercambio() {
		T temp = valor1; //getValor1();
		valor1 = valor2; //setValor1(getValor2());
		valor2 = temp;	//setValor2(temp);
	}
	
	

}
