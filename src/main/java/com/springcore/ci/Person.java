package com.springcore.ci;

public class Person {
	private String name;
	private int personId;
	private Cert cert;

	/**
	 * @param name
	 * @param personId
	 * @param cert
	 */
	public Person(String name, int personId) {
		super();
		this.name = name;
		this.personId = personId;
	}

	/**
	 * @return the cert
	 */
	public Cert getCert() {
		return cert;
	}

	/**
	 * @param cert the cert to set
	 */
	public void setCert(Cert cert) {
		this.cert = cert;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", personId=" + personId + ", cert=" + cert + "]";
	}

}
