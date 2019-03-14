package practice.network;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientSocketClass {
	

	public ClientSocketClass() {
		
	}
	
	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket s = null;
		s = new Socket("localhost", 9000); // 127.0.0.1
		System.out.println(" -- success to be connected with server -- ");
		System.out.println("socket: " + s);
		
		if(s != null) s.close();
	}

}
