package ejercicios07Sincronizado;

public class Sincro implements Runnable{

	static Integer n = 1; //synchronized no puede ser int tienen que ser clases
	private String mensaje;
	
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	
	public void run() {
		for (int i = 0; i < 10; i++) {
			synchronized(n) {
				System.out.println(mensaje + " " + n);
				n++;
			}
			try {
				Thread.sleep(500);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
