package com.mst.threads;

public class DaemonThreadExample {
    public static void main(String[] args) {
        Thread daemonThread = new Thread(() -> {
        	int i = 1;
            while (true) {
                System.out.println("Daemon thread is running #" + i++);
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                	System.err.println("Daemon interrupted!");
                    e.printStackTrace();
                } catch (Exception e) {
                	e.printStackTrace();
                }
            }
        });

        // Add a shutdown hook
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            System.out.println("Shutdown hook is running.");
            // Perform any necessary cleanup here
        }));    	
    	

        daemonThread.setDaemon(true);
        daemonThread.start();

        // Main thread
        try {
			Thread.sleep(1000);
            daemonThread.interrupt();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        System.out.println("Main thread is finished.");
    }
}