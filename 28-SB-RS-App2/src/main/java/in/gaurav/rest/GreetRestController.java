package in.gaurav.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest1")
public class GreetRestController {

	@GetMapping("/greet")
	public String getGreetMsg() {
		
		String msg="Good Mornig...!!";
		
		return msg;
	}
	
	@GetMapping("/wish")
	public String getWishMsg() {
		
		String msg="All The Best...!!";
		
		return msg;
	}
}
