package practice.io;

import java.io.*;

public class WriterClass {
	
	private PrintWriter pw = null;
	private String path = null;
	
	public WriterClass(String path) {
		this.path = path;
	}
	
	public void write(String text) throws IOException {
		System.out.println(" -- write() START -- ");
		System.out.println("text: " + text);
		
		pw = new PrintWriter(new FileWriter(path, true));	// ���� ���Ͽ� ������ �����̷��� new PrintWriter(new FileWriter(path, true));
		pw.println(text + "\r\nCopied.");
		
		pw.close();
		System.out.println(" -- write() END -- ");
	}
	
}
