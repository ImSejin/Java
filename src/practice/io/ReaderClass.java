package practice.io;

import java.io.*;

public class ReaderClass {
	
	String path = null;
	
	public ReaderClass(String path) {
		this.path = path;
	}
	
	public String read() throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(path));
		
		String text = "";
		while(true) {
			String line = br.readLine();
			if(line == null) break;
			text += line + "\r\n";		// readLine()은 개행문자를 읽지 못하기에 직접 추가한다
		}
		br.close();
		
		return text;
	}
	
	public String readByte() throws IOException {
		FileInputStream fis = new FileInputStream(path);
		byte[] b = new byte[1024];		// 1024바이트 만큼씩 읽는다
		
		fis.read(b);
		fis.close();
		
		return new String(b);			// 바이트를 String constructor를 통해 바꾼다
	}
	
}
