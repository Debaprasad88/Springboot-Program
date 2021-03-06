package in.ashokit;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.entity.Employee;
import in.ashokit.entity.Product;
import in.ashokit.repository.EmpRepository;
import in.ashokit.repository.ProductRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
	
	EmpRepository empRepository = context.getBean(EmpRepository.class);
	
	List<Employee> findByEmpName = empRepository.findByEmpName("Deba");
	
	System.out.println(findByEmpName);
	
	List<Employee> findByEmpSal = empRepository.findByEmpSal(15000.00);
	System.out.println(findByEmpSal);
	
	List<Employee> findByEmpNameAndEmpSal = empRepository.findByEmpNameAndEmpSal("Ram", 23000.00);
	System.out.println(findByEmpNameAndEmpSal);
	
	List<Employee> findByEmpSalGreaterThan = empRepository.findByEmpSalGreaterThan(15000.00);
	findByEmpSalGreaterThan.forEach(emp ->{
		System.out.println(emp);
	});
	
	System.out.println("=============================================");
	
	List<Employee> findByEmpNameIn = empRepository.findByEmpNameIn(Arrays.asList("John", "Smith", "Deba"));
	findByEmpNameIn.forEach(emp ->{
		System.out.println(emp);
	});
	
	System.out.println("=============================================");
	
	Double salary = empRepository.findEmpSalByEmpName("Deba");
	System.out.println("Salary ::"+ salary);
	}

}
