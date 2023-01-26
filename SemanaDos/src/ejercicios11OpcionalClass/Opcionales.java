package ejercicios11OpcionalClass;

import java.util.Optional;

public class Opcionales {

	public static void main(String[] args) {
		
		String name = null;
		
		//Ejemplo clase opcional (si el String name llegará a ser null no petaria) 
		Optional<String> nameO = Optional.ofNullable(name);
		
		nameO.ifPresent(nombre-> System.out.println(nombre.length()));
		// version estatica sin crear el optional pero si name es nullo se ejecuta HOLA
		System.out.println(Optional.ofNullable(name).orElse("HOLA"));
	}

}
