package practice.network;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSocketClass {
	

	public ServerSocketClass() {
		
	}
	
	public static void main(String[] args) throws IOException {
		ServerSocket ss = null;
		Socket s = null;
		
		ss = new ServerSocket(9000);
		System.out.println(" -- ready to accept client -- ");
		
		s = ss.accept();
		System.out.println(" -- success to be connected with client -- ");
		System.out.println("socket: " + s);
		
//		if(s != null) s.close();
		if(ss != null) ss.close();
	}

}
