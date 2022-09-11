package org.easy;

import java.util.concurrent.ArrayBlockingQueue;

class Producer implements Runnable{
	private ArrayBlockingQueue<Integer> queue;
	
	public Producer(ArrayBlockingQueue< Integer> queue) {
		this.queue = queue;
	}

	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(1000);
				queue.put(Block.counter++);
				System.out.println("Value added in the queue: " + Block.counter);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}

class Consumer implements Runnable{
	private ArrayBlockingQueue<Integer> queue;
	
	public Consumer(ArrayBlockingQueue< Integer> queue) {
		this.queue = queue;
	}

	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(2000);
				queue.take();
				Block.counter--;
				System.out.println("Value removed in the queue: " + Block.counter);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}


public class Block {
	
	static int counter = 0;

	public static void main(String[] args) {
		ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<Integer>(10);
		Producer produce = new Producer(queue);
		Thread producerThread = new Thread(produce);
		producerThread.start();
		
		Consumer consumer = new Consumer(queue);
		Thread consumerThread = new Thread(consumer);		
		consumerThread.start();

	}

}
