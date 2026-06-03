package in.sp.beans;

public class Address {
private int houseno;
private String name;
private int pincode;

public Address(int houseno , String name , int pincode) 
{
	this.houseno =houseno;
	this.name=name;
	this.pincode=pincode;
	}

@Override
public String toString() {
	return "#"+houseno+", "+name+ "- "+pincode ;
}

}
