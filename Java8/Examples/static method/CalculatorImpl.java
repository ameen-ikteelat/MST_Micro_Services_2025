package com.mst.java8;

public class CalculatorImpl implements Calculator {
	// Implementation of the abstract method
	@Override
	public int add(int a, int b) {
		return a + b;
	}

	public static void main(String[] args) {
		// Using the static method directly on the interface
		int result = Calculator.multiply(3, 4);
		System.out.println("Multiplication result: " + result);

		Calculator c = new CalculatorImpl();
		int x = 10, y = 14;
		int sum = c.add(x, y);
		System.out.println("Sum = " + sum);

		// how to use multiplication ?
		// int mult = c.multiply(x,y);
		int mult = Calculator.multiply(x, y);
		System.out.println("Multiply = " + mult);
	}
}