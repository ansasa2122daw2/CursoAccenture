package ejercicios08MonitoresEj;

/**
 * Clase Buffer que guarda el numero, cuando se quiera imprimir lo cogerá de aquí
 * @author andrea.sanclemente
 *
 */

public class Buffer {
	private boolean disponible;
	private int numero;
	
	public boolean isDisponible() {
		return disponible;
	}
	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}
	//segunda solucion
	public synchronized int getNumero() {
		while(!this.isDisponible()) {
			System.out.println("Esperando numero");
			try {
				this.wait();
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		setDisponible(false);
		this.notifyAll();
		return numero;
	}
	//segunda solución
	public synchronized void setNumero(int numero) {
		while(this.isDisponible()) {
			System.out.println("esperando espacio...");
			try {
				wait();	
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.numero = numero;
		setDisponible(true);
		System.out.println("Numero disponible");
		this.notifyAll();
	}
	
}
