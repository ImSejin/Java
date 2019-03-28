package practice.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FileWriterClass {
	
	private OutputStream out = null;
	private String path = null;
	
	public FileWriterClass(String path) {
		this.path = path;
	}
	
	public void write(String data) {
		try {
			// 저장경로 설정
			System.out.println(" -- write() START -- ");
			out = new FileOutputStream(path);
			
			try {
				// 데이터 쓰기
				out.write(data.getBytes(), 0, data.getBytes().length);
//				out.write(-1);	// FileOutputStream.write(FileInputStream.read())로 응용 가능하다
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				// 스트림 해제
				if(out != null) out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println(" -- write() END -- ");
	}

}
