package in.sp.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.sp.bean.Student;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(in.sp.resource.SpringConfigFile.class);
        Student std = (Student)context.getBean(Student.class);
        std.display();
	}

}
