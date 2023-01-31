package ejercicios08MonitoresEj;

public class PresentaNumero implements Runnable{
	
	Buffer buf;
	
	public void setBuf(Buffer buf) {
		this.buf = buf;
	}
	
	//Segunda solucion
	@Override
	public void run() {
		while(true) {
			System.out.println(buf.getNumero());
		}
		
	}
	
	//primera solución
//	@Override
//	public void run() {
//		while(true) {
//			synchronized(buf) {
//				while(!buf.isDisponible()) {
//					System.out.println("Esperando numero");
//					try {
//						buf.wait();
//					}catch(InterruptedException e) {
//						e.printStackTrace();
//					}
//				}
//				System.out.println(buf.getNumero());
//				buf.setDisponible(false);
//				buf.notifyAll();
//			}
//		}
//	}

}
