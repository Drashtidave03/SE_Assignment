package core;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class P023_FileWriterReader {
	public static void main(String[] args) throws IOException {
		String msg = "this msg will store into file";
		
//		FileWriter fr = new FileWriter("t2.txt");
//		fr.write(msg);
//		fr.flush();
//		fr.close();
//		System.out.println("done");
		
		FileReader f = new FileReader("t2.txt");
		int i;
		while((i = f.read())!=-1) {
			System.out.print((char)i);
		}
	}
}
