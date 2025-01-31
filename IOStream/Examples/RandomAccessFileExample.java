import java.io.RandomAccessFile;
import java.io.IOException;

public class RandomAccessFileExample {
    public static void main(String[] args) {
        String filePath = "example.dat";

        try (RandomAccessFile raf = new RandomAccessFile(filePath, "rw")) {
            // Write data to the file
            raf.writeInt(123); // Write an integer at position 0
            raf.writeDouble(3.14); // Write a double at position 4 (after the integer)

            // Move the file pointer to the beginning
            raf.seek(0);

            // Read data from the file
            int intValue = raf.readInt();
            double doubleValue = raf.readDouble();

            // Print read values
            System.out.println("Read Integer: " + intValue);
            System.out.println("Read Double: " + doubleValue);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
