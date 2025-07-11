package in.gauravit.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.gauravit.utils.Car;

@Configuration
public class AppConfig {

	public AppConfig() {
		System.out.println("AppConfig::Constructor");
	}

	@Bean
	public Car getCar() {
		Car car=new Car();
		return car;
	}
}
