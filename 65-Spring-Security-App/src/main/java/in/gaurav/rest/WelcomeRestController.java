package in.gaurav.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController {

	@GetMapping("/welcome")
	public String welcome() {
		String msg="Welcome to the world of coding!!";
		return msg;
	}
}
