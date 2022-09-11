package org.easy.shop;

public class Door {
	Key key = new Key() {
		
		@Override
		public boolean isUnlocked(String keyWord) {
			if(keyWord.equals("qwerty")) {
				return true;
			}else {
				return false;
			}
			
		}
	};

	public Key getKey() {
		return key;
	}
	
	
	
}
