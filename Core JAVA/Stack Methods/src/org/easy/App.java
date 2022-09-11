package org.easy;

import java.util.Stack;

public class App {

	public static void main(String[] args) {

		Stack<Integer> number = new Stack<Integer>();

		number.push(9);
		number.push(18);
		number.push(27);
		number.push(36);
		number.push(45);
		number.push(54);
		number.push(63);
		// pop will remove the last element of the list (Last In First Out)

		for (int numb : number) {
			System.out.println(numb);
		}

		number.pop();

		System.out.println("********");
		for (int numb : number) {
			System.out.println(numb);
		}
		System.out.println("********");
//		peak will only help to show the last element of the list 
		System.out.println("last number in the list: " + number.peek());
//		search will show "-1" if the value we enter is not available in the list
		System.out.println("Is the number 45 is available: " + number.search(12));

		if (number.search(45) == -1) {
			System.out.println("This number is not available :)");
		} else {
			System.out.println("Yes you are in the same path!! the number is available");
			System.out.println(number.search(45));
		}
		System.out.println("******");
//		"isEmpty" is always return the Boolean value
		if (number.isEmpty()) {
			System.out.println("This Stack list is empty!!");
		} else {
			System.out.println("Stack is not empty!! elements are available");
		}
	}

}
