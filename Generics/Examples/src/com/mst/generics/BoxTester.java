package com.mst.generics;

public class BoxTester {
    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<>();
        Integer x = 4;
        integerBox.setT(3);
        System.out.println("Value of the integerBox = " + integerBox.getT());
        integerBox.setT(5);
        System.out.println("Value of the integerBox = " + integerBox.getT());
        Box<String> stringBox = new Box<>();
        stringBox.setT("3.0");
        System.out.println("Value of the stringBox = " + stringBox.getT());
    }
}
