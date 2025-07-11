package in.gaurav.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserRestController {

	@GetMapping(value = "/user/{userId}")
	public String getName(@PathVariable Integer userId) {
		if (userId==100) {
			return "Raju";
		}else if (userId==101) {
			return "Rani";
		}else {
			return "User Not Found";
		}
	}
}
