package practice.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.PrintWriter;

public class MainClass {

	public static void main(String[] args) throws IOException {
		
		String path = "E:\\eclipse-workspace\\Webtest\\hello_world_copy.txt";
		byte[] buffer = new byte[512];
		
		// ---
		/*
		FileInputStream fis = new FileInputStream(path);
		FileOutputStream fos = new FileOutputStream("copied.txt");
		
		// read()�� argument�� ���� ������ ���� ������ byte�� ��ȯ�Ѵ�
//		int data = 0;
//			while ( (data = fis.read()) != -1 ) {
//				fos.write(data);
		
		// read()�� argument�� ������ argument�� length ������ �� �� byte�� �����ϴ����� ��ȯ�Ѵ�
		int dataCount = 0;
		while ( (dataCount = fis.read(buffer)) != -1 ) {
			fos.write(buffer, 0, dataCount);
		}
		fos.close();
		fis.close();
		*/
		// ---
		
		PrintStream ps = System.out;
		PrintWriter pw2 = new PrintWriter(ps);
		pw2.println("ddd");
		
		// ---
		
		BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
		String str = br2.readLine();
		System.out.println(str);
		
//		pw2.close();
		br2.close();
		
		// ---
		/*
		FileLoaderClass fl = new FileLoaderClass("E:\\eclipse-workspace\\Webtest\\hello_world.txt");
		
		fl.read();
		
		// ---
		
		FileWriterClass fw = new FileWriterClass(path);
		
		fw.write("�Ӽ���!�Դϴ�");
		
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
		
		/*
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
		*/
		
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
