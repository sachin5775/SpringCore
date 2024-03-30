package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
/**
 * Spring Bean lyfecycle with Interface 
 * @author mq2l44s
 *
 */
public class Pepsi implements InitializingBean,DisposableBean {
private int price;

/**
 * @return the price
 */
public int getPrice() {
	return price;
}

@Override
public String toString() {
	return "Pepsi [price=" + price + "]";
}

/**
 * @param price the price to set
 */
public void setPrice(int price) {
	System.out.println("Price Set for Pepsi");
	this.price = price;
}

@Override
public void destroy() throws Exception {
System.out.println("Pepsi delivered-- destroy");	
}

@Override
public void afterPropertiesSet() throws Exception {
System.out.println("Pepsi getting Ready--init");	
}

}
