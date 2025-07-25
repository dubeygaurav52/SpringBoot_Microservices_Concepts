package in.gaurav.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//@RequestMapping("/library")
public class BookController {


	@GetMapping("/bookdata")
	public String getBookData(Model model) {
		
		model.addAttribute("name", "Spring Boot");
		model.addAttribute("author", "Rod Johnson");
		model.addAttribute("price", 450.00);
		
		return "book-data";
	}
}
