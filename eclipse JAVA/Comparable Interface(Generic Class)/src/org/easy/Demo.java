package org.easy;

class Data<T extends Comparable<T>> implements Comparable<T> {
	private T myVariable;

	public Data(T myVariable) {
		this.myVariable = myVariable;
	}

	public T getMyVariable() {
		return myVariable;
	}

	@Override
	public String toString() {
		return "Variable: " + myVariable;
	}

	@Override
	public int compareTo(T object) {

		return myVariable.compareTo(object);
//		return object.compareTo(myVariable);
	}

}

public class Demo {

	public static void main(String[] args) {
		Data<Integer> data = new Data<Integer>(12);
		System.out.println(data);

		System.out.println(data.compareTo(13));
	}

}
