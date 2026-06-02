package in.sp.Main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.sp.bean.Student;
import in.sp.resources.SpringConfigFile;

public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);
        Student std = (Student)context.getBean(Student.class);
        std.display();
	}

}
