package com.mst.generics.test1;

public class DemoClass {
	public <T> void genericsMethod(T data) {
		System.out.println("Generics Merhod: " + data.getClass().getName());
		System.out.println("Data Passed: " + data);
	}
}
