package org.easy.cars;

import org.easy.Interface.Cars;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("verna")
public class Verna implements Cars {
	@Autowired
	Engine engine;

	@Override
	public String specs() {
		String details = "Sedan from Hyundai with " + engine.getType() + " engine";
		return details;
		
	}

}
