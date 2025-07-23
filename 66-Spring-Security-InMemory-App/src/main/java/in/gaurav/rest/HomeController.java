package in.gaurav.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping("/home")
	public String homePage() {
		return "Home page";
	}
	
	@GetMapping("/welcome")
	public String getWelcomePage() {
		return "welcome page";
	}
	
	@GetMapping("/admin")
	public String getAdminPage() {
		return "Admin page";
	}
	
	@GetMapping("/emp")
	public String getEmpPage() {
		return "Employee page";
	}
	
	@GetMapping("/manager")
	public String getManagerPage() {
		return "Manager page";
	}
	
	@GetMapping("/common")
	public String getCommonPage() {
		return "Common page";
	}
	
	@GetMapping("/accessDenied")
	public String getAccessDeniedPage() {
		return "AccessDenied page";
	}
}
