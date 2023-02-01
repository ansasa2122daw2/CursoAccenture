package ejercicios11Socket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClienteTCPSimple {
	
	public static final int PUERTO = 6000;
	public static final String DIRECCION = "localhost";

	public static void main(String[] args) throws UnknownHostException, IOException {
		//cuando solo vas a enviar un mensaje y recibir la respuesta
		System.out.println("Conectando a " + DIRECCION + " por puerto " + PUERTO);
		Socket client = new Socket(DIRECCION, PUERTO);
		
		//DataOutputStream para imprimir el mensaje e enviarlo
		System.out.println("conectado a " + client.getRemoteSocketAddress());
		OutputStream outToServer = client.getOutputStream();
		DataOutputStream out = new DataOutputStream(outToServer);
		out.writeUTF("Saluditos desde " + client.getLocalSocketAddress());
		
		//DataInputStream para recibir cualquier mensaje que transmitan lo leemos y lo imprimos
		InputStream inFromServer = client.getInputStream();
		DataInputStream in = new DataInputStream(inFromServer);
		System.out.println("Me ha contestado " + in.readUTF());
		
		//luego cierras el cliente
		client.close();

	}

}
