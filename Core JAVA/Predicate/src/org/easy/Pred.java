package org.easy;

import java.util.function.IntPredicate;

public class Pred {

	public static void main(String[] args) {
		
		/*
		 * //Predicate is a Functional Interface which consist of test() method
		 * IntPredicate lessThan18 = new IntPredicate() {
		 * 
		 * @Override public boolean test(int value) { if (value > 18) { return true; }
		 * else { return false; }
		 * 
		 * } };
		 */
		
		IntPredicate lessThan18 = (value) -> value < 18;
		IntPredicate moreThan10 = (value) -> value > 10;
				
		// using and() and or() operator in order to check the Predicate
		System.out.println(lessThan18.or(moreThan10).test(19));
		
		
		//System.out.println(moreThan10.test(11));
		
		new Pred().demo(20, lessThan18, moreThan10);

	}
	
	public void demo(int x, IntPredicate lessThan18, IntPredicate moreThan10) {
		if(lessThan18.and(moreThan10).test(x)) {
			System.out.println("The input is less than 18 and more than 10");
		}else {
			System.out.println("Invalid Input!!");
		}
	}

}
