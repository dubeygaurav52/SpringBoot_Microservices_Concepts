package in.gauravit;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(Application.class, args);
		
		ApplicationRunner applicationRunner=(obj)->{
			System.out.println("I am From Runner");
		};
		applicationRunner.run(null);
	}

}
