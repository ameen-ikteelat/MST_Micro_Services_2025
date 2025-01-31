package com.mst.iostream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputOutputStreamExample {
	public static void main(String[] args) {
		// Use try-with-resources to ensure streams are closed automatically
		//TODO : what happens if the output file already exists!? we just override it!
		try (FileInputStream fis = new FileInputStream("catwithtoy.JPG");
			FileOutputStream fos = new FileOutputStream("catwithtoy_COPY.JPG")) {
			int byteData;
			// Read the file byte by byte
			while ((byteData = fis.read()) != -1) {
				// Write each byte to the output file
				fos.write(byteData);
			}

			System.out.println("File copied successfully.");

		} catch (IOException e) {
			// Handle any I/O errors
			e.printStackTrace();
		}
	}
}
