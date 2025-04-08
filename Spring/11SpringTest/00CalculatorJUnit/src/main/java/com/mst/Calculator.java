package com.mst;

public class Calculator {
	
	public int add ( int a , int b) {return a+b;}
	public int sub (int a, int b) {if(a>b) return a-b;else return b-a;}
	public int mul ( int a , int b) {return a*b;}
	
	public int divide(int a, int b) throws IllegalArgumentException {
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed");
        }
        return a / b;
    }
	
}
