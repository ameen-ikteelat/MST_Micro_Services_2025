import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;

public class StreamReaderWriterExample {
    public static void main(String[] args) {
        // Use InputStreamReader to read from System.in
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out))) {
            
            System.out.println("Please enter a line of text:");

            // Read a line of text from the user
            String inputLine = reader.readLine();

            // Write the same line of text to System.out
            writer.write("You entered: " + inputLine);
            writer.newLine();  // Ensure the output ends with a new line
            writer.flush();    // Flush the BufferedWriter to ensure all data is written

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
