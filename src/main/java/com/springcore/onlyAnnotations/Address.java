package com.springcore.onlyAnnotations;

import org.springframework.beans.factory.annotation.Value;

public class Address {
	@Value("Jamner")
	private String city;
	@Value("445560")
	private int pincode;
	
	private Student student;

	public Address(Student student) {
		super();
		this.student = student;
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

	/**
	 * @return the pincode
	 */
	public int getPincode() {
		return pincode;
	}

	/**
	 * @param pincode the pincode to set
	 */
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", pincode=" + pincode + ", student=" + student + "]";
	}

}
