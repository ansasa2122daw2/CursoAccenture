package ejercicios11Socket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketTimeoutException;

public class ServidorTCPSimple {
	
	public static final String SALUDO = "Servidor esperando en puerto";
	public static final int TIMEOUT = 10000;
	public static final int PUERTO = 6000;
	
	private static ServerSocket serverSocket;

	public static void main(String[] args) throws IOException {
		// abrir socket y establecer timeout
		serverSocket = new ServerSocket(PUERTO);
		serverSocket.setSoTimeout(TIMEOUT);
		
		while(true) {
			try {
				System.out.println(SALUDO + serverSocket.getLocalPort() + "...");
				Socket server = serverSocket.accept(); //aqui espera durante el timout o hasta que llegue algo
				System.out.println("Conexion desde " + server.getRemoteSocketAddress());
				DataInputStream in = new DataInputStream(server.getInputStream()); //DataInputStream orientado al caracter
				System.out.println(in.readUTF());
				DataOutputStream out = new DataOutputStream(server.getOutputStream());
				out.writeUTF("Gracias por conectarte a " + server.getLocalSocketAddress() + "\nAdiosito!");
				server.close();
				break;
			}catch(SocketTimeoutException e) {
				System.out.println("Socket timed out!");
				//break;
			}catch(IOException e) {
				e.printStackTrace();
				break;
			}
		}

	}

}
