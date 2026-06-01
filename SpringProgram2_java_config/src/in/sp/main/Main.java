package in.sp.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.sp.beans.Student;
import in.sp.resources.SpringConfigFile;

public class Main {
	public static void main(String args[]) {
AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);
//Student std =(Student)context.getBean("stdId1");
//std.display();
//Student std = context.getBean(Student.class);
//std.display();
Student std= (Student) context.getBean("BeanObj1");
Student std1= (Student) context.getBean("BeanObj2");
Student std2=(Student)context.getBean("BeanObj3");
std.display();
std1.display();
std2.display();
}
}
