package com.springcore.amb;

public class Addition {
	private int a;
	private int b;

	/**
	 * @param a
	 * @param b
	 */
	public Addition(int a, int b) {
		System.out.println("int : int");
		this.a = a;
		this.b = b;
	}

	/**
	 * @param a
	 * @param b
	 */
	public Addition(double a, double b) {
		System.out.println("double : double");
		this.a = (int) a;
		this.b = (int) b;
	}

	/**
	 * @param a
	 * @param b
	 */
	public Addition(String a, String b) {
		System.out.println("String : String");
		this.a = Integer.parseInt(a);
		this.b = Integer.parseInt(b);
	}

	public void add() {
		int x = a+b;
		System.out.println("Addition =" + x);
	}
}
