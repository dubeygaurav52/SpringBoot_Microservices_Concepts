package in.gaurav.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import in.gaurav.binding.User;
import jakarta.validation.Valid;

@Controller
public class UserController {

	@GetMapping("/user-form")
	public String loadUserForm(Model model) {
		
		User user=new User();
		model.addAttribute("user", user);
		
		
		return "index";
	}
	
	@PostMapping("/saveUser")
	public String saveUser(@Valid User user,BindingResult result,Model model) {
		if (result.hasErrors()) {
			return "index";
		}
		System.out.println(user);
		model.addAttribute("msg", "User Saved successfully");
		
		
		return "dashboard";
	}
}
