package in.ashokit.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import in.ashokit.beans.Car;

@Configuration
public class AppConfig {
	public AppConfig() {
		System.out.println("AppCongif Constructor");
	}
@Bean	
public Car getCar() {
	Car car = new Car();
	return car;
}
}
