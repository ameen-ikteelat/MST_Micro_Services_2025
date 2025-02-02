package com.mst.threads;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.nio.file.Path;


class FileDownloader extends Thread {
    private String url;
    private String destinationPath;

    public FileDownloader(String url, String destinationPath) {
        this.url = url;
        this.destinationPath = destinationPath;
    }

    public void run() {
        System.out.println("Downloading file from " + url);
        try {
            // Open a connection to the URL
            URL urlObj = new URL(url);
            Path destinationFile = getDestinationFilePath();
            try (InputStream inputStream = urlObj.openStream();
                 OutputStream outputStream = new FileOutputStream(destinationFile.toFile())) {
                // Buffer for reading and writing
                byte[] buffer = new byte[4096];
                int bytesRead;
                // Read and write the file content
                while ((bytesRead = inputStream.read(buffer)) != -1) {
                	System.out.println("Downloading data for file " + url);
                    outputStream.write(buffer, 0, bytesRead);
                }
            }

        } catch (IOException e) {
            System.err.println("Error downloading file from " + url + ": " + e.getMessage());
        }

        System.out.println("Download from " + url + " complete. File saved at: " + destinationPath + "\n");
    }

    private Path getDestinationFilePath() {
        // Extracts the file name from the URL and constructs the full path
        return Path.of(destinationPath, getFileName(url));
    }

    private String getFileName(String url) {
        // Extracts the file name from the URL
        return url.substring(url.lastIndexOf('/') + 1);
    }
}

public class MultiThreadFileDownloader {
    public static void main(String[] args) {
        // URLs of files to download concurrently
        String[] fileUrls = {
                "https://www.rcsdk12.org/cms/lib/NY01001156/Centricity/Domain/4951/Head_First_Java_Second_Edition.pdf",
                "https://www.tutorialspoint.com/java/java_tutorial.pdf",
                "https://pepa.holla.cz/wp-content/uploads/2016/10/microservices-for-java-developers.pdf"
        };

        // Destination path to save downloaded files
        String destinationPath = "C:\\Users\\Ameen\\Downloads\\JavaBooks";

        // Create and start a thread for each file URL
        for (String fileUrl : fileUrls) {
            FileDownloader downloader = new FileDownloader(fileUrl, destinationPath);
            downloader.start();
        }
    }
}
