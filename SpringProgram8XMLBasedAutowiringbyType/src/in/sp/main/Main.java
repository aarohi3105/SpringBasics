package in.sp.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.sp.bean.Student;

 

public class Main {

	public static void main(String[] args) {
		String config_file_loc="/in/sp/resources/applicationContext.xml";
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(config_file_loc);
		Student std=(Student)context.getBean("stdId");
		std.display();

	}

}
