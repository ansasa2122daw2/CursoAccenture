package ejercicios11URL;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.UnknownHostException;

public class leerURL {
	
	public static void main(String[] args) throws IOException{
		
		//Trabajando con http -> HttpURLConnection  \ Heredan de URLConnetion
		//Trabajando con https -> HttpsURLconnection  \ Heredan de URLConnetion
		try{
			URL url = new URL("http://recursosformacion.com");
			HttpURLConnection huc = (HttpURLConnection) url.openConnection();
			huc.addRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/91.0.4472.124 Safari/537.36 Edg/91.0.864.59");
			
			//Buffer read para leer de golpe todo
			BufferedReader in = new BufferedReader(new InputStreamReader(huc.getInputStream()));
			
			for (int i = 1; i<= 8; i++) {
				System.out.println(huc.getHeaderFieldKey(i) + "=" + huc.getHeaderField(i));
			}
			//leo linea a linea
			String lectura = in.readLine();
			while(lectura!=null) {
				System.out.println(lectura);
				lectura=in.readLine();
			}
			huc.disconnect();
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
