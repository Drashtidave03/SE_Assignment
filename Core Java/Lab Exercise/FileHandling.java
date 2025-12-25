package core;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class P022_FileHandling {
	public static void main(String[] args) throws IOException {

		String msg = "this msg will store into file";
		// write data -> FileOutputStream, FileWriter
		// read data -> FileInputStream, FileReader

//		FileOutputStream fos = new FileOutputStream("t1.txt");
//		byte[] b = msg.getBytes();
//		fos.write(b);
//		fos.flush();
//		fos.close();
//		System.out.println("msg stored into file");

		FileInputStream fis = new FileInputStream("t1.txt");
		int i;
		while((i = fis.read())!=-1) {
			System.out.print((char)i);
		}
		
	}
}
