package com.mst.generics.test1;

public class MaxTester {
	public static <T extends Comparable<T>> T findMax(T first, T second) {
		return (first.compareTo(second) > 0)? first : second;
	}
	
	public static <T extends Number> void printNumber(T number) {
		System.out.println(number);
	}

	public static void main(String[] args) {
		
		// AMEEN: Start with something simple
		
		//Example usage with Integer values
       Integer maxInt = findMax(5, 10);
       System.out.println(Maximum Integer  + maxInt);

        //Example usage with Double values
       Double maxDouble = findMax(3.14, 2.71);
       System.out.println(Maximum Double  + maxDouble);
		
		// AMEEN: Make it interesting!
		
		Integer maxInt = findMax(30,findMax(5, 10));
		String maxString = findMax("ameen", findMax(findMax("apple", "banana"), "daud"));
		
		
//		Integer test = findMax(30, "cat");
		
		System.out.println("maxInt = " + maxInt);
		printNumber(maxInt);
		System.out.println("maxString = " + maxString);
		// This won't work because printNumber is expecting a String
		// printNumber(maxString);
		
	}
}

