package org.easy;

import org.easy.cars.Fortuner;
import org.easy.cars.Verna;
import org.easy.specs.V6;
import org.easy.specs.V8;
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
	
	@Bean("v6Engine")
	public V6 v6() {
		return new V6();
	}
	
	@Bean("v8Engine")
	public V8 v8() {
		return new V8();
	}
}
