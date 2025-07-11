package in.gaurav.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.gaurav.client.GreetClient;

@RestController
public class WelcomeRestController {

	@Autowired
	private GreetClient client;
	
	
	@GetMapping("/welcome")
	public String welcome() {
		String welcomeMsg="Welcome to Ashok It!!!";
		String greetMsg=client.invokeGreetApi();
	
		return greetMsg+" "+welcomeMsg;
		
	}
}
