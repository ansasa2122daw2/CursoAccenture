package ejercicios08Execepciones;

public class MiExcepcion extends RuntimeException{
	
	public MiExcepcion() {
		super("Mensaje error desde la clase");
	}
	
	public MiExcepcion(String arg0) {
		super(arg0);
	}

}
