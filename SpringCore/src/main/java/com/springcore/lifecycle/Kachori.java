package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Kachori {
	private double price;

	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		System.out.println("Price set for kachori");
		this.price = price;
	}

	@PostConstruct
	public void init() {
		System.out.println("Kachori getting Ready---init");
	}

	@PreDestroy
	private void destroy() {
		System.out.println("Kachori delivered ---- destroy");
	}

	@Override
	public String toString() {
		return "Kachori [price=" + price + "]";
	}

}
