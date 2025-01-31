package com.mst.iostream;
import java.io.IOException;

public class SimpleInputExample {
    public static void main(String[] args) {
        System.out.println("Please enter a line of text:");

        try {
            // Read a line of input from System.in
            int character;
            StringBuilder input = new StringBuilder();
            
            // Read characters until Enter is pressed (newline character)
            while ((character = System.in.read()) != -1) {
                if (character == '\n') {
                    break; // Exit loop on newline
                }
                input.append((char) character);
            }
            
            // Print the input received from the user
            System.out.println("You entered: " + input.toString());
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
