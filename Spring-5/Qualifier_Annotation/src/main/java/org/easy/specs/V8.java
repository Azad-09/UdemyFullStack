package org.easy.specs;

import org.easy.Interface.Engine;
import org.springframework.stereotype.Component;

@Component("v8Engine")
public class V8 implements Engine {

	@Override
	public String type() {
		return "V8 Engine";
	}

}
