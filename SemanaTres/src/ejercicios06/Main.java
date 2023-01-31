package ejercicios06;

public class Main {

	public static void main(String[] args) {
		NoSincro s1 = new NoSincro();
		s1.setMensaje("Desde 1 ->");
		Thread thr1 = new Thread(s1);
		
		NoSincro s2 = new NoSincro();
		s2.setMensaje("Desde 2 ->");
		Thread thr2 = new Thread(s2);
		//Llamas a Thread para poder hacer el .start
		thr1.start();
		thr2.start();
	}

}
