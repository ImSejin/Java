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
		
		fw.write("�Ӽ���!�Դϴ�.");
		
		// ---
		
		
		OutputStream out = null;
		DataOutputStream dout = null;
		
		// writeUTF()�� ������ ���ϸ� readUTF()�� �ҷ��� �� �ִ�

		try {
			out = new FileOutputStream("E:\\eclipse-workspace\\Webtest\\imsejin.txt");
			dout = new DataOutputStream(out);
			
			dout.writeUTF("�Ӽ���");
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
		
		// ���� ������Ʈ�� ��� ��� ���
		File file = new File(".");
		String absolutePath = file.getAbsolutePath();
		System.out.println(absolutePath);
		
		// ---
		
		/*
		try {
			PrintStream ps = new PrintStream(new FileOutputStream("E:\\eclipse-workspace\\Webtest\\testFile123.txt",true));
			ps.println("�پ��");
		} catch (Exception e) {
			e.printStackTrace();
		}
		*/
		
		// ---
		
		
	}

}
