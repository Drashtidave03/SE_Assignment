import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileTransfer {
    public static void main(String[] args) {
        String source = "source.txt";
        String destination = "destination.txt";

        try (FileReader reader = new FileReader(source);
             FileWriter writer = new FileWriter(destination)) {
            
            int character;
            while ((character = reader.read()) != -1) {
                writer.write(character);
            }
            
            System.out.println("Content transferred successfully.");
        } catch (IOException e) {
            System.err.println("IO Error: " + e.getMessage());
        }
    }
}
