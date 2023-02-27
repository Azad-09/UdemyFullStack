package org.easy;




import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String world() {
		return "hello";
	}

	//We can use @GetMapping instead of @RequestMapping if we want to use GET method 
	@GetMapping("displayname")
	public ModelAndView displayName(@RequestParam("firstName") String firstName ) {
		ModelAndView modelAndView = new ModelAndView("displayName");
		
		Date date = new Date();
		
		List<String> names = new ArrayList<String>();
		names.add("Azad");
		names.add("Ankit");
		names.add("Aishwarya");
		
		modelAndView.addObject("name", firstName);
		modelAndView.addObject("date", date);
		modelAndView.addObject("team", names);
		return modelAndView;
	}
}
