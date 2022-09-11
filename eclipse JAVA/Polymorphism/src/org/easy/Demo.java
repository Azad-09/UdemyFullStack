package org.easy;

import org.easy.phone.Nokia;
import org.easy.phone.Phone;
import org.easy.phone.SamsungNote;

public class Demo {

	public static void main(String[] args) {
		/*
		Phone sams = new SamsungNote("Samsung Note 8");
		System.out.println(sams.getModel());
		sams.features();
		*/
		//
		
		/*
		Phone nokia = new Nokia("Nokia 3310");
		System.out.println(nokia.getModel());
		nokia.features();
		*/
		
		Phone nokia  = new Demo().phone(1);
		System.out.println(nokia.getModel());
		nokia.features();
		//
		
		Phone sams  = new Demo().phone(2);
		System.out.println(sams.getModel());
		sams.features();
	}
	
	public Phone phone(int dailyDriver) {
		switch (dailyDriver) {
		case 1:
			return
			new Nokia("3310");
		case 2:
			return
			new SamsungNote("Note 5");
		}
		
		return null;
		
	}

}
