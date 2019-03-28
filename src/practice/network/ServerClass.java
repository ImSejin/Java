package practice.network;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerClass {

	public static void main(String[] args) throws Exception{
		
		ServerSocket ss = null;
		Socket s = null;
		
		PrintWriter pw = null;
		BufferedReader br = null;
		
		ss = new ServerSocket(9000);
		System.out.println(" -- ready to be connected with client -- ");
		
		s = ss.accept();
		System.out.println(" -- success to be connected with client -- ");
		System.out.println("socket: " + s);
		
		pw = new PrintWriter(s.getOutputStream());
		br = new BufferedReader(new InputStreamReader(s.getInputStream()));
		
		while (true) {
			String msg = br.readLine();
			
			if(msg.equals("stop")) {
				System.out.println(" -- the client stops the dialogue -- ");
				break;
			} else {
				System.out.println("msg: " + msg);
				pw.println(" -- success to send the message to client -- ");
				pw.flush();
			}
		}
		
		ss.close();
		pw.close();
		br.close();
	}
}