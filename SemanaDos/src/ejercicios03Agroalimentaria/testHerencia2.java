package ejercicios03Agroalimentaria;

/**
 * Main para la información 
 * @author andrea.sanclemente
 *
 */

public class testHerencia2 {

	public static void main(String[] args) {
		// Productos frescos le meto los valores e llamo la función info que es el método abstracto de Productos
		ProductosFrescos prFrescos = new ProductosFrescos("12/02/2023", 1, "23/03/2023", "España");
				
		prFrescos.info();
				
		//igual con refrigerados
		ProductosRefrigerados prRefri = new ProductosRefrigerados("12/02/2023", 2, 500);
				
		prRefri.info();
				
		// e congelados
		ProductosCongelados prConge = new ProductosCongelados("12/02/2023", 3, -30);
				
		prConge.info();
				
		//de congelados hago de congelados Aire, al ser Productos la clase padre puede compartirse el método info con congelados aire que es hijo de congelados
		PCAire congAire = new PCAire("12/02/2023", 3, -30, 2.1, 0.2, 1.3, 2);
				
		congAire.info();
				
		//Congelados Agua
		PCAgua congAgua = new PCAgua("12/02/2023", 3, -30, 25);
				
		congAgua.info();
				
		//Congelados Nitrogeno
		PCNitrogeno congNitro = new PCNitrogeno("12/02/2023", 3, -30, "metodo",  4);
				
		congNitro.info();
	}

}
