package com.springcore.collections.standalone;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.springcore.Student;

public class Emp {
	private int empId;
	private String empName;
	private List<String> empCitys;
	private Set<String> empOccupations;
	private Map<String, String> cources;
	private Properties properties;
	@Autowired
	@Qualifier("Student1")
	private Student student;

	/**
	 * @param empId
	 * @param empName
	 * @param empCitys
	 * @param empOccupations
	 * @param cources
	 * @param properties
	 */
	public Emp(int empId, String empName, List<String> empCitys, Set<String> empOccupations,
			HashMap<String, String> cources, Properties properties, Student student) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empCitys = empCitys;
		this.empOccupations = empOccupations;
		this.cources = cources;
		this.properties = properties;
		this.student= student;
	}

	/**
	 * @return the student
	 */
	public Student getStudent() {
		return student;
	}

	/**
	 * @param student the student to set
	 */
	public void setStudent(Student student) {
		this.student = student;
	}

	/**
	 * @return the properties
	 */
	public Properties getProperties() {
		return properties;
	}

	/**
	 * @param properties the properties to set
	 */
	public void setProperties(Properties properties) {
		this.properties = properties;
	}

	@Override
	public String toString() {
		return "Emp [empId=" + empId + ", empName=" + empName + ", empCitys=" + empCitys + ", empOccupations="
				+ empOccupations + ", cources=" + cources + ", properties=" + properties + ", student=" + student + "]";
	}

	/**
	 * 
	 */
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the empId
	 */
	public int getEmpId() {
		return empId;
	}

	/**
	 * @param empId the empId to set
	 */
	public void setEmpId(int empId) {
		this.empId = empId;
	}

	/**
	 * @return the empName
	 */
	public String getEmpName() {
		return empName;
	}

	/**
	 * @param empName the empName to set
	 */
	public void setEmpName(String empName) {
		this.empName = empName;
	}

	/**
	 * @return the empCitys
	 */
	public List<String> getEmpCitys() {
		return empCitys;
	}

	/**
	 * @param empCitys the empCitys to set
	 */
	public void setEmpCitys(List<String> empCitys) {
		this.empCitys = empCitys;
	}

	/**
	 * @return the empOccupations
	 */
	public Set<String> getEmpOccupations() {
		return empOccupations;
	}

	/**
	 * @param empOccupations the empOccupations to set
	 */
	public void setEmpOccupations(Set<String> empOccupations) {
		this.empOccupations = empOccupations;
	}

	/**
	 * @return the cources
	 */
	public Map<String, String> getCources() {
		return cources;
	}

	/**
	 * @param cources the cources to set
	 */
	public void setCources(Map<String, String> cources) {
		this.cources = cources;
	}

}
