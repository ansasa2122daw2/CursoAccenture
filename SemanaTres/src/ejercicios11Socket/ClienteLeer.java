package ejercicios11Socket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClienteLeer {
	
	public static final int PUERTO = 443; //80 estandar para http y 443 estandar para https
	public static final String DIRECCION = "www.recursosformacion.com";

	public static void main(String[] args) throws UnknownHostException, IOException {
		//cuando solo vas a enviar un mensaje y recibir la respuesta
		System.out.println("Conectando a " + DIRECCION + " por puerto " + PUERTO);
		Socket client = new Socket(DIRECCION, PUERTO); //te conectas
		
		//DataOutputStream para imprimir el mensaje e enviarlo
		System.out.println("conectado a " + client.getRemoteSocketAddress());
		OutputStream outToServer = client.getOutputStream();
		DataOutputStream out = new DataOutputStream(outToServer);
		out.writeUTF("Saluditos desde " + client.getLocalSocketAddress()); //envias al servirdor
		
		//DataInputStream para recibir cualquier mensaje que transmitan lo leemos y lo imprimos
		InputStream inFromServer = client.getInputStream();
		DataInputStream in = new DataInputStream(inFromServer);
		//lectura de todo lo que te devuelve el servidor la respuesta
		int lectura = in.read(); //in.ReadLine para leer el html
		while(lectura!=-1) {
			System.out.println(lectura); //readUTF no funcionaba
			lectura=in.read();
		}
		//luego cierras el cliente
		//client.close();
	}

}
