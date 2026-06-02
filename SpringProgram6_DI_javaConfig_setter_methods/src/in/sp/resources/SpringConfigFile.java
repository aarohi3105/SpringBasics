package in.sp.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.bean.Address;
import in.sp.bean.Student;

@Configuration
public class SpringConfigFile {

	@Bean
	public Address createAddObj() {
		Address address = new Address();
		address.setHouseno(182);
		address.setCity("Indore");
		address.setPincode(452018);
		return address;
	}
	@Bean
	public Student createStdObj() {
		Student std = new Student();
		std.setName("Aarohi");
		std.setRollno(12);
		std.setAddress(createAddObj());
		return std;
	}
	
}
