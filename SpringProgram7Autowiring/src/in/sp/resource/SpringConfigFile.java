package in.sp.resource;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.bean.Address;
import in.sp.bean.Student;
import in.sp.bean.Subjects;

@Configuration
public class SpringConfigFile {
@Bean
public Address createAddObj1() {
	Address addr= new Address();
	addr.setCity("Indore");
	addr.setHouseno(182);
	addr.setPincode(452018);
	return addr;
}
@Bean
public Address createAddObj2() {
	Address addr= new Address();
	addr.setCity("Delhi");
	addr.setHouseno(132);
	addr.setPincode(430120);
	return addr;
}
@Bean
public Student creatStdObj() {
	Student std= new Student();
	std.setRollno(12);
	std.setName("Aarohi");
	//std.setAddress(createAddObj1());
	//std.setSubjects(createSubObj());
	return std;
}
@Bean
public Subjects createSubObj() {
	Subjects sub = new Subjects();
	List<String> subject_list = new ArrayList<>();
	subject_list.add("c++");
	subject_list.add("c");
	subject_list.add("python");
	
	sub.setSub(subject_list);
	return sub;
}
}
