package org.easy;

import org.easy.shop.Door;
import org.easy.shop.Door.Lock;

public class Shop {

	public static void main(String[] args) {
		Door door = new Door();
		door.shopStatus();
		System.out.println();
		door.getLock().setLock(false);
		door.shopStatus();

	}

}
