package org.easy;

import java.util.Random;

class MyCounter implements Runnable{
	private int threadCount;
	
	public MyCounter(int threadCount) {
		this.threadCount = threadCount;
	}

	@Override
	public void run() {
		Random random = new Random();
		
		try {
			Thread.sleep(random.nextInt(500));
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		for(int i = 0; i <= 9; i++) {
			System.out.println("The value of i is: " + i + " and the thread number is: " + threadCount);
		}
	}
	
	
}

public class App {

	public static void main(String[] args) {
		Thread thread1 = new Thread(new MyCounter(1));
		Thread thread2 = new Thread(new MyCounter(2));
		
		thread1.start();
		System.out.println("***********************************");
		thread2.start();

	}

}
