package in.sp.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.beans.Student;

@Configuration
public class SpringConfigFile {
@Bean("BeanObj1")
	public Student createBeanObj1() {
		Student std = new Student();
		std.setName("Aarohi");
		std.setRollno("101");
		std.setEmail("aarohi@gamil.com");
		
		return std;
	}
@Bean("BeanObj2")
public Student createBeanObj2() {
	Student std = new Student();
	std.setName("Aadi");
	std.setRollno("102");
	std.setEmail("aadi@gamil.com");
	
	return std;
}

@Bean("BeanObj3")
	public Student createBeanObj3() {
		Student std2= new Student();
		std2.setName("Yash");
		std2.setRollno("103");
		std2.setEmail("yash@gmail.com");
		
		return std2;
	
}
}

