package practice.io;

import java.io.*;

public class DataWriter {
	
	private File file = null;
	private String path = null;
	private boolean flag = false; // true: File, false: String
	private InputStream in = null;
	private DataInputStream din = null;
	private OutputStream out = null;
	private DataOutputStream dout = null;

	public DataWriter(File file) {
		this.file = file;
		flag = true;
	}
	
	public DataWriter(String path) {
		this.path = path;
		flag = false;
	}
	
	public void write() {
		try {
			// 읽을 파일 불러오기
			if(flag) {
				in = new FileInputStream(file);
			} else {
				in = new FileInputStream(path);
			}
			
			din = new DataInputStream(in);
			
			try {
				// 파일 읽기
				String data = din.readUTF();
				System.out.println("\ndata: " + data);
				// 저장경로 설정
				if(flag) {
					out = new FileOutputStream(file + "_copy.txt");
				} else {
					out = new FileOutputStream(path + "_copy.txt");
				}
				dout = new DataOutputStream(out);
				
				dout.writeUTF(data + "\n\nCopied.");
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}
}
