package in.sp.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student {
private int rollno;
@Autowired
private Subjects subjects;
public void setRollno(int rollno) {
	this.rollno = rollno;
}
public void setName(String name) {
	this.name = name;
}
//public void setAddress(Address address) {
//	this.address = address;
//}
private String name;
@Autowired
@Qualifier("createAddObj1")
private Address address;

public void display() {
	System.out.println("rollno "+ rollno);
	System.out.println("name "+name );
	System.out.println("address"+ address);
	System.out.println("subjects"+ subjects);
}



 }
