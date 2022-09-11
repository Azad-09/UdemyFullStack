package org.easy;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class SomeThread extends Thread{
	private String name;
	
	public SomeThread(String name) {
		this.name = name;
	}
	
	@Override
	public void run() {
		System.out.println("Starting Thread: " + name );
		
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("End Thread: " + name);
	}
}



public class Pool {
	

	public static void main(String[] args) {
		
		ExecutorService executorService =  Executors.newFixedThreadPool(3);
		
		SomeThread someThread1 = new SomeThread("Thread 1");
		SomeThread someThread2 = new SomeThread("Thread 2");
		SomeThread someThread3 = new SomeThread("Thread 3");
		SomeThread someThread4 = new SomeThread("Thread 4");
		SomeThread someThread5 = new SomeThread("Thread 5");
		SomeThread someThread6 = new SomeThread("Thread 6");
		SomeThread someThread7 = new SomeThread("Thread 7");
		SomeThread someThread8 = new SomeThread("Thread 8");
		SomeThread someThread9 = new SomeThread("Thread 9");
		SomeThread someThread10 = new SomeThread("Thread 10");
		
		executorService.execute(someThread1);
		executorService.execute(someThread2);
		executorService.execute(someThread3);
		executorService.execute(someThread4);
		executorService.execute(someThread5);
		executorService.execute(someThread6);
		executorService.execute(someThread7);
		executorService.execute(someThread8);
		executorService.execute(someThread9);
		executorService.execute(someThread10);
		
		executorService.shutdown();
		
	}

}
