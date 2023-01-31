package ejercicios08MonitoresEj;

import java.util.Random;

/**
 * Clase genera numero 
 * Generador - No disponible 
 *	generar numero
 *	marcar disponible
 *	notificar all
 *	wait
 * ----------- Si disponible 
 *	tomo numero
 *	marco no disponible
 *	imprimo numero
 *	notify all
 *	wait
 * @author andrea.sanclemente
 *
 */

public class GeneraNumero implements Runnable{
	Buffer buf;
	
	public void setBuf(Buffer buf) {
		this.buf = buf;
	}
	
	//Segunda solucion
	@Override
	public void run() {
		Random rn = new Random();
		while(true) {
			buf.setNumero(rn.nextInt());
		}
		
	}
	
	//primera solución
//	@Override
//	public void run() {
//		Random rn = new Random();
//		while(true) {
//			synchronized(buf) {
//				while(buf.isDisponible()) {
//					System.out.println("esperando espacio...");
//					try {
//						buf.wait();	
//					}catch(InterruptedException e) {
//						e.printStackTrace();
//					}
//				}
//				buf.setNumero(rn.nextInt());
//				buf.setDisponible(true);
//				System.out.println("Numero disponible");
//				buf.notifyAll();
//			}
//		}
//	}

}
