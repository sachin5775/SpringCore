package com.springcore.steriotype;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("std")
public class Student {
	@Value("23")
	private int studentId;
	@Value("Sachin")
	private String studentNAme;
	@Value("Pune")
	private String city;

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentNAme=" + studentNAme + ", city=" + city + "]";
	}

	/**
	 * @return the studentId
	 */
	public int getStudentId() {
		return studentId;
	}

	/**
	 * @param studentId the studentId to set
	 */
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	/**
	 * @return the studentNAme
	 */
	public String getStudentNAme() {
		return studentNAme;
	}

	/**
	 * @param studentNAme the studentNAme to set
	 */
	public void setStudentNAme(String studentNAme) {
		this.studentNAme = studentNAme;
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
