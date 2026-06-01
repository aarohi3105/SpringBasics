package in.sp.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.sp.beans.Student;

public class Main {
public static void main(String[]args) {
	String resource_file_path = "in/sp/resources/ApplicationContext.xml";
	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(resource_file_path);
	Student s1=(Student)context.getBean("student");
	s1.display();
}
}
