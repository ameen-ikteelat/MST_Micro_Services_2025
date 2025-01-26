package com.mst.generics;

import java.util.ArrayList;
import java.util.List;

public class WildcardBoxExample {

    // Method that accepts a Box with any type
    public static void printBox(Box<?> box) {
        System.out.println("Box contains: " + box.getT());
    }

    public static void main(String[] args) {
        Box<Integer> intBox = new Box<>(123);
        Box<String> strBox = new Box<>("Hello");

        printBox(intBox);
        printBox(strBox);
    }
}
