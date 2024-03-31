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
	@Value("6")
	private int id;
	@Value("#{cityList}")
	private List<String> cities;
	@Autowired
	@Qualifier("std1")
	private Student student2;
	@Value("#{55+67+91}")
	private double marks;
	@Value("#{T(java.lang.Math).sqrt(99)}")
	private double squareroot;
	@Value("#{T(java.lang.Math).E}")
	private float e;
	@Value("#{ new com.springcore.expression.Person() == null}")
	private boolean zflag;

	/**
	 * @return the e
	 */
	public float getE() {
		return e;
	}

	/**
	 * @param e the e to set
	 */
	public void setE(float e) {
		this.e = e;
	}

	/**
	 * @return the flag
	 */
	public boolean isFlag() {
		return zflag;
	}

	/**
	 * @param flag the flag to set
	 */
	public void setFlag(boolean zflag) {
		this.zflag = zflag;
	}

	/**
	 * @return the squareroot
	 */
	public double getSquareroot() {
		return squareroot;
	}

	/**
	 * @param squareroot the squareroot to set
	 */
	public void setSquareroot(double squareroot) {
		this.squareroot = squareroot;
	}

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
		return "Person [id=" + id + ", cities=" + cities + ", student2=" + student2 + ", marks=" + marks
				+ ", squareroot=" + squareroot + ", e=" + e + ", flag=" + zflag + "]";
	}

}
