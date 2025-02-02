package com.mst.threads;

public class IsAlive {

	public static void main(String[] args) throws InterruptedException {

		RunnableJob runnableJob = new RunnableJob();
		Thread thread = new Thread(runnableJob);

		displayStateAndIsAlive(thread); //F
		thread.start();
		displayStateAndIsAlive(thread);//T
		Thread.sleep(1000);//main
		displayStateAndIsAlive(Thread.currentThread());
		displayStateAndIsAlive(thread);
	}

	public static void displayStateAndIsAlive(Thread thread) {
		// java.lang.Thread.State can be NEW, RUNNABLE, BLOCKED, WAITING, TIMED_WAITING, TERMINATED
		System.out.println("Name:" + thread.getName());
		System.out.println("State:" + thread.getState());
		System.out.println("Is alive?:" + thread.isAlive());
	}
}
