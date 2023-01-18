package ejerciciosPw;

public class DatosArray {

	public static void main(String[] args) {
		int[] diaMes= {31,28,31,30,31,30,31,31,30,31,30,31};
		int[][] elMes = new int[5][7];
		int contador = 0;

//		elMes[0][0]=1;
//		elMes[0][1]=2;
//		elMes[0][2]=3;
//		elMes[0][3]=4;
//		elMes[0][4]=5;
//		elMes[0][5]=6;
		
		for (int i = 0; i<5; i++ ) {
			for(int y = 0; y < 7; y++) {
				//elMes[i][y] = i + y;
				System.out.println(elMes[i][y] = i + y);
			}
		}

		for (int i = 0; i < elMes.length; i++) {
			for (int y = 0; y < elMes[i].length; y++) {
				if (contador < 31) {
					//elMes[i][y] = ++contador;
					System.out.println(elMes[i][y] = ++contador);
				}
				
			}
		}


	}

}
