package com.mst.threads;

import java.io.IOException;

public class ProcessExample {
    public static void main(String[] args) {
        ProcessBuilder processBuilder = new ProcessBuilder("notepad.exe");

        try {
            Process process = processBuilder.start();
            // Wait for the process to complete
            process.waitFor();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}