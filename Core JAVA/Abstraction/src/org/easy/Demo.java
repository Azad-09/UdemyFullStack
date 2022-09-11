package org.easy;

import org.easy.person.Non_Vegan;
import org.easy.person.Person;
import org.easy.person.Vegan;

public class Demo {

	public static void main(String[] args) {
		// Vegan
		Person jhon = new Vegan();
		System.out.println("Jhon can: " + jhon.speak() + "\nand eats: " + jhon.eat() + "\nLive/Alive: " + jhon.breathe() + "\nLife Message: " + jhon.message()+ "\n");
		

		
		// Non-Vegan
		Person shruti = new Non_Vegan();
		System.out.println("Shruti can: " + shruti.speak() + "\nand eats: " + shruti.eat() + "\nLive/Alive: " + shruti.breathe() + "\nLife Message: " + shruti.message());
	}
}
