import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
    public static void main(String[] args) {
        try (FileWriter writer = new FileWriter("output.txt")) {
            String data = "Hello, I/O streams!\n";
            writer.write(data);
            writer.write("مرحبا بكم!\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
