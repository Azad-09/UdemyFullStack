package org.easy.specs;

import org.easy.Interface.Engine;


public class EngineType implements Engine {

	public String type;
	
	//Constructors
	//Default
	public EngineType() {
		type = "Unknown";
	}
	
	//Parameterized
	public EngineType(String type) {
		this.type = type;
	}


	@Override
	public String type() {
		return type;
	}

}
