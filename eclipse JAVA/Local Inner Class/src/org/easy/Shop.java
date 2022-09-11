package org.easy;

import org.easy.shop.Door;

public class Shop {
	public static void main(String[] args) {
//		Door door = new Door();
//		System.out.println(door.isLocked("qwerty"));

//		Anonymous Object
		if (new Door().isLocked(args[0])) {
			System.out.println("Sorry Shop has closed vist later");
		} else {

			System.out.println("Welcome!! the shop is open");
		}
		
		System.out.println(args[1]);
		System.out.println(args[2]);
		System.out.println(args[3]);
	}
}
