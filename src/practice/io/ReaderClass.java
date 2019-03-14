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
			text += line + "\r\n";		// readLine()�� ���๮�ڸ� ���� ���ϱ⿡ ���� �߰��Ѵ�
		}
		br.close();
		
		return text;
	}
	
	public String readByte() throws IOException {
		FileInputStream fis = new FileInputStream(path);
		byte[] b = new byte[1024];		// 1024����Ʈ ��ŭ�� �д´�
		
		fis.read(b);
		fis.close();
		
		return new String(b);			// ����Ʈ�� String constructor�� ���� �ٲ۴�
	}
	
}
