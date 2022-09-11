package org.easy;

class Bracket {
	
	//synchronized method
	synchronized public void generate()  {
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
		
		
		for(int j = 0; j <= 10; j++) {
			try {
				Thread.sleep(25);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

/*
 * //Syncronized Method:: 
 *  Time Requierd: 7894
 */

public class App {

	public static void main(String[] args) {
		Bracket bracket = new Bracket();
		/*
		 * Two Thread running simultanieously and thats the reason it will show random
		 * result we have to use Syncronized Method to solve it
		 */
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				long startTime = System.currentTimeMillis();
				for(int i = 0; i <= 5; i++) {
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
				for(int i = 0; i <= 5; i++) {
					bracket.generate();
				}
				long endTime = System.currentTimeMillis();
				System.out.println("Time required to end the second loop: " + (endTime - startTime));
			}
			
		}).start();
		
		

	}

}
