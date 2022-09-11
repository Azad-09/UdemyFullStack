package org.easy.demo;

public class Outer {
	
	private static int testVariable = 5;
	
	public static void testOuterMethod() {
		System.out.println("Value of the inner class variable: " + Inner.innerVariable);
		Inner.staticInnerMethod();
	}
	
	public static class Inner{
		public static int innerVariable = 1;
		public static void staticInnerMethod() {
			System.out.println("Testing the inner class method");
//			not a good practise
//			System.out.println("Testing outer variable: " + new Outer().testVariable);
//			System.out.println("Testing outer variable: " + testVariable );
//			
//			testOuterMethod();
		}
	}

}
