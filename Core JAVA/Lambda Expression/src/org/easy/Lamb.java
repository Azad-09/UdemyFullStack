package org.easy;

//functional interface consist of 1 method (Lambda expression is applicable for this Interface)
interface Lambda{
	public void demo();
//	public void radhe();
}

public class Lamb {
	

	public static void main(String[] args) {
		Lambda lambda = ()->{
			System.out.println("Bolo Haleluyah!!");
			System.out.println("Radhe Shyam");
		};
		
		lambda.demo();
		
		Thread thread = new Thread(()->{
			System.out.println("Runnable Interface is running inside the thread");
			System.out.println("Adding multiple statmenet");
		});
		
		thread.start();
	}
	

}
