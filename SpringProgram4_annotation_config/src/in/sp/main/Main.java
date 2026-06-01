package in.sp.main;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.sp.beans.Student;
import in.sp.resources.SpringConfig;

public class Main {
public static void main(String[]args) {

	ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
	Student s1=(Student)context.getBean("student");
	s1.display();
}
}
