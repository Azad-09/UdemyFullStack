package org.easy;

public class Join {
	public int counter = 0;
	
	public static void main(String[] args) {
		Join join = new Join();
		
		Thread thread1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				for(int i = 0; i < 1000; i ++) {
					join.counter ++;
				}
				
			}
		});
		
		Thread thread2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				try {
					thread1.join(4000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				for(int i = 0; i < 499; i ++) {
					join.counter ++;
				}
			}
		});
		
		thread1.start();
		thread2.start();
		
		try {
			thread2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		/*
		 * try { Thread.sleep(200); } catch (InterruptedException e) {
		 * e.printStackTrace(); }
		 */
	
		System.out.println("The value of counter: " + join.counter);
		

	}

}
