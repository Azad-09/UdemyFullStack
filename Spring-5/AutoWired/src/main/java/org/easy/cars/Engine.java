package org.easy.cars;

import org.springframework.stereotype.Component;

@Component("engine")
public class Engine {
	 String type ;

	public Engine() {
		this.type = "V8";
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	
}
