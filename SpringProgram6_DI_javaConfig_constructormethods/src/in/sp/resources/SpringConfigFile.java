package in.sp.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.bean.Address;
import in.sp.bean.Student;

@Configuration
public class SpringConfigFile {

	@Bean
	public Address createAddObj() {
		Address address = new Address(182 ,"Indore",452018);
		return address;
		}
	@Bean
	public Student createStdObj() {
		Student std = new Student(12,"Aarohi",createAddObj());
		return std;
	}
	

}
