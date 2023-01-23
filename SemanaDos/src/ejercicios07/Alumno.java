package ejercicios07;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Alumno extends Persona {
	private int curso;
	private String[] asignaturas;
	private String asignatura;
	
	public Alumno(String codPersona, String nombre, int edad, String telContacto, int curso, String[] asignaturas) {
		super(codPersona, nombre, edad, telContacto);
		this.curso = curso;
		this.asignaturas = asignaturas;
	}
	
	public Alumno(String codPersona, String nombre, int edad, String telContacto, int curso) {
		super(codPersona, nombre, edad, telContacto);
		this.curso = curso;
	}

	public int getCurso() {
		return curso;
	}

	public void setCurso(int curso) {
		this.curso = curso;
	}

	public String[] getAsignaturas() {
		return asignaturas;
	}

	public void setAsignaturas(String[] asignaturas) {
		this.asignaturas = asignaturas;
		
	}
	
	public String getAsignatura() {
		return asignatura;
	}

	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}

	@Override
	public void mostrar() {
		System.out.println(super.toString() + "Alumno [curso=" + curso + ", asignaturas=" + asignatura + "]");

	}

}
