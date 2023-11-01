package br.com.academy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@GetMapping("/home")
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("home");
		return mv;
	}
}
