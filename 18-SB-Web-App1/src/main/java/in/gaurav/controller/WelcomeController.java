package in.gaurav.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {

	
	@GetMapping("/welcome")
	public ModelAndView displayWelcomeMsg() {
		ModelAndView mav=new ModelAndView();
		
		mav.addObject("msg", "Welcome to spring Web MVC....!!");
		mav.setViewName("index");
		
		
		return mav;
	}
	
	//@GetMapping("/greet")
	@RequestMapping(value = "/greet",method = RequestMethod.GET)
	public ModelAndView displayGreetMsg() {
		ModelAndView mav=new ModelAndView();
		
		mav.addObject("msg", "Good Morning....!!");
		mav.setViewName("index");
		
		
		return mav;
	}
}
