package in.sp.bean;

public class Address {
private int houseno;
public void setHouseno(int houseno) {
	this.houseno = houseno;
}
public void setCity(String city) {
	this.city = city;
}
public void setPincode(int pincode) {
	this.pincode = pincode;
}
private String city;
private int pincode;

public String toString() {
	return "#"+houseno+", "+city+" "+pincode;
}
}
