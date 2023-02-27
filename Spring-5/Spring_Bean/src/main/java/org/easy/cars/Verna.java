package org.easy.cars;

import org.easy.Interface.Cars;
import org.easy.Interface.Engine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


public class Verna implements Cars {
	@Autowired
	@Qualifier("v6Engine")
	Engine engine;

	@Override
	public String specs() {
		String details = "Sedan from Hyundai with " + engine.type() ;
		return details;
		
	}

}
