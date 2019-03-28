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
			String msgTo = scan.nextLine();
			
			pw.println(msgTo);
			pw.flush();
			
			if(msgTo.equals("stop")) {
				System.out.println(" -- success to be disconnected with server -- ");
				break;
			} else {
				String msgFrom = br.readLine();
				System.out.println("msg: " + msgFrom);
			}
		}
		
		s.close();
		pw.close();
		br.close();
		scan.close();
	}
}
