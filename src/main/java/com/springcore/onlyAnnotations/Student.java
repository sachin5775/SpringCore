package com.springcore.onlyAnnotations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("getStudent")
public class Student {
	@Value("100")
	private int id;
//private Address address;
	@Value("Sachin")
	private String name;

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}

}
