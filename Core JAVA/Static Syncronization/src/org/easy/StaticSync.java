package org.easy;


class Bracket {
	
	//Static Syncronize
	synchronized static public void generate(String threadCount)  {
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
		System.out.println("Generated by thread: " + threadCount);
		
		
		for(int j = 0; j <= 10; j++) {
			try {
				Thread.sleep(25);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}



public class StaticSync {

	public static void main(String[] args) {
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				long startTime = System.currentTimeMillis();
				for(int i = 0; i <= 5; i++) {
					Bracket.generate("Thread1");
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
					Bracket.generate("Thread2");
				}
				long endTime = System.currentTimeMillis();
				System.out.println("Time required to end the second loop: " + (endTime - startTime));
			}
			
		}).start();
		
		

	}

}