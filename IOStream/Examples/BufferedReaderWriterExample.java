import java.io.*;

public class BufferedReaderWriterExample {
    public static void main(String[] args) {
        // File paths for input and output files
        String inputFilePath = "input.txt";
        String outputFilePath = "output.txt";
        
        // Use try-with-resources to ensure streams are closed properly
        try (
            // Create a BufferedReader to read from the input file
            BufferedReader reader = new BufferedReader(new FileReader(inputFilePath));
            
            // Create a BufferedWriter to write to the output file
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath))
        ) {
            String line;
            
            // Read lines from the input file
            while ((line = reader.readLine()) != null) {
                // Process the line (convert to uppercase in this example)
                String processedLine = line.toUpperCase();
                
                // Write the processed line to the output file
                writer.write(processedLine);
                writer.newLine(); // Ensure each line is written on a new line
            }
            
            // Optionally flush the writer to ensure all data is written
            writer.flush();
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
