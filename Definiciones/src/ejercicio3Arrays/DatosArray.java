package ejercicio3Arrays;

public class DatosArray {

	public static void main(String[] args) {
		int[] diaMes= {31,28,31,30,31,30,31,31,30,31,30,31};
		int diaMes2[]={31,28,31,30,31,30,31,31,30,31,30,31};
		
		int[] elAno = new int[5];
		
		System.out.println(diaMes[1]);
		System.out.println(diaMes.length); //te imprime el numero de elementos que tiene (12)
		
		//instanceOf ejemplo
		String nombre = "Andrea";
		boolean resultado = (nombre instanceof String); //compara clasesnombre
		System.out.println(resultado);
		
		//operadores ejemplo ++
		int dato = 23;
		dato++;
		int v25 = ++dato; //para que sea antes 25
		int f25 = dato++;
		System.out.println(v25+ " " + f25);
		
		//ejemplo if con cosas
//		if(dato >0 & resultado) // y 
//		if(dato >0 | resultado) // o
//		if(nombre.length()>10) // el String tiene un metodo longitud donde se pone parentesis
		// && (and)
//		if(nombre!=null && nombre.length()>10) //si la primera parte no cumple (nombre) ya no se compara ni sigue
//		if(nombre!=null & nombre.length()>10) //si no es null pero igualmente sigue porque solo es un &
//		if(!resultado) // cuando resultado es false
		
		// Expresion boleana (ternario condicional) primero seria true el segundo false
		int valor = dato>50?1:50;
		System.out.println(valor);
		
	}

}
