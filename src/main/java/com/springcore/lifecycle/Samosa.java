package com.springcore.lifecycle;
/**
 * Spring Bean lyfecycle with xml 
 * @author mq2l44s
 *
 */
public class Samosa {
private double price;

/**
 * @param price
 */
public Samosa(double price) {
	System.out.println("Price Set");
	this.price = price;
}

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
	this.price = price;
}

@Override
public String toString() {
	return "Samosa [price=" + price + "]";
}
public void init() {
	System.out.println("Samosa getting Ready-- init");
}
public void destroy() {
	System.out.println("Samosa  delivered-- destroy");
}
}
