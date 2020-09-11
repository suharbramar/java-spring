package com.javapoint3;

public class Address {
   private String addressline1,city,state,country;

public Address(String addressline1, String city, String state, String country) {
	super();
	this.addressline1 = addressline1;
	this.city = city;
	this.state = state;
	this.country = country;
}

public String toString() {
	return addressline1 +" "+city+" "+state+" "+country;
}
   
   
}
