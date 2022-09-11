package org.easy;

import java.util.ArrayList;

class intWrapper {
	private int intValue;

	public intWrapper(int intValue) {
		this.intValue = intValue;
	}

	public int getIntValue() {
		return intValue;
	}

	public void setIntValue(int intValue) {
		this.intValue = intValue;
	}

}

public class App {

	public static void main(String[] args) {
//		We have to use in-built wrapper class of primitive data type "int" which is Integer in order to use ArrayList
		ArrayList<Integer> studentNumber = new ArrayList<Integer>();
		studentNumber.add(24); // Autoboxing
		System.out.println(studentNumber.get(0));  // Unboxing
		
		// Customised Wrapper Class (intWrapper)
		
		ArrayList<intWrapper> numbers = new ArrayList<intWrapper>();
//		we have to create a object in order to add any value 
		numbers.add(new intWrapper(12));  // boxing (done manually)
//		we have to reverse the process "Object to Primitive type"
		System.out.println(numbers.get(0).getIntValue()); // unboxing (done manually)
		
		ArrayList<Double> doubleNumber = new ArrayList<Double>();
		
		doubleNumber.add(Double.valueOf(45));  //boxing
		doubleNumber.add(new Double(54));
		System.out.println(doubleNumber.get(0));
		System.out.println(doubleNumber.get(1));
		
		

	}

}
