package org.easy;

//inheritance is not applicable for Final class
public class B  {
	// setter and constructor is of no use if we use final keyword as we cant change
	// the value of the variable once it is given any particular value
	private final int x = 5;

	// getter
	public int getX() {
		return x;
	}

	// parameterised constructor
	/*
	 * public B(int x) { super(); this.x = x; }
	 */

	
	public void India() {
		System.out.println("Hello India!! What's Up?");
	}

	
	public void USA() {
		System.out.println("Jow Biden is the president");
	}

}
