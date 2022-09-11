package org.easy;

class Bracket {
	private Object lock = "lock";

	public void generate() {
		// synchronized block
		synchronized (lock) {

			for (int i = 1; i <= 10; i++) {
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				if (i <= 5) {
					System.out.print("[");
				} else {
					System.out.print("]");
				}
			}
			System.out.println();
		}

		for (int j = 0; j <= 10; j++) {
			try {
				Thread.sleep(25);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

/*
 * Syncronized Block:: 
 * Time Requierd: 7999
 */

public class Block {

	public static void main(String[] args) {
		Bracket bracket = new Bracket();
	
		new Thread(new Runnable() {

			@Override
			public void run() {
				long startTime = System.currentTimeMillis();
				for (int i = 0; i <= 5; i++) {
					bracket.generate();
				}
				long endTime = System.currentTimeMillis();
				System.out.println("Time required to end the first loop: " + (endTime - startTime));
			}
		}).start();

		new Thread(new Runnable() {

			@Override
			public void run() {
				long startTime = System.currentTimeMillis();
				for (int i = 0; i <= 5; i++) {
					bracket.generate();
				}
				long endTime = System.currentTimeMillis();
				System.out.println("Time required to end the second loop: " + (endTime - startTime));
			}

		}).start();

	}

}
