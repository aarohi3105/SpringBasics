package in.sp.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student 
{
@Value("Aarohi")	
private String name;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getRollno() {
	return rollno;
}
public void setRollno(String rollno) {
	this.rollno = rollno;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
@Value("102")
private String rollno;
@Value("aarohi@gmail.com")
private String email;

public void display() {
	System.out.println("name : "+name);
	System.out.println("rollno : "+rollno);
	System.out.println("email : "+email);
}
}
