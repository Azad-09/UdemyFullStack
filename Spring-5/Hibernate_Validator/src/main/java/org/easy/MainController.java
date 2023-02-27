package org.easy;




import java.util.HashMap;
import java.util.Map;

import javax.validation.Valid;

import org.easy.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
	
	@GetMapping("/")
	public ModelAndView home() {
		ModelAndView modelAndView = new ModelAndView("userFormView");
		
		User user = new User();
		
		Map<String, String> genderMap = new HashMap<String, String>();
		genderMap.put("Male", "Male");
		genderMap.put("Female", "Female");
		
		Map<String, String> countryMap = new HashMap<String, String>();
		countryMap.put("India", "India");
		countryMap.put("UK", "England");
		countryMap.put("USA", "America");
		countryMap.put("Syria", "Persia");
		
		modelAndView.addObject("genderMap", genderMap);
		modelAndView.addObject("user", user);
		modelAndView.addObject("countryMap", countryMap );
		return modelAndView;
	}

	@PostMapping("/displayUserInfo")
	public ModelAndView displayUserInfo(@ModelAttribute @Valid User user, BindingResult result) {
		ModelAndView modelAndView = new ModelAndView("displayUserInfo");
		modelAndView.addObject("user", user);
		if (result.hasErrors()) {
			System.out.println("Have some errors!!");
		}
		return modelAndView;
		
	}
}
