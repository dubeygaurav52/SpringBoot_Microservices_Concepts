package in.gaurav.controller;

import java.time.LocalDate;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DateController {

	@GetMapping("/date")
	public ModelAndView displayTodaysDate() {
		ModelAndView mav=new ModelAndView();
		LocalDate d=LocalDate.now();
		
		mav.addObject("msg", "Today's Date :"+d);
		mav.setViewName("index");
		
		return mav;
	}
}
