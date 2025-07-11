package in.gaurav.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class WishController {
 
	@GetMapping("/wish")
	public String getWishMsg(Model model) {
		
		model.addAttribute("msg", "God Bless You...!!");
		
		return "index";
	}
}
