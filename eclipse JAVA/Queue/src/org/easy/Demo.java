package org.easy;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Demo {

	public static void main(String[] args) {
//		In LinkedBlockingQueue we can add as much as element we want
//		In ArrayBlockingQueue we have to mention the length of the Queue
//		In Queue we can use add(), remove(), element() but it will throw exception so in place of all this method we can use offer(), poll(), peek()
		Queue<Integer> queue = new ArrayBlockingQueue<Integer>(4);

//		queue.remove();    // we have to handle the exception as we are using the remove() or else it will not run

		queue.poll();

		try {
			queue.add(1);
			queue.add(2);
			queue.add(3);
			queue.add(4);
			queue.add(5);
			queue.add(6);
		} catch (IllegalStateException e) {
			System.out.println("You have used the add() and the length of the ArrayBlockQueue is 4");
		}
		
		queue.poll();
		for (int integer : queue) {
			System.out.println(integer);
		}
		
		// It will throw exception if there is no element in the queue
//		System.out.println("\nFirst element in the queue is: " +queue.element());
		System.out.println("\nFirst element in the queue is: " +queue.peek());

	}

}
