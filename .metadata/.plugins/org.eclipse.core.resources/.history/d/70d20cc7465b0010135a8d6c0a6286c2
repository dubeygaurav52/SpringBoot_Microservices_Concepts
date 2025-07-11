package in.gaurav.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class QuoteClient {

	public String invokeRandomeQuoteApi() {
		
		String apiUrl="https://www.blindtextgenerator.com/lorem-ipsum";
		
		RestTemplate rt=new RestTemplate();
		ResponseEntity<String> forEntity = rt.getForEntity(apiUrl, String.class);
		
		@SuppressWarnings("deprecation")
		int statusCode = forEntity.getStatusCodeValue();
		
		if (statusCode==200) {
			String body = forEntity.getBody();
			return body;
		}
		return null;
	}
}
