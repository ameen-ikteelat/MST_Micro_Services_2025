package com.mst.iostream;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {
    public static void main(String[] args) {
        // Use try-with-resources to ensure FileReader is closed automatically
    	// existing file: example.txt
    	// non-existing file: example1.txt
        try (FileReader fr = new FileReader("example.txt")) {
            int ch;
            // Read the file character by character
            while ((ch = fr.read()) != -1) {
                // Print each character to the console
                System.out.print((char) ch);
            }
        } catch (IOException e) {
            // Handle any I/O errors
            e.printStackTrace();
        }
    }
}