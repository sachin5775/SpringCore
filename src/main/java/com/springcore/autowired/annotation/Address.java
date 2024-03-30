package com.springcore.autowired.annotation;

public class Address {
private String street;
private String city;

/**
 * 
 */
public Address() {
	super();
}
/**
 * @param street
 * @param city
 */
public Address(String street, String city) {
	super();
	this.street = street;
	this.city = city;
}
@Override
public String toString() {
	return "Address [street=" + street + ", city=" + city + "]";
}
/**
 * @return the street
 */
public String getStreet() {
	return street;
}
/**
 * @param street the street to set
 */
public void setStreet(String street) {
	this.street = street;
}
/**
 * @return the city
 */
public String getCity() {
	return city;
}
/**
 * @param city the city to set
 */
public void setCity(String city) {
	this.city = city;
}

}
