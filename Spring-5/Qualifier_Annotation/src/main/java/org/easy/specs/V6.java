package org.easy.specs;

import org.easy.Interface.Engine;
import org.springframework.stereotype.Component;

@Component("v6Engine")
public class V6 implements Engine {

	@Override
	public String type() {
		return "V6 Engine";
	}

}
