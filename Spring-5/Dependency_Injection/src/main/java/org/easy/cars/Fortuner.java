package org.easy.cars;

import org.easy.Interface.Cars;
import org.springframework.stereotype.Component;

@Component("fortuner")
public class Fortuner implements Cars {

	@Override
	public String specs() {
		// TODO Auto-generated method stub
		return "SUV from Toyota";
	}

}
