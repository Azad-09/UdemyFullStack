package org.easy;

import org.easy.cars.Fortuner;
import org.easy.cars.Verna;
import org.easy.specs.EngineType;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("org.easy")
public class AppConfig {
	
	@Bean("fortuner")
	public Fortuner fortuner() {
		return new Fortuner();
	}
	
	@Bean("verna")
	public Verna verna() {
		return new Verna();
	}
	
	@Bean("engineType")
	public EngineType v6() {
//		return new EngineType(); //default constructor
		return new EngineType("V8 engine");  //Constructor Injection of String
	}
	
	
}
