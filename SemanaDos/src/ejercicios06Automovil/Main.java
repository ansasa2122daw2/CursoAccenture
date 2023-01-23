package ejercicios06Automovil;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Automovil> lista = new ArrayList<Automovil>();
		lista.add(new Coche(6, 150, 4, 130, 4, "Amarillo", "Seat"));
		lista.add(new Camion(9, 150, 130, 8, 420, 690, "Renault"));
		lista.add(new Moto(6, 150, 130, 320, 60, "Seat"));
		lista.forEach(actual-> {
			if (actual instanceof Coche) {
				((Coche) actual).activarReductora(true);
			}
		});
		lista.forEach(list-> System.out.println(list));
		
	}

}
