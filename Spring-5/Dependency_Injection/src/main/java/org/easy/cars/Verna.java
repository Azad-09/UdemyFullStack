package org.easy.cars;

import org.easy.Interface.Cars;
import org.springframework.stereotype.Component;

@Component("verna")
public class Verna implements Cars {
	
	

	@Override
	public String specs() {
		return "Sedan from Hyundai";
	}

}
