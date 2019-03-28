package practice.network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainClass {

	public static void main(String[] args) throws IOException {
		
		/*
		ServerSocket ss = null;
		Socket s = null;
		
		ss = new ServerSocket(9000);
		System.out.println(" -- ready to welcome client -- ");
		
		s = ss.accept();
		System.out.println(" -- success to be connected with client -- ");
		System.out.println("socket: " + s);
		
		if(s != null) s.close();
		if(ss != null) ss.close();
		*/
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String msg = br.readLine();
		
		System.out.println("msg: " + msg);
		br.close();
		
		Gender gender = Gender.LESBIAN;
		System.out.println(gender.convertKorean());
	}
}
