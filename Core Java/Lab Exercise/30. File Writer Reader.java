
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterReader {
	public static void main(String[] args) throws IOException {
		String msg = "this msg will store into file"
		
		FileReader f = new FileReader("t2.txt");
		int i;
		while((i = f.read())!=-1) {
			System.out.print((char)i);
		}
	}
}
