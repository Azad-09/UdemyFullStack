package org.easy;

public class App {
	public static int counter = 0;

	public static void main(String[] args) throws InterruptedException {

		Thread thread1 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 1; i <= 1000; i++) {
					counter++;
				}
				System.out.println("End of loop1");

			}
		});

		Thread thread2 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i <= 1000; i++) {
					counter++;
				}
				System.out.println("End of loop2");
			}
		});

		thread1.start();
		thread2.start();
		Thread.sleep(2000);
		System.out.println("The value of counter is: " + counter);

	}

}
