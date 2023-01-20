package ejercicios05;

public abstract class Equipo {
	private int id;
	private String Nombre;
	private String Apellidos;
	private int edad;
	
	public Equipo(int id, String nombre, String apellidos, int edad) {
		super();
		this.id = id;
		Nombre = nombre;
		Apellidos = apellidos;
		this.edad = edad;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getApellidos() {
		return Apellidos;
	}

	public void setApellidos(String apellidos) {
		Apellidos = apellidos;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public abstract void concentrarse();
	public abstract void viajar();
	

}
