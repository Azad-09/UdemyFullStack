package org.easy.cars;

import org.easy.Interface.Cars;
import org.springframework.stereotype.Component;

@Component("fortuner")
public class Fortuner implements Cars {

	@Override
	public String specs() {
		return "SUV from Toyota";
	}

}
