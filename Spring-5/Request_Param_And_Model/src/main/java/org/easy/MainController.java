package org.easy;




import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String world() {
		return "hello";
	}

	//@RequestParam is used get the parameter and store in a variable and model is used to set the attribute
	@RequestMapping(value = "displayname", method = RequestMethod.GET)
	public String displayName(@RequestParam("firstName") String firstName, Model model ) {
		model.addAttribute("name", firstName);
		return "displayName";
	}
}
