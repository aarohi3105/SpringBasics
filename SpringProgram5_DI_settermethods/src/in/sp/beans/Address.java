package in.sp.beans;

public class Address {
private int houseno;
private String name;
private int pincode;
public void setHouseno(int houseno) {
	System.out.println("setter method of houseno");
	this.houseno = houseno;
}
public void setName(String name) {
	System.out.println("setter method of nameofcity");
	this.name = name;
}
public void setPincode(int pincode) {
	System.out.println("setter method of pincode");
	this.pincode = pincode;
}
@Override
public String toString() {
	return "#"+houseno+", "+name+ "- "+pincode ;
}

}
