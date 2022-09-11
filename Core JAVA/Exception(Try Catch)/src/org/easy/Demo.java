package org.easy;

public class Demo {

	public static void main(String[] args) {
		try {
			int x = 10/ 0;
		}catch (RuntimeException e) {
			e.printStackTrace();
		}finally {
			System.out.println("Execution is completed!!");
		}

	}

}
