package ejercicio4Bucle;

public class Fecha3 {

	public static void main(String[] args) {
		System.out.println("-----Primera version: ");
		primeraVersion(20,8,2015);
		primeraVersion(32,8,2015);
		primeraVersion(30,19,2015);
		System.out.println("-----Segunda version: ");
		segundaVersion(30,2,2001);
		System.out.println("-----Tercera version: ");
		terceraVersion(30,1,2001);
		System.out.println("-----Cuarta version: ");
		cuartaVersion(29,2,2020);
		cuartaVersion(28,2,2023);
		cuartaVersion(29,2,2023);

	}

	public static void primeraVersion(int dia, int mes, int ano) {
		if (dia >= 1 && dia <= 30) {
			if ( mes >= 1 && mes <=12) {
				if (ano != 0) {
					System.out.println("Fecha correcta");
				}
				else {
					System.out.println("Año incorrecto");
				}
			}
			else {
				System.out.println("Mes incorrecto");
			}
		}
		else {
			System.out.println("Dia incorrecto");
		}
		
	}
	
	public static void segundaVersion (int dia, int mes, int ano) {
		boolean ok = false;
		if (dia >= 1 && dia <= 30) {
			if ( mes >= 1 && mes <=12) {
				if (ano != 0) {
					switch(mes) {
					case 1:
					case 3:
					case 5:
					case 7:
					case 8:
					case 10:
					case 12:
						if(dia<=31) {
							ok=true;
						}
						break;
					case 4:
					case 6:
					case 9:
					case 11:
						if (dia<= 30) {
							ok=true;
						}
						break;
					case 2:
						if(dia<=28) {
							ok=true;
						}
						break;
					}
					if(ok) {
						System.out.println("Fecha correcta");
					}
					else {
						System.out.println("Fecha incorrecta");
					}
				}
			}
		}
	}
	
	public static void terceraVersion(int dia, int mes, int ano) {
		int[] diaMes= {31,28,31,30,31,30,31,31,30,31,30,31};
		
		if(mes>=1 && mes <=12) {
			if (ano!=0) {
//				System.out.println(diaMes[mes-1]);
//				System.out.println(diaMes[mes]);
				//se pone -1 porque si no en el array te pillaria el segundo por el 0
				if(dia<=diaMes[mes-1]) {
					System.out.println("Fecha correcta");
				}
				else {
					System.out.println("Fecha incorrecta");
				}
			}
		}
	}
	
	public static void cuartaVersion (int dia, int mes, int ano) {
		//solucion profesor
		int[] diaMes= {31,28,31,30,31,30,31,31,30,31,30,31};
		
		if(mes>=1 && mes <=12) {
			if (ano!=0) {
				if ((ano%4==0 && ano%100!=0) || ano%400==0) {
					diaMes[1]=29;
					}
//				System.out.println(diaMes[mes-1]);
//				System.out.println(diaMes[mes]);
				//se pone -1 porque si no en el array te pillaria el segundo por el 0
				if(dia<=diaMes[mes-1]) {
					System.out.println("Fecha correcta");
				}
				else {
					System.out.println("Fecha incorrecta");
				}
			}
		}
//			if ((ano % 4 == 0) && ((ano % 100 != 0))) {
//				System.out.println("Año bisiesto: " + ano);
//				if(dia == 29 && mes == 2) {
//					System.out.println(dia +" seria dia correcto");
//				}else {
//					System.out.println(dia +" seria dia incorrecto");
//				}
//			}else {
//					System.out.println("\nAño no bisiesto: " + ano);
//					if(dia == 28 && mes == 2) {
//						System.out.println(dia +" seria dia correcto");
//					}else {
//						System.out.println(dia +" seria dia incorrecto");
//					}
//				}
		
		
			}
}

