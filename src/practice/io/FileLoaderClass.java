package practice.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class FileLoaderClass {

	private InputStream in = null;
	private String path = null;
	
	public FileLoaderClass(String path) {
		this.path = path;
	}
	
	public void read() {
		try {
			// 파일 불러오기
			System.out.println(" -- read() START -- ");
			in = new FileInputStream(path);
			int data = 0;
			
			try {
				while (data != -1) {
				// 파일 읽기
				data = in.read();
				System.out.println("data: " + data);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				// 스트림 해제
				if(in != null) in.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println(" -- read() END -- ");
	}
	
	public void read(byte[] b) {
		try {
			System.out.println(" -- read(byte[]) START -- ");
			in = new FileInputStream(path);
			int data = 0;
			
			while (true) {
				try {
					data = in.read(b);
					if(data == -1) break;
					for (int i = 0; i < b.length; i++) {
						System.out.println("b[" + i + "]: " + b[i]);
					}
					
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				if(in != null) in.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println(" -- read(byte[]) END -- ");
	}
	
}


