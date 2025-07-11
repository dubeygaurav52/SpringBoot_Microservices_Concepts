package in.gaurav.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.gaurav.service.QuoteClient;

@RestController
public class QuoteRestController {

	@Autowired
	private QuoteClient client;
	
	@GetMapping("/quote")
	public String getQuotes() {
		String qoutes=client.invokeRandomeQuoteApi();
		return qoutes;
	}
}
