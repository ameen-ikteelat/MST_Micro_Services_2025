package com.mst.generics.test1;

public class DemoClassTester {
	public static void main(String[] args) {
		DemoClass d = new DemoClass();
		d.<String>genericsMethod("Java Programming");
		d.genericsMethod(25);
	}
}
