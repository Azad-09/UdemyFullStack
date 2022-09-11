package org.easy;

import org.easy.shop.Door;

public class Shop {
	public static void main(String[] args) {
		Door door = new Door();
//		System.out.println(door.getKey().isUnlocked("qwerty"));
		
		if(door.getKey().isUnlocked(args [0])) {
			System.out.println("Welcome!! we are open :) ");
		}else {
			System.out.println("Sorry!! Shop is closed, visit later ");
		}
		
		System.out.println(args [1]);
		System.out.println(args [2]);
		System.out.println(args [3]);
		System.out.println(args [4]);
//		System.out.println(args [5]);
	}
}
