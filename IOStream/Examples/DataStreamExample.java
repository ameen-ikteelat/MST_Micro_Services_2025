package com.mst.iostream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStreamExample {
    public static void main(String[] args) {
        String filePath = "data.txt";
        // TODO - let's have a look at the file data.txt !!
        
        // Write data to a file using DataOutputStream
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(filePath))) {
            dos.writeInt(12345);
            dos.writeDouble(3.14159);
            dos.writeUTF("Hello, World!");
            System.out.println("Data written to " + filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Read data from the file using DataInputStream
        try (DataInputStream dis = new DataInputStream(new FileInputStream(filePath))) {
            int intValue = dis.readInt();
            double doubleValue = dis.readDouble();
            String strValue = dis.readUTF();
            System.out.println("Data read from " + filePath + ":");
            System.out.println("Integer: " + intValue);
            System.out.println("Double: " + doubleValue);
            System.out.println("String: " + strValue);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
