package org.easy;

import org.easy.test.TestStatic;

public class App {

	public static void main(String[] args) {
		TestStatic obj1 = new TestStatic();
		System.out.println(obj1.getStaticVariable());
		obj1.setStaticVariable(21);
		System.out.println(obj1.getStaticVariable());
		
		TestStatic obj2 = new TestStatic();
		System.out.println(obj2.getStaticVariable());
		
		
		

	}

}
