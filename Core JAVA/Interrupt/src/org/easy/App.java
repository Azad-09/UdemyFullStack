package org.easy;

public class App {
	public static int balance = 0;

	public void withdraw(int amount) {

		synchronized (this) {

			if (balance <= 0) {
				System.out.println("Waiting for balance updation");
				try {
					wait();
				} catch (InterruptedException e) {
					System.out.println("Original balance: " + balance);
					System.out.println("Withdrawal amount: " + amount);
					balance -= amount;
					System.out.println("Withdrawal Successfuland the current balance is: " + balance);
					
				}
			}
		}

		

	}

	public void deposit(int amount) {
		System.out.println("We are depositing the amount " + amount);
		balance += amount;
		
		
		
	}

	public static void main(String[] args) {
		App app = new App();

		Thread thread1 = new Thread(new Runnable() {

			@Override
			public void run() {
				app.withdraw(1000);

			}
		});

		thread1.start();

		Thread thread2 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				app.deposit(2000);
				thread1.interrupt();
			}
		});

		thread2.start();

	}
}
