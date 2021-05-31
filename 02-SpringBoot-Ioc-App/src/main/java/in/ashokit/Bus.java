package in.ashokit;

import org.springframework.context.annotation.Bean;
import in.ashokit.beans.*;

public class Bus {
	public Bus() {
		System.out.println("Bus Constructor");
	}
	
	@Bean
	public Car getCar() {
		Car car = new Car();
		
	return car;
	}
		}

