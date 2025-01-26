package com.mst.generics;

public class FindMaxTester {
    public static <T extends Comparable<T>> T findMax(T first, T second) {
        return (first.compareTo(second) > 0) ? first : second;
    }

    public static void main(String[] args) {
        int maxInt = findMax(5,12);
        System.out.println("maxInt = " + maxInt);
        String maxString = findMax("apple", "orange");
        System.out.println("maxString = " + maxString);
    }
}
