package ejercicios03;

public class testHerencia2 {

	public static void main(String[] args) {
		
		//Productos congelados
		ProductosCongelados prcong = new ProductosCongelados("20/01/2023", 1, -50);
		
		// Productos frescos
		ProductosFrescos prfresc = new ProductosFrescos("20/01/2023", 2, "20/01/2023", "España");
		
		//Productos refrigerados 
		ProductosRefrigerados prrefri = new ProductosRefrigerados("20/01/2023", 3, 100);
		
		//Datos clase congelados por aire
		PCAire conaire = new PCAire();
		conaire.setpNitrogeno(2.9);
		conaire.setpOxigeno(0.3);
		conaire.setpDioxidoCarbono(0.2);
		conaire.setpVaporAgua(2.1);
		
		
		conaire.composicionAireCongelado("PCAgua: " + prcong);
		prfresc.productosFrescos("Productos frescos: " + prfresc);
		prrefri.productosRefrigerados("Productos Refrigerados:" + prrefri);
	}

}
