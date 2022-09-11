package org.easy.shop;

public class Door {
	public boolean isLocked(String key) {
		class Lock{
			public boolean isLocked(String keyy) {
				if(keyy.equals("qwerty")) {
					return false;
				}else {
					return true;
				}
			}
		}
		return new Lock().isLocked(key);
	}

	
}
