package org.easy;

import org.easy.Interface.Cars;
import org.easy.cars.Fortuner;
import org.easy.cars.Verna;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	public static void main(String[] args) {
		
		Cars hyundai = new Verna();
		Cars toyota = new Fortuner();
		
		System.out.println(hyundai.specs());
		System.out.println(toyota.specs());
		
		AnnotationConfigApplicationContext context = new 
				AnnotationConfigApplicationContext(AppConfig.class);
		
		Cars desiredCar = context.getBean("fortuner",Cars.class);
		System.out.println(desiredCar.specs());
		context.close();
	}

}
