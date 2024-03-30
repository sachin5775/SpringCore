package com.springcore.autowired.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
	@Autowired
	@Qualifier("address3")
	private Address address2;

	/**
	 * @return the address1
	 */
	public Address getAddress() {
		return address2;
	}

	public void setAddress2(Address address2) {
		System.out.println("Setter called");
		this.address2 = address2;
	}

	/**
	 * @param address2
	 */
	
	public Employee(Address address2) {
		super();
		System.out.println("Constructor called");
		this.address2 = address2;
	}

	/**
	 * 
	 */
	public Employee() {
		super();
	}

	@Override
	public String toString() {
		return "Employee [address2=" + address2 + "]";
	}

}