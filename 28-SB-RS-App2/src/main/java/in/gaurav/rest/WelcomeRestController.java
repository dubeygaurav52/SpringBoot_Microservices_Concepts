package in.gaurav.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest2")
public class WelcomeRestController {

	@GetMapping("/welcome")
	public ResponseEntity<String> getWelcomeMsg() {
		
		String msg="Welcome To Universe...!!";
		
		return new ResponseEntity<String>(msg, HttpStatus.OK);
	}
	
//	@GetMapping("/welcome")
//	public String getWelcomeMsg() {
//		
//		String msg="Welcome To Universe...!!";
//		
//		return msg;
//	}
}
