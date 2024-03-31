package com.springcore.expression;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.springcore.steriotype.Student;

@Component("person1")
@Scope("prototype")
public class Person {
	@Value("1")
	private int id;
	@Value("#{cityList}")
	private List<String> cities;
	@Autowired
	@Qualifier("std1")
	private Student student2;
	@Value("#{55+67+91}")
	private double marks;

	/**
	 * @return the marks
	 */
	public double getMarks() {
		return marks;
	}

	/**
	 * @param marks the marks to set
	 */
	public void setMarks(double marks) {
		this.marks = marks;
	}

	/**
	 * @return the student2
	 */
	public Student getStudent2() {
		return student2;
	}

	/**
	 * @param student2 the student2 to set
	 */
	public void setStudent2(Student student2) {
		this.student2 = student2;
	}

	
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
	 * @return the cities
	 */
	public List<String> getCities() {
		return cities;
	}

	/**
	 * @param cities the cities to set
	 */
	public void setCities(List<String> cities) {
		this.cities = cities;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", cities=" + cities + ", student2=" + student2 + "]";
	}

}
