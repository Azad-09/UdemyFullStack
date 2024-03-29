package org.easy;


import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String world() {
		return "hello";
	}

	@RequestMapping(value = "displayName", method = RequestMethod.GET)
	public String displayName(HttpServletRequest request) {
		String firstName = request.getParameter("firstName");
		request.setAttribute("firstName", firstName);
		return "displayName";
	}
}
