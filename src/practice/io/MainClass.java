package practice.io;

import java.io.*;

public class MainClass {

	public static void main(String[] args) throws IOException {
		
		/*
		String path = "E:\\eclipse-workspace\\Webtest\\hello_world_copy.txt";
		
		FileLoader fl = new FileLoader("E:\\eclipse-workspace\\Webtest\\hello_world.txt");
		byte[] b = new byte[3];
		
		fl.read();
		
		// ---
		
		FileWriter fw = new FileWriter(path);
		
		fw.write("임세진!입니다.");
		
		// ---
		
		
		OutputStream out = null;
		DataOutputStream dout = null;
		
		// writeUTF()로 저장한 파일만 readUTF()로 불러올 수 있다

		try {
			out = new FileOutputStream("E:\\eclipse-workspace\\Webtest\\imsejin.txt");
			dout = new DataOutputStream(out);
			
			dout.writeUTF("임세진");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		File file = new File("E:\\eclipse-workspace\\Webtest\\imsejin.txt");
		DataWriter dw = new DataWriter(file);
		
		dw.write();
		*/
		
		// ---
		
		String path_to_load = ".\\testFile.txt";
		String path_to_save = ".\\testFile_copy.txt";
		
		ReaderClass rc = new ReaderClass(path_to_load);
		String text = rc.readByte();
		
		System.out.println(text);
		
		WriterClass wc = new WriterClass(path_to_save);
		wc.write(text);
		
		// 현재 프로젝트의 경로 얻는 방법
		File file = new File(".");
		String absolutePath = file.getAbsolutePath();
		System.out.println(absolutePath);
		
		// ---
		
		/*
		try {
			PrintStream ps = new PrintStream(new FileOutputStream("E:\\eclipse-workspace\\Webtest\\testFile123.txt",true));
			ps.println("꾸어엉");
		} catch (Exception e) {
			e.printStackTrace();
		}
		*/
		
		// ---
		
		
	}

}
