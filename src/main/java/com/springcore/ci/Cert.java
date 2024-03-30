package com.springcore.ci;

public class Cert {
	private String certificate;

	/**
	 * @param certificate
	 */
	public Cert(String certificate) {
		super();
		this.certificate = certificate;
	}

	public String getCertificate() {
		return certificate;
	}

	@Override
	public String toString() {
		return this.certificate;
	}

}
