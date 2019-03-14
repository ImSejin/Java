package practice.network;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class ClientClass {

	public static void main(String[] args) throws Exception {
		Socket s = null;
		
		PrintWriter pw = null;
		BufferedReader br = null;
		
		Scanner scan = null;
		
		s = new Socket("127.0.0.1", 9000);
		System.out.println(" -- ready to be connected with server -- ");
		
		pw = new PrintWriter(s.getOutputStream());
		br = new BufferedReader(new InputStreamReader(s.getInputStream()));
		
		scan = new Scanner(System.in);
		
		while (true) {
			System.out.println(" -- input the message -- ");
			String msg_to = scan.nextLine();
			pw.println(msg_to);
			pw.flush();
			
			if(msg_to.equals("stop")) {
				System.out.println(" -- success to be disconnected with server -- ");
				break;
			}

			String msg_from = br.readLine();
			System.out.println("msg: " + msg_from);
			
		}
		
		scan.close();
		s.close();
		
	}

}
