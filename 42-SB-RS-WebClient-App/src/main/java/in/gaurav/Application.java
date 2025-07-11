package in.gaurav;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import in.gaurav.service.RestClientService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	 @Bean
	    CommandLineRunner run(RestClientService service) {
	        return args -> {
	            service.fetchJsonPlaceholderPosts();
	            service.fetchReqresUsers();
	            service.fetchDummyJsonProducts();
	            service.fetchFakeStoreProducts();
	            service.postToHttpBin();
	        };
	    }
}
