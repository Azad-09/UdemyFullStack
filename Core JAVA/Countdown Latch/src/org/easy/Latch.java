package org.easy;

import java.util.concurrent.CountDownLatch;

class SomeThread extends Thread{
	private CountDownLatch latch;
	
	public SomeThread(CountDownLatch latch) {
		this.latch =latch;
	}
	
	
	@Override
	public void run() {
		System.out.println("Thread running with thread name: " + Thread.currentThread().getName());
		System.out.println("Thread execution completed");
		System.out.println("***************************");
		latch.countDown();
	
	}
}


public class Latch {

	public static void main(String[] args) {
		CountDownLatch latch = new CountDownLatch(3);
		SomeThread someThread1 = new SomeThread(latch);
		SomeThread someThread2 = new SomeThread(latch);
		SomeThread someThread3 = new SomeThread(latch);
		SomeThread someThread4 = new SomeThread(latch);
		
		someThread1.start();
		someThread2.start();
		someThread3.start();
		someThread4.start();
		
		try {
			latch.await();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println("I am in main thread");
		
		

	}

}
