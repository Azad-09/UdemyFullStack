package org.easy;

import org.easy.Interface.Cars;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class App {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new 
				AnnotationConfigApplicationContext(AppConfig.class);
		
		Cars desiredCar = context.getBean("verna",Cars.class);
		System.out.println(desiredCar.specs());
		context.close();
	}

}
