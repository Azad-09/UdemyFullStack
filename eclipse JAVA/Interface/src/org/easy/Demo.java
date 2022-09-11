package org.easy;

import org.easy.phone.OnePlus5;
import org.easy.phone.Phone;
import org.easy.phone.iPhoneSE;

public class Demo {

	public static void main(String[] args) {
		
		// OnePlus
		Phone onePlus5 = new OnePlus5();
		System.out.println("Processor: " + onePlus5.processor() + " || Operating Systems: " + onePlus5.OS()
				+ " || Memory Space: " + onePlus5.space());

		//iPhone

		Phone iPhone = new iPhoneSE();
		System.out.println("Processor: " + iPhone.processor() + " || Operating Systems: " + iPhone.OS() + " || Memory Space: "
				+ iPhone.space());
	}

}
