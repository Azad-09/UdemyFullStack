package org.easy;

import java.util.Deque;
import java.util.concurrent.LinkedBlockingDeque;

public class Demo {

	public static void main(String[] args) {
//		Double-Ended Queue that means it is similar to Queue but here we can add and remove the elements from both the ends
		Deque<Integer> dequeue = new LinkedBlockingDeque<Integer>();
		dequeue.offer(1);
		dequeue.offer(2);
		dequeue.offer(3);
		dequeue.offer(4);
		dequeue.offer(5);
		dequeue.offer(6);
		dequeue.offer(7);
		
		for(int elements : dequeue ) {
			System.out.println(elements);
		}
		
		System.out.println("************");
		
//		It will add the element in the Head of the Queue
		dequeue.offerFirst(0);
		
//		It will remove the elements from the Tail which is not possible in Queue
		dequeue.pollLast();
		
		for(int elements : dequeue ) {
			System.out.println(elements);
		}
		
	}
	
	

}
